import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaChamados {
    static List<Chamado> chamadosList = new ArrayList<>();

    public ListaChamados() {
        // empty constructor for consistency
    }

    public boolean contains(Chamado chamado){
        return chamadosList.contains(chamado);
    }

    public void remove(Chamado chamado){
        chamadosList.remove(chamado);
    }

    public static void add(Chamado chamado){
        chamadosList.add(chamado);
    }

    public static void add(Equipamento equipamento, String descricao, Funcionario requisitante, Funcionario responsavel, LocalDateTime dataSolicitacao, Status status,
                    String textoResolucao){
        Chamado chamado = new Chamado(equipamento, descricao, requisitante, responsavel, dataSolicitacao, status, textoResolucao);
        add(chamado);
    }

    public List<Chamado> getchamadosList() {
        return chamadosList;
    }
}
