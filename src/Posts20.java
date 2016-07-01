/*import com.sun.java.util.jar.pack.Instruction;*/

import java.util.Scanner;

/**
 * Created by hong duong on 6/24/2016.
 */
public class Posts20 {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int Month;
        System.out.print("Mời nhập tháng ");
        Month = Input.nextInt();
        switch (Month){
            case 1:
                System.out.println("Tháng 1");
                break;
            case 2:
                System.out.println("tháng 2");
                break;
            case 3:
                System.out.println("Tháng 3");
                break;
            case 4:
                System.out.println("Tháng 4");
                break;
            case 5:
                System.out.println("Tháng 5");
                break;
            case 6:
                System.out.println(" Tháng 6");
                break;
            case 7:
                System.out.println(" Tháng 7");
                break;
            case 8:
                System.out.println("Tháng 8");
                break;
            case 9:
                System.out.println("Tháng 9");
                break;
            case 10:
                System.out.println("Tháng 10");
                break;
            case 11:
                System.out.println("Tháng 11");
                break;
            case 12:
                System.out.println("Tháng 12");
                break;
                default:
                    System.out.println("Bạn đã nhập sai yêu cầu");
                    break;
        }
    }
}
