package LabLPM;

public class VerificadorAcesso {

    // Método para verificar se um funcionário está autorizado
    public boolean verificarAcesso(Funcionario funcionario, String login, String senha) {
        UsuarioFuncionario usuario = funcionario.getUsuario();
        if (usuario != null) {
            return usuario.login(login, senha);
        }
        return false; // Se o funcionário não tem usuário registrado
    }
}
