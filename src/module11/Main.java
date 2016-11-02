package module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String replacer(Map<String, String> map) {
        String replacedWords = "";
        BufferedReader br = null;
        try {
            FileReader fileReader = new FileReader("C:\\file.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            for (Map.Entry<String,String> entry: map.entrySet()) {
                if (everything.contains(entry.getKey())) replacedWords += entry.getKey() + " ";
                everything = everything.replace(entry.getKey(), entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }

        return replacedWords;
    }

    private static void fileContentReplacer(Map<String, String> map) {
        BufferedReader br = null;
        try {
            FileReader fileReader = new FileReader("C:\\file.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            for (Map.Entry<String,String> entry: map.entrySet()) {
                everything = everything.replace(entry.getKey(), entry.getValue());
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\file.txt"));
            bw.write(everything);
            bw.close();
        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }
    }

    private static void fileContentMerger(Map<String, String> map) {
        BufferedReader br = null;
        try {
            FileReader fileReader = new FileReader("C:\\file.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            for (Map.Entry<String,String> entry: map.entrySet()) {
                everything = everything.replace(entry.getKey(), entry.getValue());
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\file.txt", true));
            bw.write(everything);
            bw.close();
        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }
    }

    static int checkWord(String word) {
        int count = 0;
        String filePath = "C:\\file.txt";
        BufferedReader br;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(filePath));
            try {
                while((line = br.readLine()) != null)
                {
                    String[] words = line.split(" ");

                    for (String word1 : words) {
                        if (word1.equals(word)) {
                            count++;
                        }
                    }
                }
                br.close();
            } catch (IOException e) {
                System.out.println("NullPointer exception");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Java", "JAVA");
        map.put("file", "FILE");
        map.put("test", "RANDOM");

        System.out.println(replacer(map));
        fileContentReplacer(map);
        fileContentMerger(map);
        System.out.println(checkWord("JAVA"));;
    }
}
