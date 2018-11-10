package 冒泡;

public class Test {
    public static void main(String[] args) {
        int[] s = {1,2,3,8,6,9,4};
        int t=0;
        for(int i=1;i<s.length;i++){
            for (int j=1;j<s.length-i;j++){
                if (s[j]>s[j+1]){
                    t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                }
            }
        }
        for (int i=1;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }

}
