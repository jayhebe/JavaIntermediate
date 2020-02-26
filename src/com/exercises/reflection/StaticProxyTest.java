package com.exercises.reflection;

interface ClothesFactory {
    void produceClothes();
}

class ProxyClothesFactory implements ClothesFactory {
    private ClothesFactory factory;

    public ProxyClothesFactory(ClothesFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceClothes() {
        System.out.println("Factory preparing...");
        factory.produceClothes();
        System.out.println("Factory ending...");
    }
}

class NikeClothesFactory implements ClothesFactory {
    @Override
    public void produceClothes() {
        System.out.println("Nike is producing...");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        NikeClothesFactory nike = new NikeClothesFactory();
        ProxyClothesFactory proxy = new ProxyClothesFactory(nike);
        proxy.produceClothes();
    }
}