import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int L=scanner.nextInt();
        int count=0;
        boolean[] b=new boolean[L+1];
        for(int i=0;i<L+1;i++){
            b[i]=true;
        }
        int M=scanner.nextInt();
        for(int i=0;i<M;i++){
            int left=scanner.nextInt();
            int right=scanner.nextInt();
            for(int ii=left;ii<=right;ii++){
                b[ii]=false;
            }
        }

        for(boolean a:b){
            if(a){
                count++;
            }
        }

        System.out.println(count);
    }
}