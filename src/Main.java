import java.io.*;


public class Main {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static final char BREAK_LINE1 = '\r';


    public static void main(String[] args) throws IOException {
        FileInputStream f_in = null;
        f_in = new FileInputStream("E://javacore/input.txt");
        String input = "";
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        String data = "";
        try {
            //Đọc file, đếm số phần tử
            int i = 0;
            int j = 0;
            //Đọc file, đếm số phần tử
            while ((i = f_in.read()) != -1) {
                //System.out.println((char) i);
                input += (char) i;
            }
            //System.out.println(input);
            int index = countWords(input);
            int size = (int) (Math.sqrt(index) + 1);
//            //Tạo 1 mảng để lưu
//            int array[][] = new int[size][size];
//            for (i = 0; i < size; i++) {
//                for (j = 0; j < size + 1; j++) {
//                    if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE && input.charAt(i) != BREAK_LINE1) {
//                        array[i][j] = input.charAt(i);
//                    }
//                }
//            }
//            //In ra ma tran
//            for (i = 0; i < size; i++) {
//                for (j = 0; j < size + 1; j++) {
//                    System.out.println(array[i][j]);
//                }
//            }
            //Kiem tra xem co phai la ma tran hay khong
            for(i = 1;i<Math.sqrt(index); i++){

                if((i*(i+1)) != index){
                    data = " Day khong la ma tran\n" +
                            "================================================";
                }else {
                    data ="Day  la ma tran";
                }
            }

            f_in.close();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            f_in.close();
        }

        //Xu lý chèn lên tệp tin
        try {
            data = "\n Day la ma tran\n" +
                    "================================================";
            File file = new File("E://javacore/input.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    //Đếm số phần tử của tệp
    public static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE && input.charAt(i) != BREAK_LINE1) {
                if (notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
}
