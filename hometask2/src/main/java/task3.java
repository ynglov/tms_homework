import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int a = scanner.nextInt();
        for(int i = 0; a >= i; i++){
            if(i%3 == 0 && i%2 == 1){
                System.out.println(i);
            }
        }
    }
}
