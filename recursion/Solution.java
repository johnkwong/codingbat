/*
factorial 
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/

public int factorial(int n){
    if(n == 0) return 1;
    else return n * factorial(n-1);
}

/*
bunnyEars 
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/

public int bunnyEars(int bunnies){
    if(bunnies == 0)
        return 0;
    return 2+ bunnyEars(bunnies - 1);
}

/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
*/

public int bunnyEars2(int bunnies){
    if(bunnies == 0)
        return 0;
    if(bunnies % 2 == 0)
        return 3 + bunnyEars2(bunnies - 1);
    else
        return 2 +  bunnyEars2(bunnies - 1);
}
