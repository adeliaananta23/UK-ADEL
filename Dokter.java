public class Dokter extends StaffMedis {
    private String spesialis;

    // Constructor overloading
    public Dokter() {
        super();
        this.spesialis = "Tidak diketahui";
    }

    public Dokter(String nama, int tahunBergabung, String spesialis) {
        super(nama, tahunBergabung);  // Inheritance
        this.spesialis = spesialis;
    }

    // Setter dan getter
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getSpesialis() {
        return spesialis;
    }

    // Overriding method info()
    @Override
    public void info() {
        System.out.println("Dokter - Nama: " + getNama() + ", Tahun Bergabung: " + getTahunBergabung()
                + ", Spesialis: " + spesialis);
    }
}