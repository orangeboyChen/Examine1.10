import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int[] a=new int[7];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<7;i++){
            a[i]=s.nextInt()+s.nextInt();
        }
        int max=-1;
        int num=-1;
        for(int i=0;i<7;i++){
            if(a[i]>max){
                max=a[i];
                num=i+1;
            }
        }
        System.out.println(num);
    }
}