package Builder;

import Product.PC;

public abstract class PCBuilder {

    protected String cpu;
    protected String gpu;
    protected int ram;
    protected int storage;
    protected String PCcase;

    public PCBuilder setCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public PCBuilder setGPU(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public PCBuilder setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    public PCBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public PCBuilder setCase(String pccase){
        this.PCcase = pccase;
        return this;
    }

    protected void validate() {
        boolean isInvalid = (
                        cpu == null || cpu.isEmpty()
                        || gpu == null || gpu.isEmpty()
                        || PCcase == null || PCcase.isEmpty()
                        || storage < 0 || ram < 0
        );
        if (isInvalid) {
            throw new IllegalStateException("Invalid PC configuration");
        }
    }

    public abstract PC build();
}