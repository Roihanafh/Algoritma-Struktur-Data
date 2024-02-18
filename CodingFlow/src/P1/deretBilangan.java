package P1;

public class deretBilangan {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <=n; i++) {
            if (i==6||i==10) {
                continue;
            }else if(i%2==1){
                System.out.print("* ");
            }else{
                System.out.print(i+ " ");
            }
        }
    }
}
