// Kelas Hewan
class Hewan {
    // Atribut
    private String nama;
    private String jenis;
    private String suara;

    // Konstruktor
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Method untuk mendapatkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("====================");
        System.out.println(" Hewan: " + nama);
        System.out.println(" Jenis: " + jenis);
        System.out.println(" Suara: " + suara);
        System.out.println("====================");
    }
}

// Kelas utama (Main)
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan
        Hewan kucing = new Hewan("Kucing", "Mamalia", "Meow~");
        Hewan anjing = new Hewan("Anjing", "Mamalia", "Guk-Guk!");
        Hewan burung = new Hewan("Burung", "Aves", "Cuit-Cuit");

        // Menampilkan informasi hewan
        kucing.tampilkanInfo();
        anjing.tampilkanInfo();
        burung.tampilkanInfo();
    }
}
