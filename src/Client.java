//Класс имитирует работу с сомандами
// и объединяя работу между отправителем и получателем




public class Client {

//    static int addCommand(Recever recever, Invocer invocer) {
//       Command command = new Command(recever) {
//       };
//    }
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Мадогускар");//входные данные для проверка работы программы для Recever
        ;  Recever recever = new Recever(stringBuilder); //создаем новый объект StringBuilder  и передаем ему входные данные
        Invocer invocer = new Invocer();  //создается общий один стек команд

        Command comLength = new Length(recever);  // создание объекта команды
        invocer.addCommandtoStech(comLength);  // добавление комманды в стек
        int length = ((Length)comLength).length; //искомая длинна stringBuilder

        System.out.println(length); //печать полученного значени от создания команды
  //      invocer.printSteck();

        Command comIndexOf = new IndexOf(recever, 'М');  // создание объекта команды
        invocer.addCommandtoStech(comIndexOf);  // добавление комманды в стек
        int in = ((IndexOf) comIndexOf).i;  //искомый индекс в stringBuilder

        Command comSubstringBegin = new SubstringBegin(recever, 5);   // создание объекта команды
        invocer.addCommandtoStech(comSubstringBegin); // добавление комманды в стек
        StringBuilder subs = ((SubstringBegin) comSubstringBegin).getSubstringBegin();  // новая созданая часть строки

        System.out.println(recever.getStringBuilder()+ " до команды delite");

        Command comDelete = new Delete(recever, 4, 6);  // создание объекта команды
        invocer.addCommandtoStech(comDelete); // добавление комманды в стек
   //     StringBuilder sbDelete = ((Delete)comDelete).getDelete(); // измененная строка после удаления

        System.out.println(recever.getStringBuilder()+ " после команды delite");



       Command comundo = invocer.undoForCommand();

        System.out.println(recever.getStringBuilder()+ " после команды undo");







//
// Command comCharAt = new CharAt(recever);
//        Command comSubstringBeginEnd = new SubstringBeginEnd(recever);
//        Command comAppend = new Append(recever);
//        Command comInsert = new Insert(recever);
//
//        Command comDeleteCharAt = new DeleteCharAt(recever);
//        Command comReverse = new Reverse(recever);
//        Command comToString_ = new ToString_(recever);




//        System.out.println(invocer);
//        invocer.register("NameCharAt", comCharAt);
//        invocer.register("NameIndexOf", comIndexOf);
//
//        invocer.register("MameSubstringBegin", comSubstringBegin);
//        invocer.register("NameSubstringBeginEnd", comSubstringBeginEnd);
//        invocer.register("NameAppend", comAppend);
//        invocer.register("NameInsert", comInsert);
//        invocer.register("NameDeleteCharAt", comDeleteCharAt);
//        invocer.register("NameReverse", comReverse);
//        invocer.register("NameToString_", comToString_);
//


//        invocer.execute("NameCharAt");

    }
}
