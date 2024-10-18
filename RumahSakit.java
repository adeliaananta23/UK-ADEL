public class RumahSakit {
    private String namaRumahSakit;

    // Constructor
    public RumahSakit(String namaRumahSakit) {
        this.namaRumahSakit = namaRumahSakit;
    }

    // Setter dan getter
    public void setNamaRumahSakit(String namaRumahSakit) {
        this.namaRumahSakit = namaRumahSakit;
    }

    public String getNamaRumahSakit() {
        return namaRumahSakit;
    }

    public void infoRumahSakit() {
        System.out.println("Nama Rumah Sakit: " + namaRumahSakit);
    }
}
