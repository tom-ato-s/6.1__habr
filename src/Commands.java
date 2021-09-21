class CharAt implements Command{
   private final Recever recever ;
    private int i;
   CharAt(Recever recever) {

       this.recever = recever;
   }
   @Override
   public void execute(){
       recever.charAt(i);
   }
   @Override
    public void unto() {

   }
}

class Length implements Command {
    private final Recever recever;
    Length (Recever recever) {
        this.recever = recever;
    }
    @Override
   public void execute() {
        recever.length();
    }
    @Override
    public void unto() {

    }
}

class IndexOf implements Command{
    private final Recever recever;
    char ch;
    IndexOf(Recever recever) {
        this.recever = recever;
    }

    @Override
    public void execute() {
        recever.indexOf(ch);
    }
    @Override
    public void unto() {
    }
}

class SubstringBegin implements Command{
    private final Recever recever;
    private int i;
    SubstringBegin (Recever recever) {
    this.recever = recever;
    }
    @Override
    public void execute() {
        recever.substring(i);
    }
    @Override
    public  void unto() {
    }
}

class SubstringBeginEnd implements Command{
    private final Recever recever;
    private int i;
    private int j;
    SubstringBeginEnd (Recever recever) {
        this.recever = recever;
    }
    @Override
    public void execute() {
    recever.substring(i, j);
    }
    @Override
    public void unto() {
    }
}

class Append implements Command {
    private  final Recever recever;
    private char ch;

    Append(Recever recever) {
    this.recever = recever;
    }

    @Override
    public void execute() {
        recever.append(ch);
    }

    @Override
    public void unto() {

    }
}

class Insert implements Command {
    private  final Recever recever;
    private int i;
    private char ch;
    Insert(Recever recever) {
        this.recever = recever;
    }
    @Override
    public void execute() {
recever.insert(i, ch);
    }
    @Override
    public void unto() {
    }
}

class Delete implements Command {
    private  final Recever recever;
    private int start;
    private int fin;
    Delete(Recever recever) {
        this.recever = recever;
    }
    @Override
    public void execute() {
        recever.delete(start, fin);
    }
    @Override
    public void unto() {
    }
}

class DeleteCharAt implements Command{
    private  final Recever recever;
    private int i;

    DeleteCharAt(Recever recever) {
        this.recever = recever;
    }
    @Override
    public void execute() {
        recever.deleteCharAt(i);
    }
    @Override
    public void unto() {
    }
}

class Reverse implements Command {
    private final Recever recever;
    private StringBuilder stringBuilder;
    Reverse(Recever recever){
        this.recever = recever;
    }
    @Override
    public void execute() {
        recever.reverse(stringBuilder);
    }
    @Override
    public void unto() {
    }
}

class ToString_ implements Command{
    private final Recever recever;
    private StringBuilder stringBuilder;
    ToString_(Recever recever) {
        this.recever = recever;
    }
    @Override
    public void execute() {
        recever.toString_(stringBuilder);
    }
    @Override
    public void unto() {
    }
}