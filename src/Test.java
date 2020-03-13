import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

    }
}

        /*
       //Viết lên tệp txt
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        String data ="";
        try{
             data = "\n Day la ma tran\n" +
                    "================================================";
            File file = new File("E://javacore/input.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(bufferedWriter != null)
                    bufferedWriter.close();
                if(fileWriter != null)
                    fileWriter.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
}
         */
