package LabLPM;

public class usuarioFuncionario {
    private String login;
    private String senha;

    public usuarioFuncionario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean login(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
