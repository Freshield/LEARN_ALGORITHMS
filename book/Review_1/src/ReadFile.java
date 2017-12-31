import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static String[] returnValue(String dir, String filename){
        File file = new File(dir + filename);
        BufferedReader reader = null;
        ArrayList<String> list = new ArrayList<String>();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null){
                list.add(tempString);
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
            return (String[]) list.toArray(new String[list.size()]);
        }
    }

    public static void showList(String[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        String dir = "/media/freshield/COASAIR1/LEARN_ALGORITHMS/book/Chp1/src/";
        String filename = "tinyUF.txt";
        String[] list = returnValue(dir, filename);
        showList(list);
    }

}
