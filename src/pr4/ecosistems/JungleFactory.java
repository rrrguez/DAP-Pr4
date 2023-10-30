package ecosistems;

import animals.Animal;
import animals.crocodile.JungleCrocodile;


public class JungleFactory extends EcosystemFactory {
    @Override
    public Animal[] createEcosystem() {
        return new Animal[]{new JungleCrocodile()};
    }
}
