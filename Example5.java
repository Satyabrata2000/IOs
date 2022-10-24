package IO;

import java.io.FileInputStream;

//read all characters
public class Example5 {

    public static void main(String[] args) {

        try{
            FileInputStream fin = new FileInputStream("C:\\Program Files (J)\\testout.txt");
            int i = 0;
            while((i=fin.read())!= -1){
                System.out.print((char)i);
            } fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
