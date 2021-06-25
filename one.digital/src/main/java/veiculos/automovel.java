/*
   Dev. Cristiano Freitas
   email: junior.brown.eda@gmail.com
   Data de inicio do projeto: 18/06/2021
   Data de "Final" do projeto: 18/06/2021
   

*/


package veiculos;

public class automovel {

      public automovel(String marca){
           this.marca = marca;

       }

       private String marca;
       private String ano;
       private String modelo;
       private String variante;
       private Double valorVenal;

       public String getMarca(){ return marca;}
       public String getAno(){ return ano;}
       public String getModelo(){ return modelo;}
       public String getVariante(){ return variante;}
       public Double getValorVenal(){ return valorVenal;}
   /* public void setMarca(String marca) {
        this.marca = marca;
    }*/

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calculoipva() {return this.valorVenal * 0.1;}

}

