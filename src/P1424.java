import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(!((x==6)|(x==7))){
                sum+=250;
            }
            if(x==7){
                x=1;
            }else{
                x++;
            }
        }
        System.out.println(sum);
    }
}