public class SinalVermelho implements State{

    private int tempoDeExibicao = 3;
    private SemaforoContext context;

    @Override
    public void efetuarTransicao() {
        context.changeState(new SinalVerde());
    }

    @Override
    public void exibir() {
        System.out.println("Estado atual: sinal vermelho");
    }

    @Override
    public void setContext(SemaforoContext context) {
        this.context = context;
    }

    @Override
    public int getTempoDeExibicao() {
        return this.tempoDeExibicao;
    }

    @Override
    public String getAcao() {
        return "PARE";
    }
    
}
