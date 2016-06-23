import java.awt.*;
import java.util.Scanner;

/**
 * Created by hong duong on 6/23/2016.
 */
public class Posts11 {
    public static void main(String[] args){
        Float F ;
        Scanner Input = new Scanner(System.in);
        System.out.print( "Nhập giá trị độ F ");
        F = Input.nextFloat();
        System.out.println("Giá trị độ F vừa nhập là "+ F +"độ F ");
        float C;
        C = (float )((F - 32)/1.8);
        System.out.println( "Độ c là " + C);


    }

}
