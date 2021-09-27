//import java.util.Stack;
//
// классы команд
//каждый класс - шаблон создания комманды
//работает только с получателем,
// конечным объектом над которым производятся действия


//////////////////////////////////////////////////////////////////////////////
class Length implements Command {  // класс-шаблон для создания объекта комманды length()
        private final Recever recever;
    int length;
   public Length(Recever recever) {
        this.recever = recever;
        length = recever.length();
    }

        @Override
        public void unto() {  //отменение изменений произведенных данной командой, в данном случае ничего не меняется, но значение повторно расчитывавется
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
        public void unto() {     //отменение изменений произведенных данной командой, в данном случае ничего не меняется, но значение повторно расчитывавется
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
        public void unto() {   //отменение изменений произведенных данной командой
            recever.setStringBuilder(reReceverSubctring);
        }
}

class Delete implements Command { // класс-шаблон для создания объекта комманды delete(start, fin)
    private final Recever recever;
    private int start;
    private int fin;
    StringBuilder preResever;

    Delete(Recever recever, int start, int fin) { //конструктор для создания шаблона
        this.recever = recever;
        this.start = start;
        this.fin = fin;
        preResever = recever.getStringBuilder();

        recever.setStringBuilder( recever.delete(start, fin));
    }

    public StringBuilder getDelete() {  //возврат значения измененной строки
        return recever.getStringBuilder();
    }

    @Override
    public void unto() {    //отменение изменений произведенных данной командой
        recever.setStringBuilder(preResever);
    }
}




//    class SubstringBeginEnd implements Command {
//        private final Recever recever;
//        private int i;
//        private int j;
//
//        SubstringBeginEnd(Recever recever) {
//            this.recever = recever;
//        }
//
//        @Override
//        public void execute() {
//            recever.substring(i, j);
//        }
//
//        @Override
//        public void unto() {
//        }
//    }
//
//    class Append implements Command {
//        private final Recever recever;
//        private char ch;
//
//        Append(Recever recever) {
//            this.recever = recever;
//        }
//
//        @Override
//        public void execute() {
//            recever.append(ch);
//        }
//
//        @Override
//        public void unto() {
//
//        }
//    }
//
//    class Insert implements Command {
//        private final Recever recever;
//        private int i;
//        private char ch;
//
//        Insert(Recever recever) {
//            this.recever = recever;
//        }
//
//        @Override
//        public void execute() {
//            recever.insert(i, ch);
//        }
//
//        @Override
//        public void unto() {
//        }
//    }
//

//
//    class DeleteCharAt implements Command {
//        private final Recever recever;
//        private int i;
//
//        DeleteCharAt(Recever recever) {
//            this.recever = recever;
//        }
//
//        @Override
//        public void execute() {
//            recever.deleteCharAt(i);
//        }
//
//        @Override
//        public void unto() {
//        }
//    }
//
//    class Reverse implements Command {
//        private final Recever recever;
//        private StringBuilder stringBuilder;
//
//        Reverse(Recever recever) {
//            this.recever = recever;
//        }
//
//        @Override
//        public void execute() {
//            recever.reverse(stringBuilder);
//        }
//
//        @Override
//        public void unto() {
//        }
//    }
//
//    class ToString_ implements Command {
//        private final Recever recever;
//        private StringBuilder stringBuilder;
//
//        ToString_(Recever recever) {
//            this.recever = recever;
//        }
//
//        @Override
//        public void execute() {
//            recever.toString_(stringBuilder);
//        }
//
//        @Override
//        public void unto() {
//        }
//    }
//
//}