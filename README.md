# visitorPattern
**Furniture Shipping Cost Calculator**

This is a requirement for Lab Assignment 4 in Software Engineering 2.

## Background
You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). Each furniture type may have unique shipping cost calculations, and implementing shipping logic directly in each furniture class causes tight coupling and maintenance issues.

## Objective
Implement a visitor design pattern approach to calculate shipping costs for different furniture types based on category and size. The system should keep furniture classes separate from shipping logic and use visitor elements to compute shipping charges.

## Requirements

### Waste Container
Create a class to represent waste containers, each with a specific capacity and type of waste (e.g., organic, recyclable, hazardous, electronic).

### Waste Collection Chain
Implement a chain of responsibility pattern to handle different types of waste containers. Each handler in the chain should be responsible for collecting and disposing of a specific type of waste.

### Waste Collection Process
- The system should initialize a chain of waste collectors, each responsible for a different type of waste.
- When a waste container is full or needs disposal, the system should trigger the waste collection process.
- The appropriate waste collector in the chain should handle the disposal based on the type and capacity of the waste container.

### Validation
Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain.

## Execution Flow
- Create waste container objects with their specifications (type and capacity)
- Create waste collector objects in a chain for different waste types
- Process waste containers through the chain
- Collectors examine waste data and perform disposal operations
- Display results dynamically

## Benefits of Chain of Responsibility Pattern
✅ **Separation of Concerns**: Waste container objects don't need to know about disposal logic  
✅ **Easy to Extend**: Add new waste types without modifying existing collector classes  
✅ **Flexible Processing**: Requests can be handled by any collector in the chain  
✅ **Single Responsibility**: Each collector handles one specific type of waste  

## How to Run
Compile and run the main class:

```
javac src/labAssignment4/*.java
java -cp src labAssignment4.ECommerceApp
```

Or use your preferred Java IDE to execute `ECommerceApp.java`.


## UML Diagram
![alt text](https://github.com/ramdcrz/visitorPattern/blob/main/visitorPattern_UML.png)