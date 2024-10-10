package Classes;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class PassagemAerea {
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;
    private Date dataHoraVoo;
    private String codigoVoo;
    private CompanhiaAerea companhiaAerea;
    private double valorTarifaBasica;
    private double valorTarifaBusiness;
    private double valorTarifaPremium;
    private double valorPrimeiraBagagem;
    private double valorBagagensAdicionais;
    private String moeda;
    private boolean vooInternacional;
    private static List<PassagemAerea> passagens;

    // Construtor
    public PassagemAerea(Aeroporto origem, Aeroporto destino, Date dataHoraVoo, String codigoVoo, CompanhiaAerea companhia, double valorBasico, double valorBusiness, double valorPremium, double valorPrimeiraBagagem, double valorAdicional, String moeda, boolean internacional) {
        this.aeroportoOrigem = origem;
        this.aeroportoDestino = destino;
        this.dataHoraVoo = dataHoraVoo;
        this.codigoVoo = codigoVoo;
        this.companhiaAerea = companhia;
        this.valorTarifaBasica = valorBasico;
        this.valorTarifaBusiness = valorBusiness;
        this.valorTarifaPremium = valorPremium;
        this.valorPrimeiraBagagem = valorPrimeiraBagagem;
        this.valorBagagensAdicionais = valorAdicional;
        this.moeda = moeda;
        this.vooInternacional = internacional;
    }

    public Aeroporto getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public Aeroporto getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(Aeroporto aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    public Date getDataHoraVoo() {
        return dataHoraVoo;
    }

    public void setDataHoraVoo(Date dataHoraVoo) {
        this.dataHoraVoo = dataHoraVoo;
    }

    public String getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public CompanhiaAerea getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(CompanhiaAerea companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public double getValorTarifaBasica() {
        return valorTarifaBasica;
    }

    public void setValorTarifaBasica(double valorTarifaBasica) {
        this.valorTarifaBasica = valorTarifaBasica;
    }

    public double getValorTarifaBusiness() {
        return valorTarifaBusiness;
    }

    public void setValorTarifaBusiness(double valorTarifaBusiness) {
        this.valorTarifaBusiness = valorTarifaBusiness;
    }

    public double getValorTarifaPremium() {
        return valorTarifaPremium;
    }

    public void setValorTarifaPremium(double valorTarifaPremium) {
        this.valorTarifaPremium = valorTarifaPremium;
    }

    public double getValorPrimeiraBagagem() {
        return valorPrimeiraBagagem;
    }

    public void setValorPrimeiraBagagem(double valorPrimeiraBagagem) {
        this.valorPrimeiraBagagem = valorPrimeiraBagagem;
    }

    public double getValorBagagensAdicionais() {
        return valorBagagensAdicionais;
    }

    public void setValorBagagensAdicionais(double valorBagagensAdicionais) {
        this.valorBagagensAdicionais = valorBagagensAdicionais;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public boolean isVooInternacional() {
        return vooInternacional;
    }

    public void setVooInternacional(boolean vooInternacional) {
        this.vooInternacional = vooInternacional;
    }
    

        // Método para cadastrar passagem
    public static boolean CadastrarPassagem(Aeroporto origem, Aeroporto destino, CompanhiaAerea companhia, Date dataHora, String codigoVoo, double valorBasico, double valorBusiness, double valorPremium, double valorBagagem, double valorAdicional, String moeda, boolean internacional) {
        PassagemAerea passaegem =  new PassagemAerea(origem, destino, dataHora, codigoVoo, companhia, valorBasico, valorBusiness, valorPremium, valorBagagem, valorAdicional, moeda, internacional);
        passagens.add(passaegem);
        return true;

        }

    // Método para calcular tarifa total
    public double CalcularTarifaTotal() {
        return valorTarifaBasica + valorTarifaBusiness + valorTarifaPremium + valorPrimeiraBagagem + valorBagagensAdicionais;
    }

    // Método para converter para dólar (exemplo básico de conversão)
    public double converterParaDolar(double valor) {
        double taxaConversao = 5.0; // Taxa de conversão fictícia
        return valor / taxaConversao;
    }

    public List<PassagemAerea> PesquisarVoo(Aeroporto origem, Aeroporto destino, Date data) {
        List<PassagemAerea> voosDisponiveis = new ArrayList<>();
        for (PassagemAerea passagem : passagens){
            if(dataHoraVoo==data){
            if(passagem.aeroportoOrigem==origem){
                if(passagem.aeroportoDestino == destino){
                    voosDisponiveis.add(passagem);
                }
            }
        }
    }
        return voosDisponiveis;
    }
}
