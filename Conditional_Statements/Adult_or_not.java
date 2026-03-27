import java.util.Scanner ;     //ADULT OR NOT
class Adult_or_not {
    public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enetr your Age :- ");
    int age = sc.nextInt() ;

    if(age>18){
        System.out.println("Adult!!!!");
        }
    else {
        System.out.println("Not Adult!!!!");
        }
    
    }
} 