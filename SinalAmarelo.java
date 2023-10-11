public class SinalAmarelo implements State {

    private int tempoDeExibicao = 1;
    private SemaforoContext context;

    @Override
    public void efetuarTransicao() {
        State state = new SinalVermelho();
        context.changeState(state);
    }

    @Override
    public void exibir() {
        System.out.println("Estado atual: sinal amarelo");
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
        return "ATENÇÃO";
    }
    
}
