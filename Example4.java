package IO;

import java.io.FileInputStream;

//reading single character
public class Example4 {

    public static void main(String[] args) {

        try{
            FileInputStream fin = new FileInputStream("C:\\Program Files (J)\\testout.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
