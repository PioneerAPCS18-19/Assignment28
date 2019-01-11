# Assignment 28

For this assignment you will perform basic matrix operations (addition, subtraction, and scalar multiplication).

### Something Helpful

You can give initial values for arrays. Ex: `int[] arr = {3, -1, 9, 10};`

You can also do this for 2D arrays. Ex: `int[][] arr = {{1, 2, 3}, {3, -1 , 9}};`

This would give you the following Matrix:

```
[1  2  3]
[3 -1  9]
```

## Method 1 (easier)

You will create one class that has 3 methods: one for adding matrices, one for multiplying a matrix by a scalar (a number), one for subtracting matrices (this is the same as multiplying the second matrix by -1 and then adding, so utilize the two previous methods), and one for printing a matrix.

Each method should print the result. 

## Method 2 (harder)

You will need two classes (`Runner` and `Matrix` classes).

The `Matrix` class will have one class variable, which is the matrix (a 2D array of ints).

The constructor will take one parameter: the matrix

You will have a (getter) method that returns the 2D array class variable.

You will have a method for adding Matrices that returns a `Matrix` object.

You will have a method for multiplying a `Matrix` by a scalar that returns a `Matrix` object.

You will have a method for substracting Matrices that returns a `Matrix` object (hint: use multiplication, then addition methods).

A method for printing `Matrix` objects is included on Github. By including this in the `Matrix` class, you can print objects directly in print statements.

Example:

```
Matrix m = new Matrix(arr);
System.out.println(m);
```

### Sample Outputs

```
[2  3]
[4  10]

+

[1  -1]
[3  -4]

=

[3  2]
[7  6]
```

```
[2  3]
[4  10]

*

-3

=

[-6  -9]
[-12  -30]
```

```
[2  3]
[4  10]

-

[1  -1]
[3  -4]

=

[1  4]
[1  14]
```
### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.

