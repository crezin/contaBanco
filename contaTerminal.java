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
        //coloca as informa��o devidas e ent�o poder sair do programa
        //fazer uma solicita��o de saldo
        /*solicita um double de 25 no saldo*/
        String info = "(depois ENTER para o pr�ximo campo)";
        System.out.println("Por favor, digite o n�mero da Ag�ncia !");
        System.out.println(" usu�rio : " + info);
        int numero = scanner.nextInt();

        System.out.println(" nome : " + info);
        String nomeCliente = scanner.next();
        System.out.println(" agencia : "+ info );
        String agencia = scanner.next();
        System.out.println(" saldo : "+ info);
        double saldo= scanner.nextDouble();


        /*imprimi usando concatenar
        * "Ol� [Nome Cliente], obrigado por criar uma conta em nosso banco, sua ag�ncia � [Agencia]
        * , conta [Numero] e seu saldo [Saldo] j� est� dispon�vel para saque".*/

       System.out.println("Ol� " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua ag�ncia � "+ agencia +", conta " + numero + "e seu saldo "+ saldo + " j� est� dispon�vel para saque ");
    }
}
