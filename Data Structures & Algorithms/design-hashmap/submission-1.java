class MyHashMap {
    private boolean[] data;
    private int[] dataValues;
    public MyHashMap() {
        dataValues = new int[1000001];
        Arrays.fill(dataValues, -1);
    }
    
    public void put(int key, int value) {
        dataValues[key] = value;
    }
    
    public int get(int key) {
        return dataValues[key];
    }
    
    public void remove(int key) {
        dataValues[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */