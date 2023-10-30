package ecosistems;

import animals.Animal;
import animals.crocodile.SavannaCrocodile;
import animals.fox.SavannaFox;
import animals.lion.SavannaLion;

public class SavannaFactory extends EcosystemFactory {
    @Override
    public Animal[] createEcosystem() {
        return new Animal[]{new SavannaCrocodile(), new SavannaFox(), new SavannaLion()};
    }
}
