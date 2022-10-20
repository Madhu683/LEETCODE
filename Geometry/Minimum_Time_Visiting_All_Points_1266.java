class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length==1) return 0;
        int sec=0;
        for(int i=0;i<points.length-1;i++)
        {   
            //minimal secons can find by maximum of abs of diiference between x1 and x2 and abs of diiference between y1 and y2 
            sec+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return sec;
    }
}
