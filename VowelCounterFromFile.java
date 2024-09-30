import java.io.*;


public class VowelConsonantCounter {
    public static void main(String[] args) {
        int vowelCount = 0;
        int consonantCount = 0;

        try {
            FileReader file = new FileReader("src/question/myfile.txt");
            BufferedReader fileReader = new BufferedReader(file);
            String line;
            while ((line = fileReader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        if ("AEIOUaeiou".indexOf(c) >= 0) {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Vowels:"+vowelCount);
        System.out.println("Consonant:"+consonantCount);
}
}
