import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[][] = new int[n][2];
        for (int i=0;i<n;i++){
            data[i][0] = scn.nextInt();
            data[i][1] = getSum(data[i][0]);
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (data[i][1] > data[j][1]){
                    int tmpV1 = data[i][0];
                    data[i][0] = data[j][0];
                    data[j][0] = data[j][0];
                    data[j][0] = tmpV1;
                    tmpV1 = data[i][1];
                    data[i][1] = data[j][1];
                    data[j][1] = tmpV1;
                }else if (data[i][1] == data[j][1]){
                    if (data[i][0] > data[j][0]){
                        int tmpV1 = data[i][0];
                        data[i][0] = data[j][0];
                        data[j][0] = data[j][0];
                        data[j][0] = tmpV1;
                        tmpV1 = data[i][1];
                        data[i][1] = data[j][1];
                        data[j][1] = tmpV1;
                }
            }
        }
    }
    for (int i=0;i<n;i++){
            System.out.print(data[i][0] + " ");
    }
    System.out.println();
}
private static int getSum(int v1){
        int sum = 0;
        while (v1 > 0){
            sum += v1 % 10;
            v1 /= 10;
        }
        return  sum;
    }
}
