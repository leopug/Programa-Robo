
public class VirarParaDireita implements InterfaceAcao {

	@Override
	public void acao(Robo robo) {
		robo.setDirecao(robo.getCabecaRobo().virarParaDireita());
		System.out.println("Virou para direita");
	}

}
