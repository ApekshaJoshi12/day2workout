public class PassArray {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500};
        printArray(numbers);
    }
}
