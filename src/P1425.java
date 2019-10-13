import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=c-a;
        int f=d-b;
        if(f<0){
            e--;
            f+=60;
        }
        System.out.println(e+" "+f);
        
    }
}