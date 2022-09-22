import  java.util.*;

class Problem1{

    public static void main(String[] args) {
    int a, b;
    String typeOfOperation;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Numbers");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Choose an operator: +, -, *, or /");
    typeOfOperation = sc.next();
    sc.close();

        switch(typeOfOperation){
        case "+" :
            System.out.print(a+b);
            break;
        case "-" :
            System.out.print(a-b);
            break;
        case "*" :
            System.out.print(a*b);
            break;
        case "/" :
            System.out.print(a/b);
            break;
        default :
            System.out.println("Invalid operation");
        }
    }
}