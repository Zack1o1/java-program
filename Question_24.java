package question;


//24. Write a java program that reads a text-file and counts the number of words in it. The
//program should then write the word count to a new file.

import java.io.*;

public class Question_24 {
    public static void main(String[] args){
        try{
            FileReader file = new FileReader("src/question/myfile.txt");
            BufferedReader fileReader = new BufferedReader(file);

            FileWriter writeFile = new FileWriter("src/question/count.txt");
            BufferedWriter fileWriter = new BufferedWriter(writeFile);

            String line;

            int count = 0;

            while((line = fileReader.readLine()) != null){
                System.out.println(line);
                String[] words = line.split("\\s+");
                count += words.length;
            }
            fileWriter.write("Word count:" + count);
            System.out.println("Word count is written in file");
            fileReader.close();
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println("Error occured" + e.getMessage());
        }
    }
}
