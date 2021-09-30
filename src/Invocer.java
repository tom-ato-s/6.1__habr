//Класс содержит стек всех выполненых команд(объекты команд)
//в стек команды можно добавлять и извлекать команду из стека
//так же печвтать текущее содержание стека?? не до конца сделано
// и возвращать прежнее состояние получателя,
// все без обращения к получателю
//работа только с отправителем

import java.util.EmptyStackException;
import java.util.Stack;

class Invocer {

private Stack<Command> stackCommands = new Stack<>();  //создание стека команд

public void addCommandtoStech(Command command) { //добавление комманды в стек
    stackCommands.add(command);
}

public Command undoForCommand() {  //извлечение последней занесенной команды из стека
    try{
  stackCommands.pop().undo();
    } catch (EmptyStackException e) {
        System.out.println("This stack is empty." + e);
    }return stackCommands.pop();
}

public void printSteck() {  //печать текущего списка команд в стеке
    System.out.println(stackCommands.toArray().toString());
    }
}
