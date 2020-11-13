#include <iostream>
using namespace std;

void left(int a) {
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << '\n';
    }
}
    
void right(int a) {
    int b = 2 * a - 2;
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= i; j++) {
            cout << " ";
        }
        for (int k = 1; k <= i; k++) {
            cout << "*";
        }
        cout << '\n';
    }
}

void center(int a) {
    for (int i = 1; i <= a; i++) {
        for (int j = a; j > 0; j--) {
            cout << " ";
        }
        for (int k = 1; k <= i; k++) {
            cout << "*";
        }
        for (int l = 1; l <= i - 1; l++) {
            cout << "*";
        }
        cout << '\n';
    }
}

void leftin(int a) {
    for (int i = 1; i <= a; i++) {
        for (int j = a; j > 0; j--) {
            cout << "*";
        }
        cout << '\n';
    }
}

void rightin(int a) {
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= i; j++) {
            cout << " ";
        }
        for (int k = a; k > 0; k--) {
            cout << "*";
        }
        cout << '\n';
    }
}

void centerin(int a) {
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= a; j++) {
            cout << " ";
        }
        for (int k = a; k > 0; k--) {
            cout << "*";
        }
        for (int l = a - 1; l > 0; l--) {
            cout << "*";
        }
        cout << '\n';
    }
}

int main() {
    int a, type;
    cout << "a = ";
    cin >> a;
    cout << "\nlist of types\n1. left\n2. right\n3. center";
    cout << "\n4. leftin\n5. rightin\n6. centerin\n(in = inverted)";
    cout << "\ntype (in number) = ";
    cin >> type;
    switch (type) {
        case 1 :
            left(a);
            break;
        case 2 :
            right(a);
            break;
        case 3 :
            center(a);
            break;
        case 4 :
            leftin(a);
            break;
        case 5 :
            rightin(a);
            break;
        case 6 :
            centerin(a);
            break;
    }
    return 0;
}