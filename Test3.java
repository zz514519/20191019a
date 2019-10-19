import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count!=0){
            System.out.println("请输入你的密码：");
            String password = sc.nextLine();
            if("123456" .equals(password)){
                System.out.println("输入正确！");
                break;
            }else{
                System.out.println("密码错误！");
                --count;
            }
        }
    }
}
