import java.util.Scanner;
class Main{
    static int count;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        count=s.nextInt();
        int a1=s.nextInt();
        int a2=s.nextInt();
        int b1=s.nextInt();
        int b2=s.nextInt();
        int c1=s.nextInt();
        int c2=s.nextInt();

        int a=total(a1,a2);
        int b=total(b1,b2);
        int c=total(c1,c2);

        if(a<=b&&a<=c){
            System.out.println(a);
        }
        else{
            if(b<=c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }

        }

    }

    public static int total(int x1,int x2){
        if(x1>=count){
            return x2;
        }
        else{
            int temp=count/x1;
            if((count-(count/x1)*x1)==0){
                return temp*x2;
            }
            else{
                return (temp+1)*x2;
            }
        }


    }
}