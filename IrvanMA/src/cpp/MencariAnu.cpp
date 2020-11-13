#include <iostream>
using namespace std;
int isPrimeNumber(int);

int main() {
    int num, primeOne, primeTwo;
    bool isPrimeOne, isPrimeTwo;
    cout << "Enter the number (should be positive): ";
    cin >> num;
    
    for (int i = 2; i < num; i++) {
        isPrimeOne = isPrimeNumber(i);
        if (isPrimeOne == true && num % i == 0) {
            primeOne = i;
            break;
        }
    }
    
    primeTwo = num / primeOne;
    isPrimeTwo = isPrimeNumber(primeTwo);

    if (isPrimeOne == true && isPrimeTwo == true) {
        cout << "The number is half-prime";
        cout << "\nThe equation is: " << primeOne << " * " << primeTwo;
    } else {
        cout << "The number is not half-prime";
    }
}

int isPrimeNumber(int num) {
    bool isPrime = true;

    for (int i = 2; i <= num/2; i++) {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
    }
    return isPrime;
}
