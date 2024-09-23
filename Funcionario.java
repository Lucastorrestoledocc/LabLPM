package LabLPM;

import LabLPM.usuarioFuncionario;

public class Funcionario {
    private String nome;
    private String cpf;
    private String email;
    private UsuarioFuncionario usuario;

    public Funcionario(String nome, String cpf, String email, usuarioFuncionario usuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public usuarioFuncionario getUsuario() {
        return usuario;
    }
}
