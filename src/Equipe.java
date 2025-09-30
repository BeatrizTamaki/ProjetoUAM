import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nomeEquipe;
    private String descricao;
    private List <Usuario> membro;
    private List <Projeto> projetos;

    public Equipe(String nomeEquipe, String descricao) {
        this.nomeEquipe = nomeEquipe;
        this.descricao = descricao;
        this.membro = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario){
        membro.add(usuario);
    }

    public void adicionarProjeto(Projeto projeto){
        projetos.add(projeto);
    }

    public void exibirInfo(){
        System.out.println("Equipe: " + nomeEquipe + " | Descricao: " + descricao);

        System.out.println("Membros: ");
        for (Usuario u:membro){
            System.out.println(" - " + u.getNomeCompleto() + " (" + u.getPerfil() + ")" );
        }

        System.out.println("Projeto: ");
        for (Projeto p:projetos){
            System.out.println(" - " + p.getNomeProjeto() + " (" + p.getGerente().getNomeCompleto() + ")");
        }
    }

    public String getNomeEquipe(){
        return nomeEquipe;
    }
}
