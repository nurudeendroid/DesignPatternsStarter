# Design Patterns

These are the specifications for labs for each of the design patterns we are covering.

Each part builds upon the previous part to demonstrate how design patterns can work together

## Unit Tests

To ensure that your implementation meets the desired requirements, remember to write tests for each behavior you are implementing. Following the principles of Test Driven Development will help to ensure a functioning end product at the end of these labs.

## Instructions 

### Factory

#### Part 1:

Implement the Factory Method pattern in the hierarchy for `CupDispenser` to mirror that of the `DrinkDispenser`. You should implement subclasses `CoffeeCupDispenser`, `BeerGlassDispenser`, and `SodaCupDispenser`. You may also want to implement the classes `CoffeeCup`, `BeerGlass` and `SodaCup`.

#### Part 2:

Follow the Abstract Factory pattern to complete the hierarchy for the `DispensingSystem`. Include at least two concrete dispensing systems of your choice and fill in any missing components needed. (Eg: if you want to make a `BeerDispensingSystem` you will need to create the `Beer` and `BeerDispenser` classes, which we did not make yet)

### Singleton

The various dispensers we created in the previous lab don't have any internal state, so it may not make sense to create new ones every time we request a dispenser. Turn the various subclasses of `DrinkDispenser` and `CupDispenser` into singletons so that only one instance of each is created when requesting them from the various Dispensing Systems.

- Here is [a brief article discussing Java singletons in greater depth](http://www.softwaregeek.net/2013/01/singleton-design-pattern-in-java.html)

### Facade

When you go to a restaurant (or diner or coffee shop) you don't usually expect to have to construct your drink yourself -- you just order it, and shortly afterward the server returns with your drink. Implement the Facade pattern in the form of a class called `DrinkServer` that that handles the process of serving you a drink, and all you have to know is how to `orderCoffee()`, `orderSoda()` or `orderBeer()`

### Observer

Let's keep track of how much of each beverage each server sells. We can do this using the observer pattern and the built in `Observable` class and `Observer` interface in Java. Refactor your `DrinkServer` to extend the `Observable` class and notify its observers each time a drink is served. The notification should include a description of what drink was served.