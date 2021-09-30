//Класс имитирует работу с сомандами
// и объединяя работу между отправителем и получателем

public class Client {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Мадогускар");//входные данные для проверка работы программы для Recever
        Recever recever = new Recever(stringBuilder); //создаем новый объект StringBuilder  и передаем ему входные данные
        Invocer invocer = new Invocer();  //создается общий один стек команд


        Command comLength = new Length(recever);  // создание объекта команды
        invocer.addCommandToStack(comLength);  // добавление комманды в стек
        int length = ((Length)comLength).length; //искомая длинна stringBuilder
        System.out.println(length); //печать полученного значени от создания команды


        Command comIndexOf = new IndexOf(recever, 'М');  // создание объекта команды
        invocer.addCommandToStack(comIndexOf);  // добавление комманды в стек
        int in = ((IndexOf) comIndexOf).i;  //искомый индекс в stringBuilder

        Command comSubstringBegin = new SubstringBegin(recever, 5);   // создание объекта команды
        invocer.addCommandToStack(comSubstringBegin); // добавление комманды в стек
        StringBuilder subs = ((SubstringBegin) comSubstringBegin).getSubstringBegin();  // новая созданая часть строки
        System.out.println(recever.getStringBuilder()+ " до команды delite");

        Command comDelete = new Delete(recever, 4, 6);  // создание объекта команды
        invocer.addCommandToStack(comDelete); // добавление комманды в стек
        System.out.println(recever.getStringBuilder()+ " после команды delite");

       Command comundo = invocer.undoForCommand();
        System.out.println(recever.getStringBuilder()+ " после команды undo");

        Command comAppend = new Append(recever, 'F');//создание объекта команды
        invocer.addCommandToStack(comAppend); // добавление команды в стек
        System.out.println(recever.getStringBuilder() + " после команды append");

        invocer.undoForCommand();
        System.out.println(recever.getStringBuilder() + " после команды undo");


        Command comReverse = new Reverse(recever);
        invocer.addCommandToStack(comReverse);
        System.out.println(recever.getStringBuilder() + " после команды reverse");

        invocer.undoForCommand();
        System.out.println(recever.getStringBuilder() + " после команды undo");

   }
}
