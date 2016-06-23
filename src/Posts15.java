import java.util.Scanner;

/**
 * Created by hong duong on 6/23/2016.
 */
public class Posts15 {
    public static void main(String[] args){
       String s;
        float Height;
        float weight;
        Float BMI;

        Scanner Input = new Scanner(System.in);
        System.out.print("Nhập tên người ");
        s=Input.nextLine();
        System.out.print("Nhập chiều cao (m) ");
        Height=Input.nextFloat();
        System.out.print("Nhập cân nặng (kg)");
        weight=Input.nextFloat();
        System.out.print("Tên người nhập là :" + s);
        BMI = weight/Height;
        if (BMI < 18.5)
            System.out.print(" là người gầy ");
        if (18.5 <= BMI && BMI <= 25)
            System.out.print(" là người lí tưởng ");
        if(25 <= BMI && BMI <= 30)
            System.out.print(" là người thừa cân");
        if (BMI > 30)System.out.print(" là người béo phì");
    }
}
