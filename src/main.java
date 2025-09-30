public class main {
    public static void main (String[] args){
        Usuario gerente = new Usuario("Beatriz Tamaki", "23456789190", "beatriz@gmail.com",
                "Gerente de projetos", "beatriz.tamaki", "12345", "Gerente");

        Usuario adm = new Usuario("João Braga", "14567891086", "joao@gmail.com",
                "Administrador de sistemas", "joao.braga", "2345", "Administrador");

        Usuario colaborador = new Usuario("Givanna Silva", "20183938927", "giovanna@gmail.com",
                "Analista", "giovanna.silva", "3456", "Colaborador");

        Projeto projetone = new Projeto("Melhorias Já!", "Sistema Novo de Melhorias com Java",
                "25/09/2025", "02/10/2025", "Em andamento" , gerente);

        Equipe equipe1 = new Equipe("Equipe One", "Equipe de desenvolvimento em Java");
        equipe1.adicionarMembro(adm);
        equipe1.adicionarMembro(colaborador);
        equipe1.adicionarMembro(gerente);
        equipe1.adicionarProjeto(projetone);

        adm.exibirInfo();
        gerente.exibirInfo();
        colaborador.exibirInfo();

        projetone.exibirInfo();

        equipe1.exibirInfo();
    }
}
