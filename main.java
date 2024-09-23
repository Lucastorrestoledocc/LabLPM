package LabLPM;

import LabLPM.cadastroFuncionario;
import LabLPM.usuarioFuncionario;
import LabLPM.Funcionario;
import LabLPM.VerificadorAcesso;

public class Main {
    public static void main(String[] args) {
        // Instancia o cadastro de funcionários
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();

        // Cria usuários e funcionários
        UsuarioFuncionario usuario1 = new UsuarioFuncionario("joao.silva", "senha123");
        Funcionario funcionario1 = new Funcionario("João Silva", "12345678900", "joao@empresa.com", usuario1);
        cadastroFuncionario.cadastrarFuncionario(funcionario1);

        UsuarioFuncionario usuario2 = new UsuarioFuncionario("maria.souza", "senha456");
        Funcionario funcionario2 = new Funcionario("Maria Souza", "98765432100", "maria@empresa.com", usuario2);
        cadastroFuncionario.cadastrarFuncionario(funcionario2);

        // Lista os funcionários cadastrados
        cadastroFuncionario.listarFuncionarios();

        //
