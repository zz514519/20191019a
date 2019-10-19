//鸡兔同笼问题。
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入鸡和兔子的总数：");
        int head = sc.nextInt();
        System.out.println("请输入请输入鸡和兔子的总腿数：");
        int leg = sc.nextInt();
        project(head,leg);
    }
    public static void project(int head,int leg){
        int chicken = 0;
        int rabbit = 0;
        for(chicken = 0;chicken <head;++chicken){
            rabbit = head - chicken;
            if(2*chicken+4*rabbit==leg&&chicken+rabbit==head){
                System.out.println("鸡的数量="+chicken+"   兔子的数量="+rabbit);
            }
        }
    }
}
