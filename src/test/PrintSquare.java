package test;

public class PrintSquare {

    public static void main(String[] args) {
        int count =0;
        for(int index=0; index<5; index++){
            if(count ==0 || count ==4){
                System.out.println("*****");
            }else{
                System.out.println("*   *");
            }
            count++;
        }
    }
}
