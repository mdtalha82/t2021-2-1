import java.util.*;
class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int a = sc.nextInt();
        System.out.println("enter the elements of an array");
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        for(int i=0;i<a;i++){
            if(arr[i]%1==0){
                count1++;
            }
        }   
        for(int i=0;i<a;i++){
            if(arr[i]%2==0){
                count2++;
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%3==0){
                count3++;
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%4==0){
                count4++;
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%5==0){
                count5++;
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%6==0){
                count6++;
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%7==0){
                count7++;
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%8==0){
                count8++;
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%9==0){
                count9++;
            }
        } 
        System.out.println("{1: "+count1+", 2: "+count2+", 3: "+count3+", 4: "+count4+", 5: "+count5+", 6: "+count6+", 7: "+count7+", 8: "+count8+", 9: "+count9+"}");     
    }    
}