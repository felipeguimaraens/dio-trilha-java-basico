import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Terminal conta iniciado");
        System.out.println("Para iniciar vamos criar uma conta:\n");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Número da conta: ");
        Integer numeroConta = entrada.nextInt();
        entrada.nextLine(); // nextInt não lê o \n, sendo necessário pular a linha manualmente

        System.out.print("Número da agência: ");
        String numeroAgencia = entrada.nextLine();

        System.out.print("Nome cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Saldo: ");
        Double saldoConta = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " 
        + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
