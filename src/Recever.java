class Recever{

    StringBuilder stringBuilder;


    Recever(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }


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


    public void append(char ch) {stringBuilder.append(ch);}


    public void insert(int i, char ch) {
        stringBuilder.insert(i, ch);
    }


    public void delete(int start, int fin) {
stringBuilder.delete(start, fin);
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
