### Java Streame 

**Java Streams**, introduced in Java 8, bring a functional programming flavor to Java by allowing you to process collections of data in a declarative and concise manner. A stream represents a sequence of elements supporting sequential and parallel operations.

**Key Characteristics of Java Streams**

- Declarative: Describe what you want to do, not how.
- Lazy Evaluation: Intermediate operations are only executed when a terminal operation is triggered.
- No Side Effects: Stream operations should not mutate the underlying source.

### Types of Stream Operations

**1. Filter** 
- Filters elements based on a condition.
- It act as a gate .

        list.stream().filter(s -> s.startsWith("A"))

**2. Map** 
- Transforms elements.

         list.stream().map(String::toUpperCase)

**3. Reduce**
- Reduces the elements into one using an accumulator.

      int sum = list.stream().reduce(0, Integer::sum);

**4. FlatMap**
- Flattens nested streams.
- With the help of this we are able to perform operations in each elements 

        Stream<List<String>> listOfLists = ...;
        listOfLists.flatMap(List::stream)

**5. Peek**
- Allows debugging by peeking each element.
- does not affect the data of stream 

      list.stream().peek(System.out::println)

**6.1 Sorted**
- Sorts elements naturally.

      list.stream().sorted()

**6.2 Sorted(Comparator)**
- Sorts elements using a custom comparator.

      list.stream().sorted(Comparator.reverseOrder())

**7. Distinct**
- Removes duplicate elements.

       list.stream().distinct()