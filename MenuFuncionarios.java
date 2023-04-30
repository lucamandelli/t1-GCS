import java.util.*;

public class MenuFuncionarios{
    
    private static Funcionario funcionarioAtual;
    private MenuFuncionarios() {}

    public static void menuFuncionarios(Scanner sc){

        ArrayList<Funcionario> funcionariosSuporte = new ArrayList<>();
        Departamento suporte = new Departamento ("Suporte", funcionariosSuporte);
        Funcionario um = new Funcionario((long)001, "Marcelo", suporte, true);
        

        
       
        System.out.println("Escolher Funcionario");
        System.out.println("1: Id:001, Nome: Marcelo, Departamento: Suporte");
        System.out.println("2: Id:001, Nome: Marcelo, Departamento: Suporte");
        System.out.println("3: Id:001, Nome: Marcelo, Departamento: Suporte");
        System.out.println("4: Id:001, Nome: Marcelo, Departamento: Suporte");
        System.out.println("9: Id:001, Nome: Marcelo, Departamento: Suporte");
        int opcao = sc.nextInt();
        
        switch (opcao){
          case 1 -> funcionarioAtual = um;
        }
        }
        }

    