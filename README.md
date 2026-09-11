# PC Builder - Builder Pattern

A simple Java project demonstrating the **Builder Design Pattern**.

# About

This project shows how the Builder Design Pattern could be used to create different PCs with convenient configuration.


# Example

```
PC gamingPC = new GamingPCBuilder()
        .setCPU("Ryzen 7")
        .setGPU("RTX 5070")
        .setCase("ATX")
        .build();
```

The builder automatically uses the default RAM and storage values for both gaming and office PC.

# How to use
In main.java, inside the main method, you may use `PC defaultOffice = director.buildOfficePC();` or create custom PC directly:
```
PC customOffice = new OfficePCBuilder()
        .setGPU("Boring integrated gpu")
        .setCPU("Intel i1 with 1 core")
        .setStorage(512)
        .setCase("Boring black case very big")
        .build();
```
And you can print any PC to see its components: `System.out.println(customOffice);`
