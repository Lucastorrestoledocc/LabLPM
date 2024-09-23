package LabLPM;

import java.util.Date;

public class PassagemAerea {
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;
    private Date dataHoraVoo;
    private String codigoVoo;
    private CompanhiaAerea companhiaAerea;
    private float tarifaBasica;
    private float tarifaBusiness;
    private float tarifaPremium;
    private float valorPrimeiraBagagem;
    private float valorBagagensAdicionais;
    private String moeda;

    public PassagemAerea(Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino, Date dataHoraVoo, 
                         String codigoVoo, CompanhiaAerea companhiaAerea, float tarifaBasica, 
                         float tarifaBusiness, float tarifaPremium, float valorPrimeiraBagagem, 
                         float valorBagagensAdicionais, String moeda) {
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.dataHoraVoo = dataHoraVoo;
        this.codigoVoo = codigoVoo;
        this.companhiaAerea = companhiaAerea;
        this.tarifaBasica = tarifaBasica;
        this.tarifaBusiness = tarifaBusiness;
        this.tarifaPremium = tarifaPremium;
        this.valorPrimeiraBagagem = valorPrimeiraBagagem;
        this.valorBagagensAdicionais = valorBagagensAdicionais;
        this.moeda = moeda;
    }

    public float calcularTarifaTotal() {
        return tarifaBasica + tarifaBusiness + tarifaPremium;
    }

    public float getValorPrimeiraBagagem() {
        return valorPrimeiraBagagem;
    }

    public float getValorBagagensAdicionais() {
        return valorBagagensAdicionais;
    }
}
