class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
     
        int[] result = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int count=0;
            for(int j=0;j<points.length;j++)
            {   
                //Euclidean Distance formula
                //(Raduis)^2=(x2-x1)^2+(y2-y1)^2
                double x = Math.pow(queries[i][0]- points[j][0],2);
                double y = Math.pow(queries[i][1]- points[j][1],2);
                double r = Math.pow(queries[i][2],2);
                
                // if distance is lesser than or equal to radius square means point inside circle
                if(x+y<=r) count++;
            }
            result[i]=count;
        }
        return result;
    }
}