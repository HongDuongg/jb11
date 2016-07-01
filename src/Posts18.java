import java.util.Scanner;

/**
 * Created by hong duong on 6/24/2016.
 */
public class Posts18 {
    public static void main(String[] args){
        Scanner Intput = new Scanner(System.in);
        int Year;
        System.out.println("Mời nhập năm");
        Year =Intput.nextInt();
        System.out.println("Năm  "+ Year + " là có phải là năm nhuận không?");
        System.out.println((Year % 100 != 0 && Year %4 == 0) || (Year % 400 == 0));
    }
}
