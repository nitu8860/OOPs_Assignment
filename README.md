# Zero Sum Elements
This Java program finds elements from an input array whose sum is zero. It demonstrates the concept of using cumulative sums and a hashmap to efficiently solve the problem. The program also showcases the use of object-oriented programming (OOPs) concepts.

## Program Description
The program takes an array of positive and negative numbers (excluding zero) as input. It aims to find elements from the array whose sum is zero and returns them. If no such elements exist, it outputs "No Elements found".

The program uses the following steps to find the elements:
1. Iterate through the array and calculate the sum of elements encountered so far.
2. If the sum becomes zero at any index, it means there is a subarray from index 0 to the current index with a sum of zero. Return this subarray as the result.
3. If the sum already exists in a hashmap, it means there is a subarray with a sum of zero between the indices after the previous occurrence of the sum and the current index. Return this subarray as the result.
4. If the sum does not exist in the hashmap, store it along with the current index in the hashmap.
5. If no subarray with a sum of zero is found, return "No Elements found".

## Object-Oriented Programming (OOPs) Concepts

This program incorporates the following OOPs concepts:

1. Encapsulation: The program defines a class named `Main`, which encapsulates the logic and functionality to find elements with a zero sum.

2. Modularity: The program breaks down the problem into smaller methods like `sumElements` to calculate the subarray with a sum of zero, and `main` to handle user input and display the result.

3. Reusability: The `sumElements` method can be reused in other parts of the program or in different programs to find subarrays with a specific sum.

## Instructions

1. Compile the Java program using the following command:
    javac Main.java
2. Run the program using the following command:
    java Main
3. Follow the prompts:
- Enter the number of elements in the array.
- Enter the elements of the array one by one.

4. The program will display the elements whose sum is zero or the "No Elements found" message.

## Screenshots
![OOPs Assignment 1 – Main java 16-06-2023 19_51_35](https://github.com/nitu8860/OOPs_Assignment/assets/112774001/4451ed7d-06ba-498d-a3ba-3ed23cd6b5d1)
![OOPs Assignment 1 – Main java 16-06-2023 19_54_40](https://github.com/nitu8860/OOPs_Assignment/assets/112774001/5b00b6ed-72a2-4f07-8a5c-d02adb6e3828)

