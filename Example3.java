package IO;

import java.io.FileOutputStream;

//Write String Operation
public class Example3 {

    public static void main(String[] args) {

        try{
            FileOutputStream fout = new FileOutputStream("C:\\Program Files (J)\\testout.txt");
            String s = "The Earth is wonderful";
            byte b[] = s.getBytes(); //converting string into a byte array
            fout.write(b);
            fout.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
