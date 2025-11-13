import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========mission1==========");
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.println("您输入的字符串为："+str);
        System.out.println("您输入的字符串"+(Palindrome.isPalindrome(str)?"是":"不是")+"回文串");
        System.out.println("==========mission2==========");
        String nums[] = {"20", "50", "40", "30", "60", "55", "80"};
        System.out.println("排序前：");
        for (String num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        SortStr.Sort(nums);
        System.out.println("排序后：");
        for (String num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("==========mission3==========");
        System.out.println("请输入一段文本：");
        String text = sc.nextLine();
        Statistics.Statistic(text);
        sc.close();


    }
}
