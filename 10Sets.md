# Set 
represents a collection of objects where each object in the Set is unique. 
In other words, the same object cannot occur more than once in a Java Set. 

## Set vs List 
Both interfaces represents a collection of elements


the same element cannot occur more than once in a Java Set. This is different from a Java List where each element can occur more than once.

The second difference between a Java Set and Java List interfaces is, that the elements in a Set has no guaranteed internal order. 
The elements in a List has an internal order, and the elements can be iterated in that order.


## declaring 
Set setA = new EnumSet();
Set setB = new HashSet();
Set setC = new LinkedHashSet();
Set setD = new TreeSet();

## adding elements 
Set setA = new HashSet();

setA.add("element 1");
setA.add("element 2");
setA.add("element 3");

## iterate elements 
### using an iterator 
Iterator iterator = set.iterator();
while(iterator.hasNext(){
  String element = (String) iterator.next();
}

### using a foreach loop 
for(Object object : set) {
    String element = (String) object;
}

## removing 
//one element 
set.remove("object-to-remove");

//all elements 
set.clear(); 

## add from another set 
Set set = new HashSet();
set.add("one");
set.add("two");
set.add("three");

Set set2 = new HashSet();
set2.add("four");

set2.addAll(set);

## remove all from another collection 
Set set = new HashSet();
set.add("one");
set.add("two");
set.add("three");

Set set2 = new HashSet();
set2.add("three");

set.removeAll(set2);

## get size 
int size = set.size();

##check if empty
isEmpty = set.isEmpty();

## check if it contains a certain element 
boolean contains123 = set.contains("123");


## set to list 
Set set = new HashSet();
set.add("123");
set.add("456");

List list = new ArrayList();
list.addAll(set);


# Sorted Set 
It behaves like a normal set with the exception that the elements are sorted internally. 
This means that when you iterate the elements of a SortedSet the elements are returned in the sorted order.

SortedSet setA = new TreeSet();

Comparator comparator = new MyComparator();
SortedSet setB = new TreeSet(comparator);

# Navigable Set 
It behaves like a SortedSet with the exception you have navigation methods available in addition to the sorting mechanisms of the SortedSet.

here is a list of methods you can apply to them 
## descendingIterator() and descendingSet()


## headSet(), tailSet() and subSet()
    The headSet() will return those lower than the given parameter
    tailSet() - return values higher than the given parameter 
    subSet() - return values between the 2 given parameters 

    NavigableSet headset = original.headSet("3", true);  //the true is for including the parameter value or not  //by defaut its inclusive 

    NavigableSet subset = original.subSet("2", true, "4", true); 

## ceiling(), floor(), higher() and lower()
ceiling() - returns the lowest value 
floor() - returns the highest value 

The higher() method returns the least (smallest) element in this set that is greater than (not equal too) the element passed as parameter to the higher() method. Here is an example: 

lower() i opposite of higher()

Object higher = original.higher("2");

Object lower = original.lower("2");



## pollFirst() and pollLast()
he pollFirst() method returns and removes the "first" element in the NavigableSet or null if the set is empty. The pollLast() returns and removes the "last" element in the set or null if the set is empty. "First" means smallest element according to the sort order of the set. "Last" means largest according to teh element sorting order of the set. 

NavigableSet original = new TreeSet();
original.add("1");
original.add("2");
original.add("3");


//first is "1"
Object first = original.pollFirst();

//last is "3"
Object last = original.pollLast();

