package Builder;

import Product.PC;

public class OfficePCBuilder extends PCBuilder {
//    default values for Office PC
    private static final int MIN_RAM = 8;
    private static final int MIN_STORAGE = 256;
    public OfficePCBuilder() {
        this.ram = MIN_RAM;
        this.storage = MIN_STORAGE;
    }
    @Override
    public PC build() {
        validate();

//        checking minimum required values for office PC
        if (ram < MIN_RAM) {
            throw new IllegalStateException(
                    "Office PC requires at least "+MIN_RAM+" GB RAM"
            );
        }

        if (storage < MIN_STORAGE){
            throw new IllegalStateException(
                   "Office PC requires at least "+MIN_STORAGE+" GB of storage"
            );
        }
        return new PC(cpu, gpu, ram, storage, PCcase);
    }
}
