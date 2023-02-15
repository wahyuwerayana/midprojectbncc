class Car extends Kendaraan {
    private String jenis;
    private int entertainmentSystem;
    
    Car() {
        tipeKendaraan = "Car";
    }
    
    
    void inputSpecificData(Scanner scanner) {
        System.out.println("Masukkan jenis mobil (SUV/Supercar/Minivan): ");
        jenis = scanner.nextLine();
        while (!jenis.equals("SUV") && !jenis.equals("Supercar") && !jenis.equals("Minivan")) {
            System.out.println("Jenis mobil tidak valid, silakan ulangi.");
            System.out.println("Masukkan jenis mobil (SUV/Supercar/Minivan): ");
            jenis = scanner.nextLine();
        }
        
        System.out.println("Masukkan jumlah entertainment system: ");
        entertainmentSystem = scanner.nextInt();
    }
    
    
    void viewData() {
        System.out.println("Tipe Kendaraan: " + tipeKendaraan);
        System.out.println("Jenis Mobil: " + jenis);
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Gas Capacity: " + gasCap);
        System.out.println("Jumlah Roda: " + wheel);
        System.out.println("Jumlah Entertainment System: " + entertainmentSystem);
    }
}