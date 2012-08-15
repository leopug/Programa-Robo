
public class VirarParaEsquerda implements InterfaceAcao {

	@Override
	public void acao(Robo robo) {
		robo.setDirecao(robo.getCabecaRobo().virarParaEsquerda());
		System.out.println("Virou para esquerda");
	}

}
