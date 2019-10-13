import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int count;
        int[] fishLovely;
        Scanner scanner=new Scanner(System.in);
        
        count=scanner.nextInt();
        fishLovely=new int[count];
        for(int i=0;i<count;i++){
            fishLovely[i]=scanner.nextInt();
        }
        String str="";
        for(int i=0;i<count;i++){
            int temp=0;
            for(int j=0;j<i;j++){
                if(fishLovely[i]>fishLovely[j])temp++;
            }
            str+=temp+" ";
        }
        
        System.out.println(str);
    }
}