import java.util.Scanner;

// Kelas Admin
class Admin {
    private final String username = "Admin10";
    private final String password = "Password210";

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private final String nama = "vio yuniar nurdiansyah";
    private final String nim = "202410370110224";

    public boolean login(String inputNama, String inputNim) {
        return nama.equalsIgnoreCase(inputNama) && nim.equals(inputNim);
    }

    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Kelas utama LoginSystem
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("Pilih Jenis Login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            if (pilihan == 1) {
                Admin admin = new Admin();
                System.out.print("Masukkan Username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    System.out.println("Username: " + username);
                    System.out.println("Password: " + password);
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            } else if (pilihan == 2) {
                Mahasiswa mahasiswa = new Mahasiswa();
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan sistem login.");
                ulang = false;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
