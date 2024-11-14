#include <iostream>



int factorial(int n);



int main() {

    int n;

    std::cout << "Enter number: ";

    std::cin >> n;

    int fact = factorial(n);

    std::cout << "Factorial of " << n << " is " << fact << std::endl;

    return 0;

}



int factorial(int n) {

    if (n == 0) {

        return 1;

    } else {

        return n * factorial(n - 1);

    }

}