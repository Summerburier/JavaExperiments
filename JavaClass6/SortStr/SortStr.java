public class SortStr {
    private static void toInt(String[] strs,int[] ints) {
        for (int i = 0; i < strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }
    }
    public static void Sort(String[] strs){
        int[] ints = new int[strs.length];
        toInt(strs, ints);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            strs[i] = Integer.toString(ints[i]);
        }
    }

}
