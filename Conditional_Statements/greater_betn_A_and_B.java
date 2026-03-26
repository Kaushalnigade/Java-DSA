import java.util.Scanner ;    // grater betn A and B
class greater_betn_A_and_B{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A :- ");
        int a = sc.nextInt();

        System.out.print("Enetr the value of B :- ");
        int b = sc.nextInt();

        if(a==b) {
            System.out.println("A and B are Equals !!!");
        }
        else if(a>b) {
            System.out.println("A is Greater !!!");
        }
        else{
            System.out.println("B is Greater !!!");
        }
    }
}