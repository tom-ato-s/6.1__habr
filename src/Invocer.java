import java.util.HashMap;

class Invocer {
    private final HashMap<String, Command> commandMap = new HashMap<>();

  public void register(String comandName, Command command) {
      commandMap.put(comandName, command);
  }

  public void execute(String comandName) {
      Command command = commandMap.get(comandName);
      if(command == null) {
          throw new IllegalStateException("no command registered for " + comandName);
      }
      command.execute();
  }
//  public String undo(String comandName)  {
//    Command command =
//
//      return lestComandName;
//  }

}
