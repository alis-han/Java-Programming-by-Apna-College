public class inverted_star{
    public static void main(String args[]){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Another LoGIC....

        // for(int i=1;i<=n;i++){
        //     for(int j=n;j<=n-i+1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}