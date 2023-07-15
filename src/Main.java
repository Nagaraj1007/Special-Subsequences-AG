
public class Main {
    public static int countOfSubsequence(String string){
        int aCount = 0 , finalCount = 0;
        for (int iterator = 0;iterator < string.length() ; iterator++){
            if (string.charAt(iterator) == 'A'){
                aCount++;
            }
            if (string.charAt(iterator) == 'G'){
                finalCount += aCount;
            }
        }
        return finalCount;
    }

    public static void main(String[] args) {
        System.out.println(countOfSubsequence("GAB"));
    }
}