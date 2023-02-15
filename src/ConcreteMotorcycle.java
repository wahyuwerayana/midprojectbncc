class Motorcycle extends Kendaraan {
    private String jenis;
    private int helm;
    
    Motorcycle() {
        tipeKendaraan = "Motorcycle";
    }
    
    
    void inputSpecificData(Scanner scanner) {
        System.out.println("Masukkan jenis sepeda motor (Automatic/Manual): ");
        jenis = scanner.nextLine();
        while (!jenis.equals("Automatic") && !jenis.equals("Manual")) {
            System.out.println("Jenis sepeda motor tidak valid, silakan ulangi.");
            System.out.println("Masukkan jenis sepeda motor (Automatic/Manual): ");
            jenis = scanner.nextLine();
        }
        
        System.out.println("Masukkan jumlah helm: ");
        helm = scanner.nextInt();
    }
    
    
    void viewData() {
        System.out.println("Tipe Kendaraan: " + tipeKendaraan);
        System.out.println("Jenis Sepeda Motor: " + jenis);
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Gas Capacity: " + gasCap);
        System.out.println("Jumlah Roda: " + wheel);
        System.out.println("Jumlah Helm: " + helm);
    }
}