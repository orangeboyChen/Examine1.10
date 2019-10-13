import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double sum=0;
        double h=s.nextDouble();
        for(int i=0;i>=0;i++){
            sum+=2*Math.pow(0.98,i);
            if(sum>h){
                System.out.println(i+1);
                break;
            }
        }
    }
}