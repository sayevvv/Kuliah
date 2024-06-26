package latianUTS;

public class Prog {
    String accountNumber, name, phone, email;
    int balance;

    public Prog(String acc, String n, String p, String e, int b) {
        accountNumber = acc;
        name = n;
        phone = p;
        email = e;
        balance = b;
    }
    void tampil(){
        System.out.println("Nomor akun : " + accountNumber);
        System.out.println("Nama : " + name);
        System.out.println("Nomor Telefon : " + phone );
        System.out.println("Email " + email);
        System.out.println("Saldo : " + balance);
    }
    void TambahSaldo(int x) {
        balance += x;
    }
    void TarikSaldo(int y){
        balance -= y;
    }
}
