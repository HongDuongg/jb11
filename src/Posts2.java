import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by hong duong on 6/26/2016.
 */
public class Posts2 {
    public static void main(String[] args){
        float a,b,c;
        System.out.println("moi nhap gia tri ");
        Scanner Input = new Scanner(System.in);
        System.out.println("Moi nhap gia tri a = ");
        a = Input.nextFloat();
        System.out.println("Moi nhap gia tri b = ");
        b = Input.nextFloat();
        System.out.println("Moi nhap gia tri c = ");
        c = Input.nextFloat();
       /* double denta =  (Math.pow(b,2)) - 4*a*c;
        double x1,x2;
        double x = (-b + Math.sqrt(denta))/(2*a);
         (-b - Math.sqrt(denta))/2*       d
*/
        if (a == 0){
           if (b == 0){
               System.out.println("Phuong trinh vo nghiem");
           }
            else
               System.out.println("Phuong trinh vo so nghiem");
        }
        else {
            float denta = (float) (Math.pow(b, 2) - 4*a*c);
           double x1 = (-b + Math.sqrt(denta))/(2*a);
            double x2 = (-b - Math.sqrt(denta))/(2*a);
            if (denta > 0 ) {
                System.out.println("Phuong trinh co hai nghiem phan biet");
                System.out.println("x1 = " + x1 );
                System.out.println("x2 = "+ x2);
              }
              else {
                System.out.println("Phuong trinh vo nghiem");
               }
        }
        /*s= -c/b;
                                   deta = Math.pow()
                                       if (a ==0 ){
                                      System.out.println("phuon trinh co nghiem la"+s);
                                             }
                                       else {
                                        if (deta > 0)
                                             System.out.println("phuong trinh co 2 nghiem phan biet"+deta);
                                           }*/
    }
}
