//класс-получатель.
//В нем находится непосредственно страка StringBuilder, над которой проводяться действия
// и методы, которые  проводят действия над строкой StringBuilder
//и get и set, для изменения строки StringBuilder

class Recever{

    private StringBuilder stringBuilder;  // стока над которой будут проводиться действия

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }  //геттер

    public void setStringBuilder(StringBuilder sb) {
        stringBuilder = sb;
    } // сеттер

    Recever(StringBuilder stringBuilder) {  //конструктор для создания строки
        this.stringBuilder = stringBuilder;
    }

// меторы для работы со строкой


    public char charAt(int i) {
        return stringBuilder.charAt(i);
    }


    public int indexOf(char ch) {
        return stringBuilder.indexOf(String.valueOf(ch));
    }


    public int length() {
        return stringBuilder.length();
    }


    public StringBuilder substring(int i) {
        return new StringBuilder(stringBuilder.substring(i));
    }


    public StringBuilder substring(int i, int j) {
        return new StringBuilder(stringBuilder.substring(i, j));
    }


    public void append(char ch) {
        stringBuilder.append(ch);}


    public void insert(int i, char ch) {
        stringBuilder.insert(i, ch);
    }


    public StringBuilder delete(int start, int fin) {
return stringBuilder.delete(start, fin);
    }


    public void deleteCharAt(int i) {
stringBuilder.deleteCharAt(i);
    }


    public StringBuilder reverse(StringBuilder stringBuilder) {
        return new StringBuilder(stringBuilder.reverse());
    }


    public void toString_(StringBuilder stringBuilder) {
        stringBuilder.toString();
    }
}
