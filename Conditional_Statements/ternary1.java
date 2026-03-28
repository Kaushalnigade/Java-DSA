import java.util.* ;
class ternary1 {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year :- ");
        int a = sc.nextInt();

        if(a%4 == 0 && a%100 == 0 && a%400 == 0){
            System.out.println(a + "  is a Leap Year ");
        }
        else {
            System.out.println(a + "  is not a Leap year ");
        }
    }
}
