public class Counter {
    private long character;
    private long word;
    private long line;
    private String text;
    private long countChar() {
        return text.length();
    }
    private long countWord() {
        boolean blank = true;
        long word = 0;
        for (char c : text.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if (blank){
                    blank = false;
                    word++;
                }
            }else if (c == '-' && !blank){
                continue;
            }else {
                blank = true;
            }
        }
        return word;
    }
    private long countLine() {
        long line = 0;
        int index = -1;
        while((index=text.indexOf("\n", index)) > -1) {
            index++;
            line++;
        }
        return line;
    }
    public Counter(String text) {
        this.text = text;
    }

    public void count() {
        character = countChar();
        word = countWord();
        line = countLine();
    }

    public long getWord() {
        return word;
    }

    public long getLine() {
        return line;
    }

    public long getCharacter() {
        return character;
    }
}
