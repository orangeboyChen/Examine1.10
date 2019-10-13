import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int b=i;

            while(b!=0){
                if(x==(b-(b/10)*10))count++;
                b/=10;
            }
        }
        System.out.println(count);
    }
}