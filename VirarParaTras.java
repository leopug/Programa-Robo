
public class VirarParaTras implements InterfaceAcao {

	@Override
	public void acao(Robo robo) {
		robo.setDirecao(robo.getCabecaRobo().virarParaTras());
		System.out.println("Virou para tras");
	}

}
