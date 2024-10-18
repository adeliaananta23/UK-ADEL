public class StaffMedis {
    private String nama;
    private int tahunBergabung;

    // Constructor overloading
    public StaffMedis() {
        this.nama = "Tidak diketahui";
        this.tahunBergabung = 0;
    }

    public StaffMedis(String nama, int tahunBergabung) {
        this.nama = nama;
        this.tahunBergabung = tahunBergabung;
    }

    // Setter dan getter (Encapsulasi)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTahunBergabung(int tahunBergabung) {
        this.tahunBergabung = tahunBergabung;
    }

    public int getTahunBergabung() {
        return tahunBergabung;
    }

    // Method virtual untuk polimorfisme (Overriding)
    public void info() {
        System.out.println("Nama: " + nama + ", Tahun Bergabung: " + tahunBergabung);
    }
}
