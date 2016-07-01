import java.io.IOException;
import java.util.Scanner;
public class lesson4 {
    public static void main(String[] args) throws IOException {
        char Choose;
       do {
        Scanner Input = new Scanner(System.in);
        System.out.println("Moi nhap ten ");
         String s = Input.nextLine();
        System.out.println("Moi nhap chieu cao(met) ");
        float Height = Input.nextFloat();
        System.out.println("Moi nhap can nang (Kg)");
        float weight = Input.nextFloat();
        System.out.println("Ten nguoi nhap " +s);
        float BMI = (float) (weight/Math.pow(Height,2));
        if (BMI < 18.5){
            System.out.println("Nguoi thieu can");
        }else if (18.5 <= BMI && BMI < 25.0) {
                System.out.println("Nguoi li tuong");
            } else if (25.0 <= BMI && BMI <= 30.0) {
                    System.out.println("Nguoi thua can");
                } else if (BMI > 30) {
                        System.out.println("Nguoi beo phi");
                    }
        System.out.println("Ban co muon tiep tuc k (Y/N)");
            Choose =(char)System.in.read();
           if (Choose == 'N'|| Choose == 'N'){
               System.out.println("ket thuc chuong trinh");
               break;
           }
        }while( Choose == 'Y' || Choose == 'y');
    }
}
