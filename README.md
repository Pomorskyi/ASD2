# Instructions
The data is a binary tree labeled with the letters of the English alphabet. A word in this tree is defined as a sequence of vertex labels on the way from the leaf to the root. Find and list the last of these words alphabetically. 

## Input 
A series of lines describing the vertices. Each line describes one vertex and looks like this: XY where: X - vertex label Y - a string of letters L (left) and R (right) defining the path from the root to the vertex 

## Example: 
B LLR - means that the vertex to which we get from the root left (L), left (L), and right (R) are labeled B. 

## Output 
A string of letters that forms the last word alphabetically among all words in the tree. 

### Requirements 
• Average time complexity: O (nlogn). 

• Memory complexity: O (n). 

• The program must read input data from the file, the location of which is given in the first parameter of calling the program. 

• The only thing the program prints must be the line that contains the answer. 

• The entire solution must be contained in one file. 

• We assume correctness of the input data. 

• It is forbidden to use ready-made solutions from Java (or other), such as ArrayList or StringBuilder. The exceptions are those solutions that are used for I / O operations (eg Scanner in Java) and the String class and methods on it. 

• Failure to comply with the requirements and comments described in this file results in obtaining 0 points, regardless of whether the program is working properly. 

## Examples 
### Input

G RR 

A 

C L 

F LLR 

X LLL 

F R 

X RL 
H LL 

### Output

XHCA