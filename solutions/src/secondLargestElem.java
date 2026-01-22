public class secondLargestElem {
    public int getSecondLargest(int[] arr) {
        // code here
        int sec = -1, maxx = arr[0];  //first elem is max
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxx) {
                sec = maxx;
                maxx = arr[i];
            } else if (arr[i] < maxx && arr[i] > sec){
                sec = arr[i];
            }
        }

        return sec;
    }
}

/**
 * Logic is simple, keep track of 2 max elems
 */
