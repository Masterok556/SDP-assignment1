package Builder;

import Product.PC;

public class GamingPCBuilder extends PCBuilder {
//    default values for Gaming PC
    private static final int MIN_RAM = 16;
    private static final int MIN_STORAGE = 1024;

    public GamingPCBuilder() {
        this.ram = MIN_RAM;
        this.storage = MIN_STORAGE;
    }

    @Override
    public PC build() {
        validate();

//        checking minimum required values for gameing PC
        if (ram < MIN_RAM) {
            throw new IllegalStateException(
                    "Gaming PC requires at least "+MIN_RAM+" GB RAM"
            );
        }

        if (storage < MIN_STORAGE){
            throw new IllegalStateException(
                    "Gaming PC requires at least "+MIN_STORAGE +" GB of storage"
            );
        }

        return new PC(cpu, gpu, ram, storage, PCcase);
    }
}
