import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String month1 = scanner.next();
        if(month1.equals("июнь") || month1.equals("июль")  || month1.equals("август")){
            System.out.println("Сейчас лето");
        }else if(month1.equals("сентябрь") || month1.equals("октябрь")  || month1.equals("ноябрь")){
            System.out.println("Сейчас осень");
        }else if(month1.equals("декабрь") || month1.equals("январь")  || month1.equals("февраль")){
            System.out.println("Сейчас зима");
        }else if(month1.equals("март") || month1.equals("апрель")  || month1.equals("май")){
            System.out.println("Сейчас весна");
        }

        System.out.println("Введите название месяца");
        String month2 = scanner.next();
        switch (month2){
            case "июнь": System.out.println("Сейчас лето");
                break;
            case "июль": System.out.println("Сейчас лето");
                break;
            case "август": System.out.println("Сейчас лето");
                break;
            case "сентябрь": System.out.println("Сейчас осень");
                break;
            case "октябрь": System.out.println("Сейчас осень");
                break;
            case "ноябрь": System.out.println("Сейчас осень");
                break;
            case "декабрь": System.out.println("Сейчас зима");
                break;
            case "январь": System.out.println("Сейчас зима");
                break;
            case "февраль": System.out.println("Сейчас зима");
                break;
            case "март": System.out.println("Сейчас весна");
                break;
            case "апрель": System.out.println("Сейчас весна");
                break;
            case "май": System.out.println("Сейчас весна");
                break;
            }
    }
}
