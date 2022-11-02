//gfg https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

class Solution
{
    //Function to merge the arrays.
    public static void swap(long[] arr1,long[] arr2,int idx1,int idx2){
        long temp1=getElement(arr1,arr2,idx1);
        long temp2=getElement(arr1,arr2,idx2);
        set(arr1,arr2,idx1,temp2);
        set(arr1,arr2,idx2,temp1);
    }
    public static void set(long[] arr1,long[] arr2,int idx,long val){
        if(idx<arr1.length){
            arr1[idx]=val;
        }else{
            arr2[idx-arr1.length]=val;
        }
        
    }
    
    public static long getElement(long[] arr1,long[] arr2, int idx){
        if(idx<arr1.length)return arr1[idx];
        
        return arr2[idx-arr1.length];
    }
    
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
         for(int i=arr1.length; i< arr1.length+arr2.length ;i++){
                
                for( int j = i ; j > 0  ; j-- ){
                    
                    if( getElement(arr1,arr2,j) < getElement(arr1,arr2,j-1)){
                        swap(arr1,arr2,j,j-1);
                    }else break;
                    
                }
            }
    }
}