# Builder Pattern

## Intent  

To reduce declaring several constructors when creating an object.

## Motivation  

With several options available at object creation time, we can delegate this optional parameter handling to a inner static class named by convention as "Builder".

## Applicability  

Defining classes with dozens of constructors just for the sake of providing client to have multiple creation options may result in lots of repetitive and messy code.
Builder pattern solves this problem by providing factory "Builder" methods.


## Participants  
  - **Class** - Main class in which Builder will be defined
  - **Builder** - A class that defines all factory methods.
  

## Credits
- [Journal Dev](https://www.journaldev.com/1425/builder-design-pattern-in-java)
- [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns)
