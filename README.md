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
