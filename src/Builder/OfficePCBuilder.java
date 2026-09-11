package Builder;

import Product.PC;

public class OfficePCBuilder extends PCBuilder {
    @Override
    public PC build() {
        boolean isInvalid = (cpu == null || gpu == null || PCcase ==null || storage<0
                ||cpu.isEmpty() || gpu.isEmpty() ||PCcase.isEmpty()
        );
        if (isInvalid) {
            throw new IllegalStateException("");
        }

        return new PC(cpu, gpu, ram, storage, PCcase);
    }
}
