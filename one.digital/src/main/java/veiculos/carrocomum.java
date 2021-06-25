/*
   Dev. Cristiano Freitas
   email: junior.brown.eda@gmail.com
   Data de inicio do projeto: 18/06/2021
   Data de "Final" do projeto: 18/06/2021
   

*/


package veiculos;

public class carrocomum extends automovel {
    public carrocomum(String marca) {
        super(marca);
    }

    private String localtracao;


    public String getLocaltracao() {
        return localtracao;
    }



    public void setLocaltracao(String localtracao) {
        this.localtracao = localtracao;
    }

    public double calculoipva() {return this.getValorVenal() * 0.2;}

}

