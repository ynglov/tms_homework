public class Task1 {


    public static void main(String[] args) {

        //1.1
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        int arage = 0;
        for (int i = 0; i < arr.length; i++) {
            arage += arr[i];
        }
        System.out.println(" ");
        System.out.println("Average: " + (double)arage/2);
        //1.2
        int[] arr2 = new int[10];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++, j--) {
            arr2[j] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        //1.3

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if(arr[i] == arr[k]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

}
