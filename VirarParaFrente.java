
public class VirarParaFrente implements InterfaceAcao {

	@Override
	public void acao(Robo robo) {
		robo.setDirecao(robo.getCabecaRobo().virarParaFrente());
		System.out.println("Virou para frente");
	}

}
