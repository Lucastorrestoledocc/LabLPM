package LabLPM;

public class Bilhete {
    private Passageiro passageiro;
    private PassagemAerea[] voos;
    private String documento;

    public Bilhete(Passageiro passageiro, PassagemAerea[] voos, String documento) {
        this.passageiro = passageiro;
        this.voos = voos;
        this.documento = documento;
    }

    public String emitirBilhete() {
        return "Bilhete emitido para " + passageiro.getNome() + " com " + voos.length + " voo(s).";
    }
}
