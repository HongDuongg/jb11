import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.IdentityHashMap;
import java.util.Scanner;

/**
 * Created by hong duong on 6/29/2016.
 */
public class Posts3 {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.println("moi nhap vao nam");
        int Year = Input.nextInt();
        System.out.println("Moi nhap vao thang ");
        int Month = Input.nextInt();
        if (Month < 1 || Month >12 ){
            System.out.println("Nhap lai thang ");
            Month= Input.nextInt();
        }
        int day;
        System.out.println("Nhap vao ngay cua thang");
        day= Input.nextInt();

        if (Month == 2){
            boolean a = ((Year % 100 != 0 && Year % 4 == 0)|| (Year % 400 == 0) );
            if (a){
              /*  System.out.println("Nhap vao ngay cua thang");
                day = Input.nextInt();*/
                if (day < 1 || day > 29 ){
                    System.out.println(" Nhap lai ngay cua thang");
                    day= Input.nextInt();
                }
            }
            else{
                if ( day < 1 || day > 28 ){
                    System.out.println("Nhap lai ngay cua thang");
                    day=Input.nextInt();
                }
            }
        }
        int h;

        if (Month == 1 || Month ==2){
          int j = (Year - 1) % 100;
            int q = day;
            int m = Month + 12;
            int k = (Year - 1) % 100;
            h = (q + 26*(m +1)/10 + k + k/4 + j/4 + 5*j)%7;
        }
        else{
            int j = Year % 100;
            int q = day;
            int m = Month;
            int k = Year % 100;
            h = (q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j)%7;
        }
        switch (h){
            case 0:
                System.out.println("ngay cua tuan la chu nhat");
                break;
            case 1:
                System.out.println("ngay cua tuan la thu 7");
                break;
            case 2:
                System.out.println("Ngay cua tuan la thu 2");
                break;
            case 3:
                System.out.println("Ngay cua tuan la thu 3");
                break;
            case 4:
                System.out.println("Ngay cua tuan la thu 4");
                break;
            case 5:
                System.out.println("Ngay cua tuan la thu 5");
                break;
            case 6:
                System.out.println("Ngay cua tuan la thu 6");
        }
    }
}
