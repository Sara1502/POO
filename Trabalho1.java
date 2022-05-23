import java.io.*;

class Trabalho1{
    static int N = 2;

    static void rotar90horario(int arr[][]){
        for (int j = 0; j < N; j++){
            for (int i = N - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[][] = { { 2, 3 },
                        { 4, 5 } };
        rotar90horario(arr);
    }
}
