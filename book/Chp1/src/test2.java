import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test2 {

    public static void main(String[] args) {
        String dir = "/media/freshield/COASAIR1/LEARN_ALGORITHMS/book/Chp1/src/";
        File file = new File(dir + "tinyUF.txt");
        BufferedReader reader = null;
        try {
            System.out.println("read line by line");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null){

            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                }catch (IOException e1){
                    e1.printStackTrace();
                }
            }
        }

    }

}
