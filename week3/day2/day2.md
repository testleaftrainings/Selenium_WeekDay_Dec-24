SET:

index value change so we cannot use get()

Collection: Set Definition: The Set interface in Java is a part of the Java Collections Framework. It represents a collection that cannot contain duplicate elements. Properties of Set: No Duplicate Elements: Ensures that each element in the Set is unique. Unordered Collection: Except for some specific implementations like LinkedHashSet or TreeSet, the Set does not guarantee the order of its elements. Implementation Classes: HashSet: Maintains a random order LinkedHashSet: Maintains insertion order of elements. TreeSet: Ascii value Maintains sorted order

collections.sort()=> sameFunction in SET we can get from TreeSET Why There is No get() in Set: The Set interface does not have a get() method, and this is by design, due to the following reasons:

Uniqueness Over Indexing: The Set is designed to ensure uniqueness rather than maintain an index-based system like List. Elements in a Set are not accessed by an index. Undefined Ordering: In most implementations of Set, the order of elements is not fixed. Therefore, retrieving an element by a specific index or position does not make sense.




list => input :[2,4,12,4,56,43,14,22,45]
 output: [2,4,12,4,56,43,14,22,45]

 get(4) ->56

 Set =>input :[2,4,12,4,56,43,14,22,45]
  LinkedHashSet : output:[2,4,12,56,43,14,22,45]
 get(4)->43

 HashSet Output:[4,2,56,14,22,12,45,43]
 get(4) -> 22

 TreeSet ouput:[2,4,12,14,22,43,45,56]
 get(4) ->22

ClassRoom : 1

Load : https://www.snapdeal.com/
Search for shoes
Print how many shoes displayed
Find Price of all the shoes
Remove the duplicate price
Print first price value

ClassRoom 2:

Input : take your name
convert into toCharArray
Create empty Set
Remove duplicate characters
Print in the same order