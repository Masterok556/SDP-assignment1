import Builder.GamingPCBuilder;
import Builder.OfficePCBuilder;
import Builder.PCBuilder;
import Director.PCDirector;
import Product.PC;

public class Main{
    public static void main(String[] args){
        PCDirector director = new PCDirector();

        PC defaultGaming = director.buildGamingPC();
        PC defaultOffice = director.buildOfficePC();

        PC customGaming = new GamingPCBuilder()
//                did not add ram and storage to check default values
                .setGPU("Ultra RTX 9090")
                .setCPU("Intel i96 mega ultra pro 9999 cores")
                .setCase("Ultra cool neon RGB with water cooling system ")
                .build();

        PC customOffice = new OfficePCBuilder()
                .setGPU("Boring integrated gpu")
                .setCPU("Intel i1 with 1 core")
                .setStorage(512)
                .setCase("Boring black case very big")
                .build();


        System.out.println(defaultGaming);
        System.out.println(defaultOffice);
        System.out.println(customGaming);
        System.out.println(customOffice);
    }
}