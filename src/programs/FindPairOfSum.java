package programs;

/**
 * You have list of numbers, ranging from 50 to 450 with difference of 50,
 * pair of numbers which will give you 500 as a results, No duplicates pair allowed
 */
public class FindPairOfSum {
    public static void main(String[] args) {
        int [] numbers = {50,100,150,200,250,300,350,400,450,500};
        int target = 500;
        for (int i=0; i<numbers.length; i++){
            for (int j=i+1; j<numbers.length; j++){
                if (numbers[i]+numbers[j] == target){
                    System.out.println(""+numbers[i]+","+numbers[j]);
                }
            }
        }
    }

    static void usingStream(int[] numbersArray){
        
    }


}
