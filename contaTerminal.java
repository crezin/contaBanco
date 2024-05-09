import java.util.Locale;
import java.util.Scanner;

/**
 * @author Cremilson
 *
 */


public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //crias as vairaveis como nome,agencia,saldo pra receber os valores  e cria um if e else caso n
        //coloca as informação devidas e então poder sair do programa
        //fazer uma solicitação de saldo
        /*solicita um double de 25 no saldo*/
        String info = "(depois ENTER para o próximo campo)";
        System.out.println("Por favor, digite o número da Agência !");
        System.out.println(" usuário : " + info);
        int usuário = scanner.nextInt();

        System.out.println(" nome : " + info);
        String nome = scanner.next();
        System.out.println(" conta : "+ info );
       String  Numero = scanner.next();
        System.out.println(" saldo : "+ info);
        double valorSolicitado = scanner.nextDouble();
               double saldo = 1000;


        if (saldo > valorSolicitado){
            saldo = saldo - valorSolicitado;
        }
        else {
            System.out.println("saldo insuficiente");
        }



        /*imprimi usando concatenar
        * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia]
        * , conta [Numero] e seu saldo [Saldo] já está disponível para saque".*/

       System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é "+ usuário +", conta " + Numero+ "e seu saldo "+ valorSolicitado + " já está disponível para saque ");
    }
}
