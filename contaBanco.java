import java.util.Locale;
import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nome;
        double saldo;


        Scanner dados = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("por favor digite o numero agencia?");
        agencia = dados.next();

        System.out.println(" nome do cliente ? ");
        nome = dados.next();


        System.out.println("numero da conta?");
        numero = dados.nextInt();

        System.out.println("saldo?");
        saldo = dados.nextDouble();

        System.out.println("ola ".concat(nome) + " obrigado por criar uma conta em nosso banco, sua agencia e "
                .concat(agencia) + " conta " + numero + " e seu saldo e " + saldo + " ja esta disponivel para saque .");


    }
}