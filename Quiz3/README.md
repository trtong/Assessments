Hi~ # Pig Latin
* Pig Latin is an English language game where the goal is to hide the meaning of a word from people not aware of the rules.
* The rules themselves are rather easy:
* 1) The word starts with a vowel(a,e,i,o,u) -> return the original string plus "way".
* 2) The word starts with a consonant -> move consonants from the beginning of the word to the end of the word until the first vowel, then return it plus "ay".
* 3) The result must be lowercase, regardless of the case of the input. If the input string has any non-alpha characters, the function must return None, null, Nothing (depending on the language).
* 4) The function must also handle simple random strings and not just English words.
* 5) The input string has no vowels -> return the original string plus "ay".
* For example, the word "spaghetti" becomes "aghettispay" because the first two letters ("sp") are consonants, so they are moved to the end of the string and "ay" is appended.


# Square Array Checker
* Given two arrays `a` and `b` write a method `compare(a, b)` that returns true if the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in `b` are the elements in `a` squared, regardless of the order.


#### Example 1 - Valid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
```
* `compare(a, b)` returns true because in `b`
	* 121 is the square of 11,
	* 14641 is the square of 121,
	* 20736 the square of 144,
	* 361 the square of 19,
	* 25921 the square of 161,
and so on.



#### Example 2 - Invalid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
```
`compare(a,b)` returns `false` because in `b` 132 is not the square of any number of `a`.


#### Example 3 - Invalid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
```

`comp(a,b)` returns `false` because in `b` 36100 is not the square of any number of `a`.
