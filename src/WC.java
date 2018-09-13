public class WC {
    public static void main(String[] args) {
        // get the file
        if (args.length <= 0){
            System.err.println("please input the argument");
            return;
        }
        String text = ReadFileToString.readFileToString(args[args.length - 1]);
        // count
        Counter counter = new Counter(text);
        // output result
        for (int i = 0; i < args.length-1; i++) {
            switch (args[i]) {
                case "-c" :System.out.print("Character: " + counter.getCharacter()); break;
                case "-w" : System.out.print("word: " + counter.getCharacter()); break;
                case "-l" : System.out.print("line: " + counter.getCharacter()); break;
                default: break;
            }
        }
    }

}
