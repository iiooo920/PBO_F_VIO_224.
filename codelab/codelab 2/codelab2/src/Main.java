// Kelas RekeningBank
class RekeningBank {
    // Atribut
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Constructor untuk mengisi data rekening saat objek dibuat
    RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("--------------------");
    }

    // Method untuk setor uang
    void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor Rp" + jumlah + " berhasil!");
        System.out.println("Saldo sekarang: Rp" + saldo);
        System.out.println("--------------------");
    }

    // Method untuk tarik uang
    void tarikUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik Rp" + jumlah + " berhasil!");
            System.out.println("Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println("Saldo tidak cukup!");
        }
        System.out.println("--------------------");
    }
}

// Kelas utama (Main)
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("2203001", "Budi Santoso", 500000);
        RekeningBank rekening2 = new RekeningBank("2203002", "Ani Wijaya", 750000);

        // Menampilkan informasi rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        rekening1.setorUang(250000); // Menambah saldo rekening1
        rekening2.tarikUang(300000); // Mengurangi saldo rekening2
    }
}
