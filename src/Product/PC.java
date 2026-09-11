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
        this.PCcase = PCcase;
    }

//  basic toString for easy printing
    @Override
    public String toString(){
        return ("PC [CPU:"+cpu+", GPU:"+gpu+", RAM:"+ram+" GB, Storage:"+storage+", Case:"+PCcase+"]");
    }
}