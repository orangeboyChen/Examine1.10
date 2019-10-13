import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int a=bf.read();
        bf.readLine();
        int count=0;
        int temp=0;
        String s=bf.readLine();
        String[] ss=s.split(" ");
        for(int i=0;i<ss.length-1;i++){

            if(Integer.parseInt(ss[i])<Integer.parseInt(ss[i+1])){
                temp++;
            }
            else{
                if(temp>count)count=temp;
                temp=0;
            }
        }

        System.out.println(count+1);
    }
}