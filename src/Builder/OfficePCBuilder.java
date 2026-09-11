package Builder;

import Product.PC;

public class OfficePCBuilder extends PCBuilder {
    @Override
    public PC build() {
        return new PC(cpu, gpu, ram, storage, PCcase);
    }
}
