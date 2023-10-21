class Solution {
    public static void dfs(List<List<Integer>> room,int idx,boolean[] vis,boolean[] unlocked)
    {
        if(!vis[idx] && unlocked[idx])
        {
            vis[idx]=true;
            for(int i=0;i<room.get(idx).size();i++)
            {
                unlocked[room.get(idx).get(i)] =true;
                dfs(room,room.get(idx).get(i),vis,unlocked);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] unlocked = new boolean[n];
        boolean[] vis = new boolean[n];
        unlocked[0]=true;
        for(int i=0;i<n;i++)
        {
            dfs(rooms,i,vis,unlocked);
        }

        for(int i=0;i<n;i++)
        {
            if(unlocked[i]==false) return false;
        }   
        return true;  
    }
}