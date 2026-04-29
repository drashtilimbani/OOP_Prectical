import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += w.length;
                }
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        characters++;
                    }
                }
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
