# Count in Shadok
The objective of this kata is to write a converter from number->shadok and for shadok->number.

## Context
https://www.dcode.fr/shadoks-numeral-system#q1
In the animated series Les Shadoks, the characters only communicate using 4 syllables: Ga, Bu, Zo and Meu. These 4 syllables are used as digits to form base 4 numbers.

Shadoks Numeral System uses the base 4 (quaternary base) with the symbols: GA, BU, ZO and MEU, respectively for 0, 1, 2 and 3. To convert a number (decimal in base 10), write it in base 4 and use the Shadoks' symbols (also called GABUZOMEU).

| Number | Shadok |
| --- | --- |
| 1 | BU |
| 2 | ZO |
| 3 | MEU |
| 4 | BUGA |
| 5 | BUBU |
| 6 | BUZO |
| 7 | BUMEU |
| 8 | ZOGA |
| 9 | ZOBU |
| 10 | ZOZO |

## Instructions
There are three principal branches for executing this kata. Choose the branch that fits your need:

### master
An empty maven project. Start from almost 0. You'll need to do the following:
- Choose your version of java and junit. Add the dependencies
- Create your test directories and packages and write your tests
  - This can be done purely in junit OR you can design your tests using Gherkin and Cucumber!
- Write the implementation

### untested
A maven project already setup for writing the tests.
- Write the tests in junit
- Write the implementation in java

### tests
The tests are already written for you !
- Write the implementation in java so that all tests pass.

