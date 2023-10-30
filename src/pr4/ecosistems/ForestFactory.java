package ecosistems;

import animals.Animal;
import animals.bear.ForestBear;
import animals.fox.ForestFox;

public class ForestFactory extends EcosystemFactory {
    @Override
    public Animal[] createEcosystem() {
        return new Animal[]{new ForestBear(), new ForestFox()};
    }
}
