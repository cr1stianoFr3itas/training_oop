/*
   Dev. Cristiano Freitas
   email: junior.brown.eda@gmail.com
   Data de inicio do projeto: 22/06/2021
   Data de "Final" do projeto: 23/06/2021
   

*/


package atividade;

public class segundoSemestre implements descontoAvista, descontoAprazo {

    //VARIAVEIS

    private Double valorDoProduto;
    private Double valorDescontoAvista;
    private Double valorDescontoAprazo;
    private Double vendasSegundoSemestre;

    //GET

    public Double getValorDoProduto() { return valorDoProduto; }

    public Double getValorDescontoAprazo() {
        return valorDescontoAprazo = descontoDoValorAprazo;
    }

    public Double getValorDescontoAvista() {
        return valorDescontoAvista = descontoDoValorAvista;
    }


    public Double getVendasSegundoSemestre() {
        return vendasSegundoSemestre;
    }

    //SET

    public void setValorDoProduto(Double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public void setVendasSegundoSemestre(Double vendasSegundoSemestre) {
        this.vendasSegundoSemestre = vendasSegundoSemestre;
    }

}
