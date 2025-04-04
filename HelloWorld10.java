import java.util.Scanner;//importa a classe Scanner para entrada do usuário

public class HelloWorld10{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //cria o scanner para entrada de usuario 


        System.out.print("=========================================\n");
        System.out.print("  Seja Bem Vindo ao sistema academico   \n");
        System.out.println("=========================================\n");
        System.out.print(" A) Faz o L \n");
        System.out.print(" B) Lula Livre\n");
        System.out.println(" C) Bostil de merda\n");
        System.out.print("Escolha uma opção (A, B ou C): \n");

        char opcao = scanner.next().charAt(0); //lê o primeiro caractere digitado pelo usuario
        scanner.close(); // Fecha o Scanner apos o uso 

        switch (Character.toUpperCase(opcao)){
            case 'A':
                System.out.println("Você escolheu: Faz o L");
                break;
            case 'B':
                System.out.println("Voce escolheu: Lula livre");
                break; 
            case 'C':
                System.out.println("Você escolheu: Bostil de merda");
                break;
                default:
                    System.out.println("Opção invalida, Tente novamente. ");


        }
      }
    }
