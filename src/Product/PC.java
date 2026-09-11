package Product;

public class PC {
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int storage;
    private final String PCcase;

    public PC(String cpu, String gpu, int ram, int storage,String PCcase) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.PCcase=PCcase;
    }

}