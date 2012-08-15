
public class MoveParaFrente implements InterfaceMovimento {

	@Override
	public void movimento(Robo robo) {
		robo.setColuna(robo.getColuna());
		robo.setLinha(robo.getLinha()+1);
	}

}
