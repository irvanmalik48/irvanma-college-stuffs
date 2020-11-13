#include <iostream>
#include <fstream>
#include <bits/stdc++.h> 
using namespace std;

void shuffle_array(string arr[], int n) {
    unsigned seed = 0;
    shuffle(arr, arr + n, default_random_engine(seed));
}

int main() {
    string filename, cont;
    int m, n;
    cout << "-------------------------------------------";
    cout << "\n|        Program Pengacak Kelompok        |";
    cout << "\n-------------------------------------------";
    cout << "\nInputkan total siswa: ";
    cin >> n;
    string arr[n] = {};
    cout << "Inputkan nama siswa: \n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    shuffle_array(arr, n);
    cout << "Inputkan jumlah anggota perkelompok: ";
    cin >> m;
    cout << "Inputkan nama file: ";
    cin >> filename;

    ofstream kelompok;
    kelompok.open(filename + ".txt");
    if (kelompok.is_open()) {
        for (int i = 0; i < n; i++) {
            kelompok << arr[i] + " \r\n";
            if ((i + 1) % m == 0) {
                kelompok << " \r\n";
            }
        }
    }
    kelompok.close();

    cout << "Operasi berhasil. Silahkan cek textfile output.";
    cout << "\nLanjut lagi? (y/n): ";
    cin >> cont;

    if (cont == "y") {
        system("cls");
        main();
    }
    else {
        return 0;
    }
}
