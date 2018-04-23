# Workers
John owns a factory that produces mechanical parts. Each part is built by hand by one or several workers. Each part is 
numbered sequentially: 1, 2, 3, 4, 5, and so on.

Each worker is identified by a number, and works on mechanical parts based on that number:

The first worker (number 1) works on the parts: 1, 2, 3, 4, 5, ....
The second worker (number 2) works on every second part : 2, 4, 6, 8, 10, ....
The third worker (number 3) works on every third part : 3, 6, 9, 12, 15, ....
There are infinitely many workers, numbered starting with 1. Each worker generates a cost for each part where he works on, as follows:

Worker number 1: 10 RON 
Worker number 2: 20 RON
Worker number 3: 30 RON
Worker number N: N*10 RON
Considering this, the first 9 parts produced will cost:

Part 1: 10 RON.
Part 2: 30 RON.
Part 3: 40 RON.
Part 4: 70 RON.
Part 5: 60 RON.
Part 6: 120 RON.
Part 7: 80 RON.
Part 8: 150 RON.
Part 9: 130 RON.

The first part costs 10 RON: it is produced just by Worker 1, so it costs 1 * 10 = 10 RON. The fourth part costs 70 RON, because it is produced by 
workers 1, 2, and 4,  so it costs 10 + 20 + 40 = 70 RON.

You will receive as an input an amount S. Please find the exact part that has the production cost S. Return -1 in case there is no part that costs exactly S. 
Example:
S = 120  : Your program should return: 6

S = 20  : Your program should return: -1 
