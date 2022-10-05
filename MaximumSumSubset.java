class Main {
    public static void main(String[] args) {
        int sum =0 , maxsum =0;
       // int[] input = new int[]{-2,3,-20,5,6,-1,25,26};
        int[] input = new int[]{1,-2,3,24,2,-1,-4,3};
        int start = 0,end = input.length;
        for(int i=0;i<input.length;i++)
        {
            sum = input[i];
            for(int j=i+1;j<input.length;j++)
            {
                sum = sum + input[j];
                if(sum > maxsum)
                {
                    maxsum = sum;
                    start =i;
                    end = j;
                }
            }
        }
        System.out.println("Maximum sum is" + maxsum);
        System.out.println("Subset: ");
        for(int x = start;x<=end;x++)
        {
            System.out.print(input[x] + " ");

        }



    }
}
