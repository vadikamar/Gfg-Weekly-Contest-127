class Sol
{
    public static int diffSum(int n,int m,int arr[])
    {
        //code here.
        int s=0;
        Arrays.sort(arr);
        for(int i=0;i<m;i++)
        {
            s+=arr[n-i-1]-arr[i];
        }
        return s;
    }
}
