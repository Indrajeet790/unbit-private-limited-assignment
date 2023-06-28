import java.util.*;
class HelloWorld {
    
    public static void secondCombination(int target, int[] arr){
     ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            ArrayList<Integer> lt = new ArrayList<>();
            lt.add(arr[i]);
            int s = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                s = s+arr[j];
                if( s < target){
                    lt.add(arr[j]);
                } else if(s == target){
                    lt.add(arr[j]);
                    list.add(lt);
                }
                else{
                   break;
                }
            }
        }
        System.out.print("Second combination"+list);
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 2, -4, -6, -2, 8};
        int target = 3;
        Stack<Integer> s = new Stack<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                        ArrayList<Integer> lt = new ArrayList<>();
                        lt.add(arr[i]);
                        lt.add(arr[j]);
                        list.add(lt);
                        s.add(arr[i]);
                        s.add(arr[j]);
                }
            }
        }
        int [] mrgArr = new int [s.size()];
        int i = 0;
        while(!s.isEmpty()){
            mrgArr[i] = s.pop();
            i++;
        }
        
        Arrays.sort(mrgArr);
        
        for(i = 0; i < mrgArr.length; i++){
            System.out.print(mrgArr[i]+" ");
        }
        
        System.out.println();
        System.out.println("First combination"+list);
        secondCombination(target * 2, mrgArr);
      }
}