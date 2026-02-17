package th.tech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass02 {
    public static void main() {
        int num1 = 0, num2 = 0, result = 0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("ป้อนตัวเลขที่ 1 : ");
            num1 = sc.nextInt();
            System.out.print("ป้อนตัวเลขที่ 2 : ");
            num2 = sc.nextInt();
            System.out.println("+++++++++++++++++++++");
            result = num1 / num2;
            System.out.println("ผลหารที่คำนวณได้คือ :" + result);
        }catch (InputMismatchException ex){
            System.out.println("กรุณาป้อนแค่ตัวเลขเท่านั้น ห้ามป้อนตัวอักษรนะจ๊ะ ^_^");
            return;
        }catch (ArithmeticException ex){
            System.out.println("กรุณาป้อนแต่ตัวเลขตัวที่ 2 ห้ามเป็น 0 ^_^");
            return;
        }catch (Exception ex){
            System.out.println("กรุณาติดต่อแผนก IT/Admin/เจ้าของโปรแกรม");
            return;
        }finally {
            System.out.println("+++++++++++++++++++++");
            System.out.println("Thank you. ขอบคุณที่ใช้บริการ.......");
        }
    }
}
