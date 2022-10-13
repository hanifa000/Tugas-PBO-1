#include<iostream>
#include<string>
using namespace std;

int main(){

        cout<<"Tentukan Bangku untuk mereka:)\n";
        string mahasiswa[6]={"Dhandy\n", "Ezy\n", "Atiya\n", "Hanny\n", "Putra\n", "Surya\n"};

        for (int i = 0; i < 5; i++) {
            cout<<mahasiswa[i];
        }
 
        string name;
        char nilai;
        cout<<"Isi nilai salah satu siswa"<<endl;
        cout<<"Masukkan Nama : "; cin>>name;
        cout<<"Nama : "<<name<<endl;

        cout<<"Input Nilai "<<name<<" (A - E): "; cin>>nilai;
        cout<<endl;
        //nilai = inp.next().charAt(0);
        if (nilai == 'A' ) {
            cout<<"Pertahankan!\n";
        }
        else if (nilai == 'B' ) {
            cout<<"Harus lebih baik lagi\n";
        }
        else if (nilai == 'C' ) {
            cout<<"Perbanyak belajar\n";
        }
        else if (nilai == 'D' ) {
            cout<<"Jangan keseringan main\n";
        }
        else if (nilai == 'E' ) {
            cout<<"Kebanyakan bolos...\n";
        }
        else {
            cout<<"Maaf, format nilai tidak sesuai"<<endl;
        }
        
    cout<<endl;
    cout<<"Terima Kasih";

        
    return 0;

}

