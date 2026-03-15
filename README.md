# visitorPattern
**Furniture Shipping Cost Calculator**

This is a requirement for Lab Assignment 4 in Software Engineering 2.

## Background
You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). Each furniture type has unique shipping cost calculations, and implementing shipping logic directly inside each furniture class causes tight coupling and maintenance issues.

## Objective
Implement a visitor design pattern approach to calculate shipping costs for different furniture types based on their category-specific attributes. The system should keep furniture classes separate from shipping logic and use visitor elements to compute shipping charges.

## Requirements

### Furniture Items
Create classes to represent furniture items, each with category-specific attributes:
- `Chair` — defined by material (e.g., Wood, Plastic)
- `Table` — defined by weight (in kg)
- `Sofa` — defined by shipping distance (in km)

### Shipping Calculator Visitor
Implement the visitor pattern to handle shipping cost calculations for each furniture type. Each visitor should define a `calculate()` method for every concrete furniture class.

### Shipping Calculation Process
- The system should initialize a list of furniture items representing a shopping cart.
- When shipping costs need to be computed, the system should trigger the visitor's calculation logic.
- The appropriate `calculate()` method should be called based on the concrete type of each furniture item.

### Validation
Ensure that each furniture type is correctly handled by the visitor and that shipping costs are computed according to the item's specific attributes.

## Execution Flow
- Create furniture objects with their specifications (material, weight, or distance)
- Create a `StandardShipping` visitor instance
- Pass each furniture item through the visitor via `accept()`
- The visitor examines each item's data and computes its shipping cost
- Display the per-item breakdown and total shipping cost

## Benefits of Visitor Pattern
✅ **Separation of Concerns**: Furniture classes don't need to contain any shipping logic  
✅ **Easy to Extend**: Add new shipping strategies without modifying existing furniture classes  
✅ **Flexible Processing**: Different visitors can define different pricing algorithms  
✅ **Single Responsibility**: Each visitor handles one specific shipping strategy  

## How to Run
Compile and run the main class:
```
javac src/labAssignment4/*.java
java -cp src labAssignment4.ECommerceApp
```

Or use your preferred Java IDE to execute `ECommerceApp.java`.


## UML Diagram
![alt text](https://github.com/ramdcrz/visitorPattern/blob/main/visitorPattern_UML.png)