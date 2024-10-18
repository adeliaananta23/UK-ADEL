public class MainClass {
    public static void main(String[] args) {
        Dokter dokter = new Dokter("Dr. Ali", 2015, "Bedah");
        Perawat perawat = new Perawat("Suster Maria", 2018, "Shift Malam");
        Ambulans ambulans = new Ambulans("Ambulans 1", 2020, 2, "https://rumahsakit.com/ambulans");

        // Menggunakan polimorfisme untuk menampilkan informasi
        tampilkanInfoStaff(dokter);
        tampilkanInfoStaff(perawat);
        tampilkanInfoStaff(ambulans);
    }

    public static void tampilkanInfoStaff(StaffMedis staff) {
        staff.info();
    }
}