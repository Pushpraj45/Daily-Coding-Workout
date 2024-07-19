class LRUCache
{
    int capacity;
    Queue<Integer> q=new ArrayDeque<>();//faster than LinkedList//to store the key according to  LRU principal
    Map<Integer,Integer> map=new LinkedHashMap<>();//To store key and value pair 
    
    public LRUCache(int capacity) 
    {
        this.capacity = capacity;//cache size 
    }
    
    public int get(int key)
    {
        if (map.containsKey(key)) 
        {//cache updating 
            q.remove(key);//O(n)
            q.offer(key);//O(1)
            return map.get(key);//O(1)
        } 
        else 
            return -1;//key is npt found 
    }
    
    public void put(int key, int value) 
    {
        if(map.containsKey(key)) //if key is present in the map, key has to be searched and deleted and then enqueue the key into the queue, according to LRU principal
        {
            q.remove(key);//O(n)//remove the key from the queue 
            q.offer(key);//O(1)//apeend at the end of the queue(enqueue)
            map.put(key,value);//O(1)//overwriding the key value (key is always unique)
        }
        else 
        {
            if(q.size() < capacity)
                q.offer(key);//inserting the new key into the queue 
            else 
            {//q.size() == capacity
                map.remove(q.poll());//removing the least recently used key 
                q.offer(key);//qppending the new key to the queue
            }
            map.put(key,value);//putting the key value pair 
        }
    }
}