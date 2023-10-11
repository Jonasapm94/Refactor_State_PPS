

public class Main {

	public static void main(String[] args) {
		Sinal estado = Sinal.VERMELHO;
		System.out.println(estado.getAcao());
		
		SemaforoContext epitacio = new SemaforoContext(new SinalVerde());
		System.out.println("Estado Atual: " + epitacio.getEstadoAtual());
		System.out.println("Significado : " + epitacio.getEstadoAtual().getAcao());
		//epitacio.exibir();
		
		epitacio.start();
		
		System.out.println("Fim da simulacao.");
		
		System.out.println(epitacio);
				

	}

}
