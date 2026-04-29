import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            bw = new BufferedWriter(fw);

            bw.write("1 John 85\n");
            bw.write("2 Alice 90\n");
            bw.write("3 Bob 78\n");

            bw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
