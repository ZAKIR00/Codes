import java.io.*;
import java.util.Scanner;

public class JavaIO {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        System.out.println(s.next());
        s.close();

        File myfile = new File("file.txt");
        myfile.createNewFile();

        Scanner fileReader  = new Scanner(myfile);

        FileWriter fileWriter = new FileWriter(myfile);

        fileWriter.write("merhaba");
        fileWriter.write("\nBen zakir");

        while (fileReader.hasNext())
        System.out.println(fileReader.next());
        fileReader.close();
        fileWriter.close();

        bufferedWriterandReader();

    }

    private static void bufferedWriterandReader() throws IOException {

        File mysecondFile = new File("buffer.txt");
                FileWriter buffer = new FileWriter(mysecondFile);
        BufferedWriter bufferedWriter = new BufferedWriter(buffer);
        FileReader read = new FileReader(mysecondFile);
        BufferedReader bufferedReader = new BufferedReader(read);
        bufferedWriter.write(24);
        bufferedWriter.newLine();
         bufferedWriter.append("mamamaa").append("kskd");
         bufferedWriter.flush();
         for(int i = 0; i<12;i++);
        System.out.println((char)bufferedReader.read());
        System.out.println(bufferedReader.readLine());

        bufferedWriter.close();
        bufferedReader.close();
    }
}
