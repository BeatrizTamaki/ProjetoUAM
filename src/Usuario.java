public class Usuario {
    private String nomeCompleto;
    private String CPF;
    private String email;
    private String cargo;
    private String login;
    private String senha;
    private String perfil; // administrador, gerente ou colaborador

    public Usuario (String nomeCompleto, String CPF, String email, String cargo,
                    String login, String senha, String perfil){

        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public String getPerfil(){
        return perfil;
    }

    public void exibirInfo(){
        System.out.println("Usuário: " + nomeCompleto + " | Cargo: " + cargo + " | Perfil : " + perfil);
    }

}
