package IO;

import java.io.FileOutputStream;

//Write byte operation
public class Example2 {

    public static void main(String[] args) {

        try{
            FileOutputStream fout = new FileOutputStream("C:\\Program Files (J)\\testout.txt");
            fout.write(50);
            fout.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
