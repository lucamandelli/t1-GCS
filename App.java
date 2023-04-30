
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //objetos pare testes
        ArrayList<Funcionario> funcionariosSuporte = new ArrayList<>(); //para instanciar departamento é necessaro o arraylist
        Departamento suporte = new Departamento ("Suporte", funcionariosSuporte);
        ArrayList<Funcionario> funcionariosVendas = new ArrayList<>();
        Departamento vendas = new Departamento ("Vendas", funcionariosVendas);// para instanciar Funcionario é necessário criar o departamento
        ArrayList<Funcionario> funcionariosRH = new ArrayList<>();
        Departamento RH = new Departamento ("Recursos Humanos", funcionariosRH);
        Funcionario um = new Funcionario((long)001, "Marcelo", suporte, true);
        Funcionario dois = new Funcionario((long)002, "Pedro", suporte, true);
        Funcionario tres = new Funcionario((long)003, "Artur", RH, false);
        Funcionario quatro = new Funcionario((long)004, "Jose", RH, false);
        Funcionario cinco = new Funcionario((long)005, "Maria", vendas, false);
        Funcionario seis = new Funcionario((long)005, "Fulana", vendas, false);
        
        Funcionario usuarioAtual = seis; //usario logado no momento

        System.out.println("Escolher Funcionario");
        System.out.println("1: " + um.toString());
        System.out.println("2: " + dois.toString() );
        System.out.println("3: " + tres.toString());
        System.out.println("4: " + quatro.toString());
        System.out.println("5: " + cinco.toString());
        System.out.println("6: " + seis.toString());
        int opcao = sc.nextInt();
    
    switch (opcao){
        case 1 -> usuarioAtual = um;
        case 2 -> usuarioAtual = dois;
        case 3 -> usuarioAtual = tres;
        case 4 -> usuarioAtual = quatro;
        case 5 -> usuarioAtual = cinco;
        case 6 -> usuarioAtual = seis;
        default -> System.out.println("Entrada inválida. Tente novamente.");
        }

        System.out.println("Usuário Atual: " + usuarioAtual);
    
    
      
        boolean encerrado = false;
        do {
            //SOMENTE FUNCIONARIOS SUPORTE DEVEM TER ACESSO A ALGUMAS FUNCIONALIADADES
            System.out.println("Escolher Funcionalidade");
            System.out.println("1: Abrir novo chamado");
            System.out.println("2: Atualizar status do chamado");
            System.out.println("3: Mover equipamento");
            System.out.println("4: Pesquisar equipamento pela descrição");
            System.out.println("9: Modificar a lista de chamados");
            //Fazer as outras
            System.out.println("0: Encerrar Programa");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 0 -> //case de outras funcionalidades
                        encerrado = true;

                case 9 -> MenuListaChamados.showMenu();

                default -> System.out.println("Entrada inválida. Tente novamente.");
            }
        } while (!encerrado);
    }
}