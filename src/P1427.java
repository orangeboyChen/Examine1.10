import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]){
        List<Integer> list=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        int a;
        int[] convert;
        while(true){
            a=scanner.nextInt();
            if(a==0){
                break;
            }
            list.add(a);
        }
        
        convert=new int[list.size()];
        String str="";
        for(int i=0;i<list.size();i++){
            str+=list.get(list.size()-i-1).toString()+" ";
        }
        System.out.println(str);
    }
}