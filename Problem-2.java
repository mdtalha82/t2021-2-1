import java.util.*;
class Problem2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int count = 1;
        for(int i=1;i<=a;i++){
            System.out.print(count+" ");
            count+=2;                
        }
    }
}



