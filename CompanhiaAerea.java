package LabLPM;

public class CompanhiaAerea {
    private String nome;
    private String codigo;
    private String razaoSocial;
    private String cnpj;

    public CompanhiaAerea(String nome, String codigo, String razaoSocial, String cnpj) {
        this.nome = nome;
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
}

