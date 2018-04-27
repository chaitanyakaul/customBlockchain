public class MS {
    static public int[] numbers;
    static public int[] helper;

    public static void main(String args[])
    {

        numbers = new int[]{7, 1, 4};
        helper = new int[numbers.length];
        mergeSort(0, numbers.length-1);


        for(int num: numbers)
            System.out.println(num);

    }


    public static void mergeSort(int low, int high)
    {
        if(low<high)
        {
            int mid = low + (high-low)/2;
            mergeSort(low, mid);
            mergeSort(mid+1, high);
            merge(low, mid, high);
        }
    }

    public static void merge(int low, int mid, int high)
    {
        System.out.println("low "+low+ " Mid is "+mid + " high is "+high);
        //copy both parts to helper array
        for(int i = low;i<=high;i++)
        {
            helper[i] = numbers[i];
        }
        int i = low;
        int j = mid+1;
        int k = low;

        while(i<=mid && j<=high)
        {
            if(helper[i]<=helper[j])
            {
                numbers[k] = helper[i];
                i++;
            }
            else
            {
                numbers[k] = helper[j];
                j++;
            }
            k++;

        }
        while(i<=mid)
        {
            numbers[k] = helper[i];
            k++;
            i++;
        }


    }
}
