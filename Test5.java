//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
//分析：合数的因数包含质数。
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数！");
        int num = sc.nextInt();
        project(num);
    }
    public static void project(int num) {
        System.out.print(num+"=");
        for (int i = 2; i < num + 1; ++i) {
            while (num % i == 0 && num != i) {
                num /= i;
                System.out.print(i + "*");
            }
            if (num == i) {
                System.out.print(i);
                break;
            }
        }
    }
}
