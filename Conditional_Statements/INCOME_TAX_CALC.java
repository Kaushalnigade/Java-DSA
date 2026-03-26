import java.util.* ;
class  INCOME_TAX_CALC{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual Income :- ");
        int n = sc.nextInt();

        if(n<500000) {
            System.out.print("Your Annual Tax is 0 !!!!!");
        }
        else if(n>500000 && n<1000000) {
            System.out.print("Your Annual Tax is :- " + n*0.2 + "!!!!!!");
        }
        else {
            System.out.print("Your Annual Tax is :- " + n*0.3 + "!!!!!!");
        }
    }
}