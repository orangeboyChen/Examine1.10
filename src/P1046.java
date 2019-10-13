import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    int[] appleHeight=new int[10];
    int count=0;
    Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++){
            appleHeight[i]=scanner.nextInt();
        }
        int handHeight=scanner.nextInt();
        for(int i:appleHeight){
            if((handHeight+30)>=i){
                count++;
            }
        }
        System.out.println(count);
    }
}