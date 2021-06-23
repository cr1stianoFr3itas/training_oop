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

