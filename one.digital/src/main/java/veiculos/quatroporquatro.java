package veiculos;

public class quatroporquatro extends automovel{
    public quatroporquatro(String marca) {
        super(marca);
    }

    private String tracao;

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public double calculoipva() {return this.getValorVenal() * 2.3;}


}




