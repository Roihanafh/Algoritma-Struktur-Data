package P1;

public class bioskop {
    public static void main(String[] args) {
        int ratingPenonton[][]={{4,1,1},{3,1,2},{4,2,3},{4,3,4}};
        int totalRating[]=new int[4];
        double rataRating[][]= new double[4][2];
        for (int i = 0; i < rataRating.length; i++) {
            rataRating[i][1]=i;
        }
        for (int i = 0; i < ratingPenonton.length; i++) {
            for (int j = 0; j < ratingPenonton[i].length; j++) {
                totalRating[i]+=ratingPenonton[i][j];
            }
        }
        for (int i = 0; i < rataRating.length; i++) {
            // System.out.println(totalRating[i]);
            
            rataRating[i][0]=rataRating(totalRating[i], ratingPenonton[i].length);
            System.out.printf("\nRata-rata rating dari film ke-%d : %.2f ",(i+1),rataRating[i][0]);
        }
        System.out.println();
        shorting(rataRating);
        for (int i = 0; i < rataRating.length; i++) {
            System.out.printf("Film dengan rating ke-%d adalah film ke %d dengan rating sebesar %.2f\n",(i+1),((int)rataRating[i][1]+1),rataRating[i][0]);
        }

    }

    static double rataRating(int totalRating,int banyakPenonton){
        double rataRating= (double)totalRating/banyakPenonton;
        return rataRating;
    }

    static void shorting(double arr[][]){
        double temp, temp1;
        boolean swap;
        for (int i = 0; i < arr.length-1; i++) {
            swap=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j][0]<arr[j+1][0]) {
                    temp=arr[j+1][0];//swap rating
                    arr[j+1][0]=arr[j][0];
                    arr[j][0]=temp;
                    temp1=arr[j+1][1];//swapCabang
                    arr[j+1][1]=arr[j][1];
                    arr[j][1]=temp1;
                    swap=true;
                }
            }
            if (swap==false) {
                break;
            }
        }
    }
}
