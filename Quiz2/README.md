# Quiz 2 - first PR

## Part 1 - Fundamentals

### StringUtils
* `padLeft(String, int): String`
* `padRight(String, int): String`
* `repeatString(String, int): String`
* `replaceLastSubString(String, String): String`
* `replaceNthSubstring(String, String, int): String`
* `getIndexOfNthSubstring(String, String, Integer): Integer`
* `getNumberOfOccurrences(String, String): Integer`
* `isAlphaString(String): Boolean`
* `isNumericString(String): Boolean`
* `isSpecialCharacterString(String): Boolean`

## Part 2 - Arrays
### IntegerArrayUtils
* `add(Integer[], Integer): Integer[]`
* `insert(Integer[], int, Integer): Integer[]`
* `get(Integer[], Integer[]): Integer`
* `incrementEvenDecrementOdd(Integer[]): Integer[]`
* `incrementEven(Integer[]): Integer[]`

### StringArrayUtils
* `getSubArray(String[], int, int): String[]`
* `getEndingArray(String[], int): String[]`

## Part 3 - Object Orientation
### Address
* `Address()`
* `Address(String, String, String, String, String)`
* `getAddressLine1(): String`
* `setAddressLine1(String): void`
* `getAddressLine2(): String`
* `setAddressLine2(String): void`
* `getCity(): String`
* `setCity(String): void`
* `getState(): String`
* `setState(String): void`
* `getZipcode(): String`
* `setZipcode(String): void`

### Person
* `Person()`
* `Person(Long, String, Address)`
* `getId(): Long`
* `setId(Long): void`
* `getName(): String`
* `setName(String): void`
* `getAddress(): String`
* `setAddress(String): void`

### Animal
* `Animal()`
* `Animal(Long, Person)`
* `getId(): Long`
* `setId(Long): void`
* `getOwner(): Person`
* `setOwner(Person): void`
* `getAddress(): Address`
* `setAddress(Address): void`

### Dog
* `speak(): String`


## Part 4 - Collections
### Family
* `add(Person): void`
* `contains(Person): Boolean`
* `remove(Person): void`
* `get(int): Person`
* `where(Predicate<Person>): List<Person>`
* `whereNameStartsWith(String): List<Person>`







## Part 5 - Generics
To complete this portion, merge in the `generic` branch with `git merge generic`.

`Shelter` is a generic class that holds Objects that extends `Ageable`. For example, if a Person and a Dog extends Ageable, then I can declare the following:

```
Shelter<Person> farmHouse = new Shelter<Person>();
Shelter<Dog> dogHouse = new Shelter<Dog>();
```

You only need to edit the `Shelter` class.

Add the following methods to the `Shelter` class:
1. `int size()` returns the number of objects in the shelter
2. `void add(ager)` adds a new object to the shelter
3. `removeLast()` removes the last object added from the shelter and return it. If the shelter is empty, then return null.
4. `getYoungest` returns the youngest ageable object in the shelter. For example, if Mimi who is born in  2000, and John who is born in 2010, then the method should return John because John was born after Mimi, therefore he is younger than Mimi.
