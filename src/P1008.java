class Main{
    public static void main(String[] args){
        for(int i=123;i<333;i++){
            for(int j=246;j<666;j++){
                start:
                for(int k=369;k<999;k++){
                    if((j==2*i)&&(k==3*i)){
                        String str="";
                        str+=i;
                        str+=j;
                        str+=k;
                        char[] c=str.toCharArray();
                        for(int l=0;l<c.length;l++){
                            for(int m=l+1;m<c.length-1;m++){
                                if(c[m]=='0'){
                                    break start;
                                }
                                if(c[l]==c[m]){
                                    break start;
                                }
                            }
                        }
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}