# 4.1 Problem

from simple fibonacci :

```
public static long fibonacci(int n) {
 // the base case
 if (n < 2) return 1;
 // the recursive step
 return fibonacci(n-1) + fibonacci(n-2);
}
```

this code slow when we try to find ```fibonacci(45) ```

or other ```int n``` because when we call this method it's will call itself 2 time

``` fibonacci(n-1) + fibonacci(n-2) ```

that made runtime of this method is ```O(2^n)```
