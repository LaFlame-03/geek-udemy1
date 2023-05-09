package teste;
import java.util.random.*;
import java.util.Random;
import java.lang.ClassNotFoundException;

public class QuickStart {
    
        public static void main(String[] args)
    {    
            
    String[] option = {"sim", "não"};

    Random R = new Random();

    int index = R.nextInt(option.length);

    System.out.println(option[index]);

    }        
        
}
