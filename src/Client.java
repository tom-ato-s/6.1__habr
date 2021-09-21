public class Client {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Мадагаскар");

        Recever recever = new Recever(stringBuilder);
        System.out.println(stringBuilder.reverse(stringBuilder));

        Command comCharAt = new CharAt(recever);
        Command comIndexOf = new IndexOf(recever);
        Command comLength = new Length(recever);
        Command comSubstringBegin = new SubstringBegin(recever);
        Command comSubstringBeginEnd = new SubstringBeginEnd(recever);
        Command comAppend = new Append(recever);
        Command comInsert = new Insert(recever);
        Command comDelete = new Delete(recever);
        Command comDeleteCharAt = new DeleteCharAt(recever);
        Command comReverse = new Reverse(recever);
        Command comToString_ = new ToString_(recever);

        Invocer invocer = new Invocer();
        invocer.register("NameCharAt", comCharAt);
        invocer.register("NameIndexOf", comIndexOf);
        invocer.register("NameLenght", comLength);
        invocer.register("MameSubstringBegin", comSubstringBegin);
        invocer.register("NameSubstringBeginEnd", comSubstringBeginEnd);
        invocer.register("NameAppend", comAppend);
        invocer.register("NameInsert", comInsert);
        invocer.register("NameDeleteCharAt", comDeleteCharAt);
        invocer.register("NameReverse", comReverse);
        invocer.register("NameToString_", comToString_);

        invocer.execute("NameLenght");
        invocer.execute("NameCharAt");

    }
}
