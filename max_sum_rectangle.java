//https://www.codingninjas.com/codestudio/problems/maximum-sum-rectangle_1082564?leftPanelTab=0

public class Solution
{
     public static int kadane(int [] arr,int n){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            sum=Math.max(sum+arr[i],arr[i]);
            maxSum=Math.max(sum,maxSum);
        }

        return maxSum;
    }

public static int maxSumRectangle(int[][] arr, int n, int m)
    {
     
//         int n=arr.length;
//         int m=arr[0].length;
        int [] temp= new int[n];
        int maxSum=Integer.MIN_VALUE;
        
        for(int left=0;left<m;left++){
              for(int i=0;i<n;i++){
                  temp[i]=0;
              }
              for(int right=left;right<m;right++){
                  
                  for(int i=0;i<n;i++){
                      temp[i]+=arr[i][right];
                  }
                  int sum=kadane(temp,n);
                  maxSum=Math.max(maxSum,sum);
                  
              }
            
        }
        
        return maxSum;
    }
}
