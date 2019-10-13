import java.util.Scanner;
class Main{
    public static void main(String args[]){
        double sum=0;
        Scanner s=new Scanner(System.in);
        double k=s.nextInt();
        for(int i=1;i>0;i++){
            sum+=1/(double)i;
            if(sum>k){
                System.out.println(i);
                break;
            }
        }
    }
}