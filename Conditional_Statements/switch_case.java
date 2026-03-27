import java.util.Scanner;
class switch_case{
    public static void main (String args[]){
        System.out.println(" !!!SWITCH CASE !!! ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println(" Dunia ");
            break;

            case 3: System.out.println(" namaste ");
            break;
        
            default: System.out.println("Invalid Choice");
                break;
        }
    }
}