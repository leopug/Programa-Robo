
public class MoveParaEsquerda implements InterfaceMovimento {

	@Override
	public void movimento(Robo robo) {
		robo.setColuna(robo.getColuna()-1);
		robo.setLinha(robo.getLinha());
	}

}
