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
        int usu�rio = scanner.nextInt();

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
        * "Ol� [Nome Cliente], obrigado por criar uma conta em nosso banco, sua ag�ncia � [Agencia]
        * , conta [Numero] e seu saldo [Saldo] j� est� dispon�vel para saque".*/

       System.out.println("Ol� " + nome + " obrigado por criar uma conta em nosso banco, sua ag�ncia � "+ usu�rio +", conta " + Numero+ "e seu saldo "+ valorSolicitado + " j� est� dispon�vel para saque ");
    }
}
