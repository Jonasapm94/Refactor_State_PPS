public interface State {
    public void setContext(SemaforoContext context);
    public void efetuarTransicao();
    public void exibir();
    public int getTempoDeExibicao();
    public String toString();
    public String getAcao();
}
