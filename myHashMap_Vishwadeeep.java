// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Drying running the program once, and the finding the corner cases for this logic of %1000000.


class MyHashMap {
        int[] HashArr= new int[1000000];
    /** Initialize your data structure here. */
    public MyHashMap() {
        // Filling the array with -1 from index 0
        Arrays.fill(HashArr, -1);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int indexVal=key%1000000;
        HashArr[indexVal]=value;
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int indexVal=key%1000000;
        return HashArr[indexVal];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int indexVal=key%1000000;
        HashArr[indexVal]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
