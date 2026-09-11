package Director;

import Builder.GamingPCBuilder;
import Builder.OfficePCBuilder;
import Builder.PCBuilder;
import Product.PC;

public class PCDirector {

//    default Gaming PC set
    public PC buildGamingPC(){
        return new GamingPCBuilder()
                .setCPU("Intel I7")
                .setGPU("RTX 5050")
                .setRAM(16)
                .setStorage(1024)
                .setCase("RGB cool case")
                .build();
    }
//  default Office PC Set
    public PC buildOfficePC(){
        return new OfficePCBuilder()
                .setCPU("Intel I5")
                .setGPU("Integrated")
                .setRAM(8)
                .setStorage(512)
                .setCase("Standard black case")
                .build();
    }
}