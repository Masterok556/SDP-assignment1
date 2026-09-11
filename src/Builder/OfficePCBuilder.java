package Builder;

import Product.PC;

public class OfficePCBuilder extends PCBuilder {
//    default values for Office PC
    public OfficePCBuilder() {
        this.ram = 8;
        this.storage = 256;
    }
    @Override
    public PC build() {
        validate();

//        checking minimum required values for office PC
        if (ram < 8) {
            throw new IllegalStateException(
                    "Office PC requires at least 8 GB RAM"
            );
        }

        if (storage < 256){
            throw new IllegalStateException(
                   "Office PC requires at least 256 GB of storage"
            );
        }
        return new PC(cpu, gpu, ram, storage, PCcase);
    }
}
