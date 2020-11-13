#include <iostream>
using namespace std;

int main() {
    int x, y, z;
    char oper, conti;
    cout << "Insert first number: ";
    cin >> x;
    cout << "Insert second number: ";
    cin >> y;
    cout << "Insert operator: ";
    cin >> oper;
    switch (oper) {
        case '+' :
            z = x + y;
            break;
        case '-' :
            z = x - y;
            break;
        case '*' :
            z = x * y;
            break;
        case '/' :
            z = x / y;
            break;
    }
    cout << "Answer: " << z;
    cout << "\n";
    cout << "Continue? (y/n): ";
    cin >> conti;
    if (conti == 'y') {
        main();
    } else {
        return 0;
    }
}