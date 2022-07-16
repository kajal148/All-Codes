class Solution {
    public int[] sortArray(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1,5,2)); 

        sort(arr);
//         System.out.println(arr);
        return nums;
    }
    
    public ArrayList<Integer>sort(ArrayList<Integer> arr){
        if(arr.size() == 1){
            return arr;
        }
        
        int temp = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
//         System.out.println("DEL "+ arr);
        sort(arr);
//         System.out.println("INSERT "+ arr);
        insert(arr, temp);
        
        return arr;
    }
    
    public void insert(ArrayList<Integer> arr, int temp){
        if(arr.size() == 0 || arr.get(arr.size() - 1) < temp){
            arr.add(temp);
            return;
        }
        
        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        
        insert(arr, temp);
        arr.add(val);
        return;
    }
}
