import java.io.*;

public class FileCount {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        int chars = 0, words = 0, lines = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length() + 1;
            String[] w = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) words += w.length;
        }

        br.close();

        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
