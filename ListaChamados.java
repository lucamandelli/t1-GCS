import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaChamados {
    static List<Chamado> chamadosList = new ArrayList<>();

    private ListaChamados() {
        // empty constructor for consistency
    }

    public static void removeByEquipamento(long id) {
        chamadosList.removeIf(chamado -> chamado.getEquipamento().getId().equals(id));
    }

    public static void removeByDescricao(String descricao) {
        chamadosList.removeIf(chamado -> chamado.getDescricao().equals(descricao));
    }

    public static void removeByRequisitante(long id) {
        chamadosList.removeIf(chamado -> chamado.getRequisitante().getId().equals(id));
    }

    public static void removeByResponsavel(long id){
        chamadosList.removeIf(chamado -> chamado.getResponsavel().getId().equals(id));
    }

    public static void removeByDataSolicitacao(String dataSolicitacao){
        chamadosList.removeIf(chamado -> chamado.getDataSolicitacao().equals(LocalDateTime.parse(dataSolicitacao)));
    }

    public static void removeByStatus(String status){
        chamadosList.removeIf(chamado -> chamado.getStatus().equals(Status.valueOf(status)));
    }

    public static void removeByTextoResolucao(String textoResolucao){
        chamadosList.removeIf(chamado -> chamado.getTextoResolucao().equals(textoResolucao));
    }

    // standard methods
    public static boolean contains(Chamado chamado){
        return chamadosList.contains(chamado);
    }

    public static void remove(Chamado chamado){
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

    public static List<Chamado> getChamadosList() {
        return chamadosList;
    }
}
