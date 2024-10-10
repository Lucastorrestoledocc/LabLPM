package Classes;

import java.util.List;

public class Compra {
    private List<PassagemAerea> passagens; 
    private double valorTotal; 
    private double remuneracaoAgencia; 

    // Construtor!
    public Compra(List<PassagemAerea> passagens, double remuneracaoAgencia) {
        this.passagens = passagens;
        this.remuneracaoAgencia = remuneracaoAgencia;
        this.valorTotal = calcularValorTotal(); 
    }

    // Getters e Setters!
    public List<PassagemAerea> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<PassagemAerea> passagens) {
        this.passagens = passagens;
        this.valorTotal = calcularValorTotal(); 
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getRemuneracaoAgencia() {
        return remuneracaoAgencia;
    }

    public void setRemuneracaoAgencia(double remuneracaoAgencia) {
        this.remuneracaoAgencia = remuneracaoAgencia;
    }

    private double calcularValorTotal() {
        double total = 0;
        for (PassagemAerea passagem : passagens) {
            total += passagem.CalcularTarifaTotal(); 
        }
        return total; 
    }

    public void RealizarCompra() {
        System.out.println("Compra realizada com sucesso! Valor total: " + valorTotal);
    }

    public double CalcularRemuneracao() {
        return valorTotal * remuneracaoAgencia; 
    }
}
