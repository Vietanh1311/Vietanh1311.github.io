import java.util.ArrayList;

public class MyHashMap {
    private ArrayList<Data> myBucket[];
    private final int SIZE = 1000;

    public MyHashMap() {
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        int hashValue = key % SIZE;
        return hashValue;
    }

    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);

        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }

        int x = 0;
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, 0);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, 0);
        int keyIndex = bucket.indexOf(newData);

        if (keyIndex >= 0) {
            return bucket.get(keyIndex).value;
        }
        return -1;

    }

    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();
        myMap.put(1, 1);
        myMap.put(2, 2);
        myMap.put(1, 2);
        myMap.put(3, 8);

        System.out.println("getKey: " + myMap.get(3));
        myMap.remove(3);
        System.out.println("getKey: " + myMap.get(3));
        System.out.println("getKey: " + myMap.get(1));
    }
}
