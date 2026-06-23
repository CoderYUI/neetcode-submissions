class MyHashMap {
    private boolean[] data;
    private int[] dataValues;
    public MyHashMap() {
        data = new boolean[1000001];
        dataValues = new int[1000001];
    }
    
    public void put(int key, int value) {
        data[key] = true;
        dataValues[key] = value;
    }
    
    public int get(int key) {
        if(!data[key]) return -1;
        else return dataValues[key];
    }
    
    public void remove(int key) {
        dataValues[key] = 0;
        data[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */