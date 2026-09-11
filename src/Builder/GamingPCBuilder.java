package Builder;

import Product.PC;

public class GamingPCBuilder extends PCBuilder {

    @Override
    public PC build() {
        validate();

        if (ram < 16) {
            throw new IllegalStateException(
                    "Gaming PC requires at least 16 GB RAM"
            );
        }

        if (storage < 1024){
            throw new IllegalStateException(
                    "Gaming PC requires at least 1 TB of storage"
            );
        }

        return new PC(cpu, gpu, ram, storage, PCcase);
    }
}
