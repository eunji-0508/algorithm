class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String a = Integer.toString(x);
        String [] stringArray = a.split("");
        int [] intArray = new int [stringArray.length];
        for(int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        for(int arr : intArray) {
            sum += arr;
        }
            return (x % sum == 0);   
    }
}