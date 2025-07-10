package Command;

public class CommandActionStep implements CommandAction {
    @Override
    public void applyAction() {
        System.out.println("step");
    }
}
