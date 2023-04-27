import java.time.LocalDate;
import java.time.LocalDateTime;

public class Chamado {
    private Equipamento equipamento;
    private String descricao;
    private Funcionario requisitante;
    private Funcionario responsavel;

    private String textoResolucao;

    private LocalDateTime dataSolicitacao;

    private Prioridade prioridade;

    private Status status;

    public Chamado(Equipamento equipamento, String descricao, Funcionario requisitante, Funcionario responsavel, LocalDateTime dataSolicitacao, Status status, String textoResolucao, Prioridade prioridade) {
        this.equipamento = equipamento;
        this.descricao = descricao;
        this.requisitante = requisitante;
        this.responsavel = responsavel;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
        this.textoResolucao = textoResolucao;
        this.prioridade = prioridade;
        ListaChamados.add(equipamento, descricao, requisitante, responsavel, dataSolicitacao, status, textoResolucao, prioridade);
    }

    public String getTextoResolucao() {
        return textoResolucao;
    }

    public void setTextoResolucao(String textoResolucao) {
        this.textoResolucao = textoResolucao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public Funcionario getRequisitante() {
        return requisitante;
    }

    public void setRequisitante(Funcionario requisitante) {
        this.requisitante = requisitante;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
}
