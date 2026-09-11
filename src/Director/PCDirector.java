package Director;

import Builder.GamingPCBuilder;
import Builder.OfficePCBuilder;
import Builder.PCBuilder;
import Product.PC;

public class PCDirector {
    public PC buildGamingPC(){
        return new GamingPCBuilder()
                .setCPU("Intel i7")
                .setGPU("RTX 5050")
                .setRAM(32)
                .setStorage(2048)
                .setCase("RGB cool case")
                .build();
    }

    public PC buildOfficePC(){
        return new OfficePCBuilder()
                .setCPU("intel i5")
                .setGPU("Integrated")
                .setRAM(8)
                .setStorage(512)
                .setCase("Standard black case")
                .build();
    }
}