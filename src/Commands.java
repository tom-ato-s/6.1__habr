//import java.util.Stack;
//
// классы команд
//каждый класс - шаблон создания комманды
//работает только с получателем,
// конечным объектом над которым производятся действия


class Length implements Command {  // класс-шаблон для создания объекта комманды length()
    private final Recever recever;
    int length;

    public Length(Recever recever) {
        this.recever = recever;
        length = recever.length();
    }

    @Override
    public void undo() {  //отменение изменений произведенных данной командой, в данном случае ничего не меняется, но значение повторно расчитывавется
        recever.length();
    }
}

class IndexOf implements Command {   // класс-шаблон для создания объекта комманды  indexOf(ch);
    private final Recever recever;
    private char ch;
    public int i; //индекс

    public IndexOf(Recever recever, char ch) { //конструктор
        this.recever = recever;
        i = recever.indexOf(ch);
    }
    @Override
    public void undo() {     //отменение изменений произведенных данной командой, в данном случае ничего не меняется, но значение повторно расчитывавется
        i = recever.indexOf(ch);
        }
}

class SubstringBegin implements Command {  // класс-шаблон для создания объекта комманды  substring(i)
        private final Recever recever;
        private int i; // первый индекс подстроки
        StringBuilder sub; // подстрока
        StringBuilder reReceverSubctring; //

    public SubstringBegin(Recever recever, int i) {
        this.recever = recever;
        this.i = i;
        reReceverSubctring = recever.getStringBuilder();
        sub = recever.substring(i);

    }

    public StringBuilder getSubstringBegin() {
        return sub;
    }

    @Override
    public void undo() {   //отменение изменений произведенных данной командой
        recever.setStringBuilder(reReceverSubctring);
    }
}

class Delete implements Command { // класс-шаблон для создания объекта комманды delete(start, fin)
    private final Recever recever;
    private int start;
    private int fin;
    static StringBuilder preResever = new StringBuilder();

    Delete(Recever recever, int start, int fin) { //конструктор для создания шаблона
        this.recever = recever;
        this.start = start;
        this.fin = fin;
        preResever = recever.substring(start, fin); // удаленная часть строки
        recever.setStringBuilder( recever.delete(start, fin));
    }

    @Override
    public void undo() {    //отменение изменений произведенных данной командой
        StringBuilder temp = new StringBuilder();
        temp.append(recever.substring(0, start));
        temp.append(preResever);
        temp.append(recever.substring(start, recever.length()));
        recever.setStringBuilder(temp);
    }
}

class Append implements Command {
    private final Recever recever;
    private char ch;
    char tempCh;

    Append(Recever recever, char ch)  { // команда добавления бкувы в конец строки
        this.recever = recever;
        this.ch = ch;
        tempCh = ch;
        recever.append(ch);
    }

    @Override
    public void undo() {
        int lestIndex = recever.length()-1;
        recever.getStringBuilder().deleteCharAt(lestIndex);
    }
}

class Reverse implements Command {
    private final Recever recever;
    private StringBuilder stringBuilder;
    private StringBuilder preRevers = new StringBuilder();

    Reverse(Recever recever) {
        this.recever = recever;
        stringBuilder = recever.getStringBuilder();
        preRevers.append(stringBuilder);
        recever.reverse();
    }

    @Override
    public void undo() {
        recever.setStringBuilder(preRevers);
    }
}
