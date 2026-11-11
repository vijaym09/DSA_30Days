class TwoSum{
   public static int[] twoSum(int arr[], int target){

        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    return new int[]{i,j};
               }
               
            }
           
        }
    return new int[]{};
    }   
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int target=6;
        int result[]=twoSum(arr, target);
        System.out.println(arr[result[0]]+" "+arr[result[1]]);
        
    }
}
