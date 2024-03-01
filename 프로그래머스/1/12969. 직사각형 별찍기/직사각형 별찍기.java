import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String [][] starArr = new String[b][a];
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                starArr[i][j] = "*";
                System.out.print(starArr[i][j]);
            }
            System.out.println();
        }
    }
}