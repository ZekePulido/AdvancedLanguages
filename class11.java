public class class11 {
    public static void main(String[] args){
        int[] num;
        num = new int[5];
        int total = 0;

        for(int i=0; i<num.length; i++){
            num[i] = i+1;
            System.out.println("Num " + Integer.toString(i) + " = "+ num[i]);
        }
        for(int k = 0; k < num.length; k++){
            total = total + num[k];
        }
        System.out.println("Total = " + total);
    }
}
