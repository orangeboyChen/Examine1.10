import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        int[] c=new int[a];
        for(int i=0;i<a;i++)c[i]=-1;
        int count=0;
        for(int i=0;i<a;i++)b[i]=s.nextInt();
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++){
                int temp=b[i]+b[j];
                for(int k=0;k<a;k++){
                    if(temp==b[k]){
                        for(int l=0;l<a;l++){
                            if(temp==c[l])break;
                            if(c[l]==-1){
                                c[l]=temp;
                                count++;
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}