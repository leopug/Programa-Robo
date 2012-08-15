
public class MoveParaTras implements InterfaceMovimento {

	@Override
	public void movimento(Robo robo) {
		robo.setColuna(robo.getColuna());
		robo.setLinha(robo.getLinha()-1);
	}

}
