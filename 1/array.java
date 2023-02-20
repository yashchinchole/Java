class cal {
    public int add(int a[]) {
        int ans = 0;
        for (int i : a)
            ans += i;

        return ans;
    }
}

public class array {
    public static void main(String[] args) {

        int[][] a = new int[][] { { 1, 2, 3, 4, 5 }, { 4, 4 }, { 2, 2, 2, 2 } }; // declare and initialize 2D array 'a'

        // use enhanced for loop to iterate the 2D array and print out the elements
        for (int[] arrayRow : a) {
            for (int element : arrayRow) {
                System.out.println(element);
            }
        }

        // creating a new object of type cal
        cal obj = new cal();

        // calling add() method on the object and passing the array {1,2,3,4,5}
        int result = obj.add(new int[] { 1, 2, 3, 4, 5 });

        // printing out the result of add()
        System.out.println(result);

    }
}
