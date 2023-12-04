/**
 * Bubbelsort
 */
public class Bubbelsort {

    public static void main(String[] args) {
        int [] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*1231);
        }
        System.out.print("Unsortiert: " + "\t");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.out.println();

        sort(array);

        System.out.print("Sortiert: " + "\t");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.err.println();
    }
    public static void sort(int[] arr){
        boolean getauscht = true;
        while (getauscht) {
            getauscht = false; 
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i-1]){
                    int t = arr[i-1];
                    arr[i-1] = arr[i];
                    arr [i] = t;
                    getauscht = true;
                }
            }
        }
    }
}