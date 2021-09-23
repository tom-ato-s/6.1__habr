
import java.util.EmptyStackException;
import java.util.Stack;

class Invocer {

private Stack<Command> stackCommands = new Stack<>();

public void addCommandtoStech(Command command) {
    stackCommands.add(command);
}

public Command undo() {
    try{
  stackCommands.pop();
    } catch (EmptyStackException e) {
        System.out.println("This stack is empty." + e);
    }return stackCommands.pop();
}
}
