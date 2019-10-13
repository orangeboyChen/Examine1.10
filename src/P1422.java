import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double b=0;
        if(a<=150){
            b=a*0.4463;
        }
        else{
            if(a>150&&a<=400){
                b=(a-150)*0.4663+150*0.4463;
            }
            else{
                b=(a-400)*0.5663+150*0.4463+250*0.4663;
            }
        }
        System.out.println(Math.round(b*10)/10f);
    }
}