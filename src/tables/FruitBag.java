package tables;

import java.util.HashMap;

public class FruitBag {

    public HashMap<Fruit, FruitCounter> fruitBag;

    public FruitBag() {
        this.fruitBag = new HashMap<>();
    }

    public void addFruit(Fruit fruit) {

        if (fruitBag.containsKey(fruit)) {
            FruitCounter fruitCounter = fruitBag.get(fruit);
            fruitCounter.setCount(fruitCounter.getCount() + 1);
        } else {
            FruitCounter fruitCounter = new FruitCounter();
            fruitCounter.setFruit(fruit);
            fruitCounter.setCount(1);
            fruitBag.put(fruit, fruitCounter);
        }
    }
}
