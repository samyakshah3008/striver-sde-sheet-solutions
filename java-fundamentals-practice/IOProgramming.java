// import java.io.File;
// import java.io.IOException;

import java.io.File;

public class IOProgramming {
    public static void main(String[] args) {
        // File myFile = new File("cwh111.text");
        // try {
        // myFile.createNewFile();
        // } catch (IOException e) {
        // System.out.println("Unable to create this file");
        // e.printStackTrace();
        // }

        // try {
        // FileWriter myFileWriter = new FileWriter("cwh111.text");
        // myFileWriter.write("Helloooo");
        // myFileWriter.close();
        // } catch (IOException e) {
        // System.out.println("exception");
        // }

        // File myFile = new File("cwh111.text");
        // try {
        // Scanner sc = new Scanner(myFile);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("Exception");
        // e.printStackTrace();
        // }

        File myFile = new File("cwh111.text");
        if (myFile.delete()) {
            System.out.println("I have deleted the file");
        } else {
            System.out.println("Some error");
        }
    }
}
