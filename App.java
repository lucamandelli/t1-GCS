
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ESCOLHER FUNCIONARIO ANTES
        boolean encerrado = false;
        do {
            //SOMENTE FUNCIONARIOS SUPORTE DEVEM TER ACESSO A ALGUMAS FUNCIONALIADADES
            System.out.println("Escolher Funcionalidade");
            System.out.println("1: Abrir novo chamado");
            System.out.println("2: Atualizar status do chamado");
            System.out.println("3: Mover equipamento");
            System.out.println("4: Pesquisar equipamento pela descrição");
            //Fazer as outras
            System.out.println("0: Encerrar Programa");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 0: encerrado = true; break;
                //case de outras funcionalidades
                default: System.out.println("Entrada inválida. Tente novamente.");
            }
        } while (!encerrado);
    }
}