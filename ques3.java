class Solution{
    public int[] minQuery(int N, int Q, int A[], List<List<Integer>> Queries){
        // Code Here.
        int ans[]=new int[Q];
        for(int i=0;i<Q;i++)
        {
            int s=A[Queries.get(i).get(0)-1];
            for(int j=Queries.get(i).get(0);j<Queries.get(i).get(1);j++)
            s&=A[j];
            int r=A[Queries.get(i).get(2)-1];
            for(int j=Queries.get(i).get(2);j<Queries.get(i).get(3);j++)
            r&=A[j];
            ans[i]=(s|r);
        }
        return ans;
    }
}
