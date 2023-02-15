abstract class Kendaraan {
    protected String tipeKendaraan;
    protected String brand;
    protected String name;
    protected String licenseNumber;
    protected int topSpeed;
    protected int gasCap;
    protected int wheel;
    
    abstract void inputSpecificData(Scanner scanner);
    abstract void viewData();
}