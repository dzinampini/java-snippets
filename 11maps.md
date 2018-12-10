# Maps 
represents a mapping between a key and a value. 
More specifically, a Java Map can store pairs of keys and values. 
Each key is linked to a specific value. 
Once stored in a Map, you can later look up the value using just the key. 


## Types of Maps 

    java.util.HashMap
    java.util.Hashtable
    java.util.EnumMap
    java.util.IdentityHashMap
    java.util.LinkedHashMap
    java.util.Properties
    java.util.TreeMap
    java.util.WeakHashMap


Map mapA = new HashMap();
Map mapB = new TreeMap();

## adding elements 
Map mapA = new HashMap();

mapA.put("key1", "element 1");
mapA.put("key2", "element 2");
mapA.put("key3", "element 3");

## inserting elements from another map 
Map mapA = new HashMap();
mapA.put("key1", "value1");
mapA.put("key2", "value2");

Map mapB = new HashMap();
mapB.putAll(mapA);

## check if map contains key
boolean hasKey = mapA.containsKey("123");

## check if map contains value 
boolean hasKey = mapA.containsKey("123");

## Iterating values
Iterator iterator = mapA.keySet().iterator();
while(iterator.hasNext(){
  Object key   = iterator.next();
  Object value = mapA.get(key);
}

for(Object key : mapA.keySet()) {
    Object value = mapA.get(key);
}

##removing values 
mapA.remove("key1");

mapA.clear();

## replacing a value

map.replace("key", "new value");

## checking number of entries 
int entryCount = mapA.size();

## Sorted Map 
addition that the elements stored in the map are sorted internally.

The order of the sorting is either the natural sorting order of the elements (if they implement java.lang.Comparable), or the order determined by a Comparator that you can give to the SortedSet.

By default the elements are iterated in ascending order, starting with the "smallest" and moving towards the "largest". But it is also possible to iterate the elements in descending order using the method TreeMap.descendingKeySet(). 



SortedMap mapA = new TreeMap();

Comparator comparator = new MyComparator();
SortedMap mapB = new TreeMap(comparator);


## Navigable Map
 It has a few extensions to the SortedSet which makes it possible to navigate the map


    descendingKeySet() and descendingMap()
    headMap(), tailMap() and subMap()
    ceilingKey(), floorKey(), higherKey() and lowerKey()
    ceilingEntry(), floorEntry(), higherEntry() and lowerEntry()
    pollFirstEntry() and pollLastEntry()

    