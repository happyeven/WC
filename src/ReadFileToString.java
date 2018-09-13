import java.io.*;


public class ReadFileToString {
    public static String readFileToString(String fileName) {
        File file = new File(fileName);
        Long length = file.length();
        byte[] bytes = new byte[length.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(bytes);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes);
    }

}
