import java.io.*;
import java.util.Scanner;


public class Main {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static final char BREAK_LINE1 = '\r';

    public static void main(String[] args) {
        try {
            File myObj = new File("E://javacore/input.txt");
            Scanner myReader = new Scanner(myObj);
            int count = 0;
            int index = 0;
            int i = 0;
            int j = 0;
            int sum =1;
            String result ="";
            String result1 = "";
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                index = count_column(data);

                boolean notCounted = true;
            for (i = 0; i < data.length(); i++) {
                if (data.charAt(i) != SPACE && data.charAt(i) != TAB && data.charAt(i) != BREAK_LINE && data.charAt(i) != BREAK_LINE1) {
                    if (notCounted) {
                        count++;
                        notCounted = false;
                    }
                } else {
                    notCounted = true;
                }
            }

            System.out.println(count);
            if(count == index){
                result ="đây là ma trận";
                count = count - index;
            }
            else {
                result = "đây không là ma trận";
                break;
            }
            }



            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static int  count_column(String data) {
        //Đếm số phần tử trong 1 dòng
        int count = 0;
        boolean notCounted = true;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) != SPACE && data.charAt(i) != TAB && data.charAt(i) != BREAK_LINE && data.charAt(i) != BREAK_LINE1) {
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
