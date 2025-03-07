import java.util.Scanner;

class LoginSystem { //deklarasi kelas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Jenis Login:"); //menampilkan menu login
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) { //memilih pilihan

            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin10") && password.equals("Password210")) {
                System.out.println("Login Admin berhasil!");
                System.out.println("Nama: " + username);
                System.out.println("NIM: " + password);
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            
            if (nama.equals("vio yuniar nurdiansyah") && nim.equals("202410370110224")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close(); //penutup
    }
}
