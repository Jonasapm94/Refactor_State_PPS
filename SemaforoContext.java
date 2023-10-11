import java.util.HashMap;
import java.util.Map;

import java.lang.Thread;

public class SemaforoContext {
	
	private State estado;
	
	public SemaforoContext(State initialState) {
        this.estado = initialState;
        estado.setContext(this);
	}

	public State getEstadoAtual() {
		return this.estado;
	}
	
	public void exibir() {
		estado.exibir();
	}
	
	public void efetuarTransicao() {
	    estado.efetuarTransicao();
	}
	
	public void start() {
		this.start(10);
	}

	public void start(int time_in_seconds) {
		while(time_in_seconds > 0) {
			System.out.println("Tempo restante da simulacao: " + time_in_seconds + " segundos");
			System.out.println( getEstadoAtual() + " : " + estado.getTempoDeExibicao() + " segundos.");
			exibir();
			time_in_seconds -= estado.getTempoDeExibicao();
			showVisorRegressivo();
			efetuarTransicao();
			System.out.println();
			
		}
		
	}
	
    public void showVisorRegressivo() {
        for (int i = this.estado.getTempoDeExibicao(); i >0 ; i--) {
			System.out.println(i + " segundo(s)");
			try {
				// 1000 milisegundos equivale a 1 segundo
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }

	// public String toString() {
	// 	String s = "";
	// 	s += "Numero Tombamento: " + numTombamento + "\n";
	// 	s += "Tempo de permanencia em cada estagio:\n";
	// 	s += Sinal.VERMELHO + " : " + transicao.get(Sinal.VERMELHO) + " segundos\n";
	// 	s += Sinal.AMARELO + " : " + transicao.get(Sinal.AMARELO) + " segundos\n";
	// 	s += Sinal.VERDE + " : " + transicao.get(Sinal.VERDE) + " segundos\n";
	// 	return s;
	// }

	public void changeState(State state) {
        state.setContext(this);
        this.estado = state;
	}
	


}
