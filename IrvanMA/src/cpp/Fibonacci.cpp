#include <iostream>
using namespace std;

int main() {
    int a = 0, b = 1, c, hasil = 0;
    for (int i = 2; i < 1000; i += b) {
        c = a + b;
        a = b;
        b = c;
        if (c % 2 == 0) {
            hasil += c;
            cout << hasil;
            cout << "\n";
        }
    }
}