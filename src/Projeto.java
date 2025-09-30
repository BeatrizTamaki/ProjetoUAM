public class Projeto {

    private String nomeProjeto;
    private String descricao;
    private String dataInicio;
    private String dataTerminoPrevista;
    private String status;
    private Usuario gerente;

    public Projeto(String nomeProjeto, String descricao, String dataInicio, String dataTerminoPrevista, String status, Usuario gerente) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.status = status;
        this.gerente = gerente;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public Usuario getGerente() {
        return gerente;
    }

    public void exibirInfo(){
        System.out.println("Projeto: " + nomeProjeto + " | Status: " + status);
        System.out.println("Gerente Responsável: " + gerente.getNomeCompleto());
    }
}
