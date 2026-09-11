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

    public abstract PC build();
}