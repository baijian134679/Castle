package castle;

public class HandlerHelp extends Handler {
	public HandlerHelp(Game game) {
		super(game);
	}
	@Override
	public void doCmd(String Word) {
		System.out.println("��·������������������У�go bye help");
        System.out.println("�磺\tgo east");
	}
	
}
