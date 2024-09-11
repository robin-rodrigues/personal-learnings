class Solution {
    public void duplicateZeros(int[] arr) {

        int[] tempArr = new int[arr.length];

        int i = 0;
        int j = 0;
        while (j < arr.length) {

            if (arr[i] != 0) {
                tempArr[j] = arr[i];
                j++;
            } else {
                tempArr[j] = 0;
                j++;
                if (j < arr.length) {
                    tempArr[j] = 0;
                    j++;
                }
            }
            i++;

        }

        for (i = 0; i < arr.length; i++) {
            arr[i] = tempArr[i];
        }

    }
}