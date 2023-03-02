

public class Main {
    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5,6}};
        int[][] allTranspoz=new int[arr[0].length][arr.length];


        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                allTranspoz[j][i]=arr[i][j];
            }

        }

        for (int[] ints : allTranspoz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}