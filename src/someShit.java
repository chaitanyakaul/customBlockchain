public class someShit {


    public static void main(String args[])
    {
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        int[] secondArray = new int[nums.length];

        int counter = 0;
        for(int i = 0;i<nums.length;i++)
        {
            counter+=nums[i];
            secondArray[i] = counter;
        }

        for(int i = 0;i<nums.length;i++)
        {
         System.out.print(" "+secondArray[i]);
        }

        // if i = 3     j = 4

        int first = secondArray[0]-nums[0];
        System.out.println();
        System.out.println("first is "+first);

        System.out.println("final result is "+ (secondArray[4]-first));


    }
}
