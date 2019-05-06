package readjson;

import java.io.*;


public class Readtxt {
    public static void main(String[] args) {
        File f = new File("D:/AAA/result.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = "";
            while ((line = br.readLine())!=null && !line.trim().equals("")){
                String[] list = line.split("\\t");
                System.out.println(list[0]+list[1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
