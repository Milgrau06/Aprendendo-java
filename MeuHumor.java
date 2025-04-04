import java.util.Scanner; //importa a classe Scanner para entrada do usuário

public class MeuHumor{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //cria o scanner para entrada de usuario 


        System.out.print("=========================================\n");
        System.out.print("  Como Você esta se Sentindo Hoje?   \n");
        System.out.println("=========================================\n");
        System.out.print(" A) Estou Feliz! =) \n");
        System.out.print(" B) Com Preguiça / com sono -_- \n");
        System.out.println(" C) Estou triste =( \n");
        System.out.print("Escolha uma opção (A, B ou C): \n");

        char opcao = scanner.next().charAt(0); //lê o primeiro caractere digitado pelo usuario
        scanner.close(); // Fecha o Scanner apos o uso 

        switch (Character.toUpperCase(opcao)){
            case 'A':
                System.out.println("Que bom que você esta Feliz! =) ");
                break;
            case 'B':
                System.out.println("Aah se anima vai, a vida é muito linda para ficar desanimado =/ ");
                break; 
            case 'C':
                System.out.println("Ah que pena! Melhoras, Eu estou torcendo por você! :) ");
                break;
                default:
                    System.out.println("Opção invalida, Tente novamente. ");


        }
      }
    }