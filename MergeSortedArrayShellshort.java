//lc:88 Merge Sorted Array (using Shel short)
//complexity O(nlogn)

class Solution {
    public static void swap(int[] arr1,int idx1,int idx2){
        int temp=arr1[idx1];
        arr1[idx1] = arr1[idx2];
        arr1[idx2]=temp;
   }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //copy arr2 int arr1 
        for(int i=0 ; i<nums2.length ;i++){
            nums1[m+i]=nums2[i];
        }
        
        //  
        for(double  gap=(m+n)/2  ; gap >= 1.0 ; gap = gap/2.0 ){//logn complexity
            int ceil =(int)Math.ceil(gap); 
             
            gap=ceil;
            
            for(int i=0 ; i+ceil < m+n ; i++ ){
                //O(n) complex
                if(nums1[i]> nums1[i+ceil]){
                    swap(nums1, i , i+ceil );
                }
                
            }//l2
            
        }//l1
    }
}