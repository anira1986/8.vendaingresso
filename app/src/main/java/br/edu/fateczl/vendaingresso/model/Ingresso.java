/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.vendaingresso.model;

public class Ingresso {

    private String id;
    private float valor;

    public Ingresso() {
        super();
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float calcularValorFinal(double taxaConveniencia) {
        // Fórmula corrigida para cálculo sem VIP
        return (float) (valor + (valor * taxaConveniencia / 100));
    }
}