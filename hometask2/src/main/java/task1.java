import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число меньше 10000");
        int a = scanner.nextInt();
        if(a < 10000 && a > 0){

            if(a/1000 !=0){
                System.out.print(a/1000);
                System.out.println(" тысяч");
            }
            if((a/100)%10 != 0){
                System.out.print((a/100)%10);
                System.out.println(" сотен");
            }
            if((a/10)%10 !=0){
                System.out.print((a/10)%10);
                System.out.println(" десятков");
            }
            if((a%10) != 0) {
                System.out.print(a % 10);
                System.out.println(" едениц");
            }
            int i = 0;
            for(;a>0;i++){
                a = a/10;
            }
            System.out.print(i);
            System.out.println(" знаков");
        }else{
            System.out.println("Число больше 10000 или меньше 0");
        }


    }
}
