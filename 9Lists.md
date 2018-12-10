# Lists 
an ordered sequence of objects



##declaring 
List listA = new ArrayList();
List listB = new LinkedList();
List listC = new Vector();
List listD = new Stack();

meaning there are different type of lists, but i will keep focus on the arraylist 

##insert elements
listA.add("element 1");
listA.add("element 2");
listA.add("element 3");

or insert at a specific point
list.add(0, "element 4");

##mixing lists (addAll)
List listSource = new ArrayList();
listSource.add("123");
listSource.add("456");

List listDest   = new ArrayList();

listDest.addAll(listSource);

##get list elements 
String element0 = (String) listA.get(0);
String element1 = (String) listA.get(1);
String element3 = (String) listA.get(2);

##get index of a certain element 
int index1 = list.indexOf(element1);
int index2 = list.indexOf(element2);

##last index of a certain element 
list.add(element1);
list.add(element2);
list.add(element1);

int lastIndex = list.lastIndexOf(element1);

##checking if a list contains a certain element 
boolean containsElement =
    list.contains("element 1");
  if (containsElement == true ){
  	do this and not that 
}


##remove elements from a list 
String element = "first element";
list.add(element);

list.remove(element);


##remove all elements in a list
List list = new ArrayList();

list.add("object 1");
list.add("object 2");
//etc.

list.clear();


## retain elements 
List list      = new ArrayList();
List otherList = new ArrayList();

list.add(element1);
list.add(element2);
list.add(element3);

otherList.add(element1);
otherList.add(element3);
otherList.add(element4);

list.retainAll(otherList);

join list but will remove the members already in other list 
List list      = new ArrayList();

list.add("element 1");
list.add("element 2");
list.add("element 3");
list.add("element 3");

Set set = new HashSet();
set.addAll(list);
## list size 
List list = new ArrayList();

list.add("object 1");
list.add("object 2");

int size = list.size();

## convert list to set 
List list = new ArrayList();

list.add("element 1");
list.add("element 2");
list.add("element 3");
list.add("element 3");

Set set = new HashSet();
set.addAll(list);

##converting list to array 
List<String> list = new ArrayList<>();

list.add("element 1");
list.add("element 2");
list.add("element 3");
list.add("element 3");

String[] objects1 = list.toArray(new String[0]);

## convert array to list 
String[] values = new String[]{ 
	"one", "two", "three" 
};

List list = Arrays.asList(values);

##Iterating a list 
###iterator 
Iterator iterator = list.iterator();
while(iterator.hasNext()) {
    Object next = iterator.next();
}
###foreach loop 
for(Object element : list) {
    System.out.println(element);
}

###for loop
for(int i=0; i < list.size(); i++) {
    Object element = list.get(i);
}



