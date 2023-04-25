import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuListaChamados {

    private MenuListaChamados() {
        // empty constructor for consistency
    }

    public void showMenu(int menuOption){
        switch (menuOption) {
            case 1 -> removeByEquipamento();
            case 2 -> removeByDescricao();
            case 3 -> removeByRequisitante();
            case 4 -> removeByResponsavel();
            case 5 -> removeByDataSolicitacao();
            case 6 -> removeByStatus();
            case 7 -> removeByTextoResolucao();
            default -> throw new IllegalArgumentException("Opção inválida.");
        }
    }

    private void removeByEquipamento(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLong()){
            ListaChamados.removeByEquipamento(scanner.nextLong());
        }
    }

    private void removeByDescricao(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            ListaChamados.removeByDescricao(scanner.nextLine());
        }
    }

    private void removeByRequisitante(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLong()){
            ListaChamados.removeByRequisitante(scanner.nextLong());
        }
    }

    private void removeByResponsavel(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLong()){
            ListaChamados.removeByResponsavel(scanner.nextLong());
        }
    }

    private void removeByDataSolicitacao(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            ListaChamados.removeByDataSolicitacao(LocalDateTime.parse(scanner.nextLine()));
        }
    }

    private void removeByStatus(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            ListaChamados.removeByStatus(scanner.nextLine());
        }
    }

    private void removeByTextoResolucao(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            ListaChamados.removeByTextoResolucao(scanner.nextLine());
        }
    }
}
