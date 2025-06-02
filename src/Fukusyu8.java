import java.io.IOException;

public class Fukusyu8 {
    public static void main(String[] args) throws IOException {
        int[] numlist = (3,5,7,2,8,6);
        int max = numlist[0];
        int min = numlist[0];
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] > max){
                max = numlist[i];
            }
            if(numlist[i] < min){
                min = numlist[i];
            }
        }
        System.out.println("最大値" + max +"最小値" + min);
    }
}
