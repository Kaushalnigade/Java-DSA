import java.util.*;
class switch_week{
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("1 : MONDAY \n 2 : TUESDAY \n 3: WEDNESDAY \n 4 : THURSDAY \n 5 : FRIDAY \n 6 : SATURDAY \n 7 : SUNDAY");

        System.out.print("Enter number to print Week :- ");
        int n = sc.nextInt();

        switch(n) {
            case 1 : System.out.print(" MONDAY ");
            break;

            case 2 : System.out.println(" TUESDAY ");
            break;

            case 3 : System.out.println(" WEDNESDAY ");
            break;

            case 4 : System.out.println(" THRUSDAY ");
            break;

            case 5 : System.out.println(" FRIDAY ");
            break;

            case 6 : System.out.println(" SATURDAY ");
            break;

            case 7 : System.out.println(" SUNDAY ");
            break;

            default : System.out.println(" INVALID CHOICE ");
            break;
        }

    }
}