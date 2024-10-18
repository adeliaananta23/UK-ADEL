public class Ambulans extends StaffMedis {
    private int kapasitasPasien;
    private String urlWebsite;

    // Constructor overloading
    public Ambulans() {
        super();
        this.kapasitasPasien = 0;
        this.urlWebsite = "https://rumahsakit.com/ambulans";
    }

    public Ambulans(String nama, int tahunBergabung, int kapasitasPasien, String urlWebsite) {
        super(nama, tahunBergabung);  // Inheritance
        this.kapasitasPasien = kapasitasPasien;
        this.urlWebsite = urlWebsite;
    }

    // Setter dan getter
    public void setKapasitasPasien(int kapasitasPasien) {
        this.kapasitasPasien = kapasitasPasien;
    }

    public int getKapasitasPasien() {
        return kapasitasPasien;
    }

    public void setUrlWebsite(String urlWebsite) {
        this.urlWebsite = urlWebsite;
    }

    public String getUrlWebsite() {
        return urlWebsite;
    }

    // Overriding method info()
    @Override
    public void info() {
        System.out.println("Ambulans - Nama: " + getNama() + ", Tahun Bergabung: " + getTahunBergabung()
                + ", Kapasitas Pasien: " + kapasitasPasien + " orang");
        System.out.println("Website: " + urlWebsite);
    }
}