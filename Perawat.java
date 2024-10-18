public class Perawat extends StaffMedis {
    private String shift;

    // Constructor overloading
    public Perawat() {
        super();
        this.shift = "Tidak diketahui";
    }

    public Perawat(String nama, int tahunBergabung, String shift) {
        super(nama, tahunBergabung);  // Inheritance
        this.shift = shift;
    }

    // Setter dan getter
    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    // Overriding method info()
    @Override
    public void info() {
        System.out.println("Perawat - Nama: " + getNama() + ", Tahun Bergabung: " + getTahunBergabung()
                + ", Shift: " + shift);
    }
}