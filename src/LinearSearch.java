public class LinearSearch {

    public static String linersearch(int target, int[] arr) {

        for (int i = 0; i <= arr.length; i++) {
            if ((arr[i]) == target)
                return "TARGET VALUE GOT AT  " + i + " AND VALUE IS "+arr[i];
        }
        return "Not found";
    }

}
