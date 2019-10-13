import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int inHand=0;
        int inM=0;
        for(int i=0;i<12;i++){
            inHand+=300;
            int a=s.nextInt();
            if(inHand<a){
                System.out.println(-(i+1));
                System.exit(0);
            }


            inHand-=a;
            int temp= (inHand/100)*100;
            inM+=temp;
            inHand-=temp;



        }
        System.out.println((int)(inM*1.2)+inHand);
    }
}