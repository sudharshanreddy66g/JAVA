1). Reverse a String:

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed.toString());
    }
}


2). Check if a String is a Palindrome:

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}


3). Find Factorial of a Number:

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}


4). Find Fibonacci Series:


public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + ", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}




5). Check Prime Number:




public class PrimeCheck {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a Prime");
        }
    }
}


