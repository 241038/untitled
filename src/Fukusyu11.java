import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("数値を入力させる");
        int result = num;
        int calcNum = num-1;

        while(calcNum>0){
            result = result * calcNum;
            calcNum--;
        }
        System.out.println("入力値" + num + "の階上" +result);

    }
}
