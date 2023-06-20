package SS3;

public class Findless {
    public static void main(String[] args) {
        int arr[][] ={{1,4,6},{9,7,5},{14,5,2}};
        int i;
        int j;
        int min=arr[0][0];
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                if (arr[i][j]<min) { min=arr[i][j];}
            }
        }
        System.out.println("số lớn nhất trong mảng 2 chieu la  "+min);
    }
}

