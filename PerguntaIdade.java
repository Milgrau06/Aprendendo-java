import java.util.Scanner;
/*importa a classe Scanner, que é usada 
para ler entradas do usuario via teclado*/

public class PerguntaIdade 
/* define uma classe publica chamada idade, 
em java todo codigo deve estar dentro de uma classe. */
{
    public static void main(String[] args) {
        /* Declara o metodo main, que é o ponto de entrada do progama.
        Ele recebe um array de String  chamado args(argumentos passados
        na execução, que não são usados neste codigo)*/

        Scanner scanner = new Scanner(System.in);
        /* Cria um objeto Scanner chamado scanner para ler dados do teclado
        (System.in). */

        System.out.print("Quantos anos você tem? ");
        // Exibe a mensagem no console sem quebrar a linha 

        int idade = scanner.nextInt();
        // Lê um numero inteiro digitado pelo usuario e o armazena na variavel idade

        System.out.println("Você tem " + idade + " Anos.");
        // exibe a mensagem "voce tem X anos", onde X é o numero inserido pelo usuario.
        
        scanner.close();
        //Fecha o obajeto Scanner para liberar recursos
    }
}