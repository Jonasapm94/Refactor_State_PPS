public class SinalVerde implements State {
    private SemaforoContext context;
    private int tempoDeExibicao = 5;

    @Override
    public void setContext(SemaforoContext context) {
        this.context = context;
    }

    @Override
    public void efetuarTransicao() {
        State state = new SinalAmarelo();
        context.changeState(state);

    }

    @Override
    public void exibir() {
        System.out.println("Estado atual: sinal verde");
    }

    @Override
    public int getTempoDeExibicao() {
        return this.tempoDeExibicao;
    }

    @Override
    public String getAcao() {
        return "SIGA";
    }
    
}
