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
        int numero = scanner.nextInt();

        System.out.println(" nome : " + info);
        String nomeCliente = scanner.next();
        System.out.println(" agencia : "+ info );
        String agencia = scanner.next();
        System.out.println(" saldo : "+ info);
        double saldo= scanner.nextDouble();


        /*imprimi usando concatenar
        * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia]
        * , conta [Numero] e seu saldo [Saldo] já está disponível para saque".*/

       System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + "e seu saldo "+ saldo + " já está disponível para saque ");
    }
}
