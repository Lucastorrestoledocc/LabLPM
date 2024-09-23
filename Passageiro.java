package LabLPM;

public class Passageiro {
    private String nome;
    private String ultimoSobrenome;
    private String documento;

    public Passageiro(String nome, String ultimoSobrenome, String documento) {
        this.nome = nome;
        this.ultimoSobrenome = ultimoSobrenome;
        this.documento = documento;
    }

    public String getNome() {
        return nome + " " + ultimoSobrenome;
    }

    public String getDocumento() {
        return documento;
    }
}
