package Hashmap;

import java.util.LinkedList;


public class HashmapImplementation {

    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        public class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }

        }
        private int n;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i = 0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc = key.hashCode();
            return(Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll ,K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size(){
            return n;
        }

        public void put(K key, V value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket =  buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei == -1){   // key doesn't exist, we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }else{   // updated case
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){    // key exist
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }else{    // key doesn't exist
                return null;
            }
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){  // key exist
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }else{ // key doesn't exist
                return null;
            }
        }

    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("d", 4);
        System.out.println("Testing size " + mp.size());
        mp.put("a", 20);
        System.out.println("Testing size " + mp.size());

        // testing get
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("ayushi"));
        
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("b"));
        System.out.println();
        System.out.println("Testing size " + mp.size());


    }
    
}
