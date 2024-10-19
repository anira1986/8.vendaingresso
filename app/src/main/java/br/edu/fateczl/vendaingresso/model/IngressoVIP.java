/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.vendaingresso.model;

public class IngressoVIP extends Ingresso {
    private String funcao;

    public IngressoVIP() {
        super();
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public float calcularValorFinal(double taxaConveniencia) {
        // Calculando o valor final com 18% a mais para VIP
        float valorBase = super.calcularValorFinal(taxaConveniencia);
        return valorBase + (valorBase * 0.18f); // Acréscimo de 18%
    }
}