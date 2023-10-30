package ecosistems;

import animals.Animal;
import animals.fox.TundraFox;

public class TundraFactory extends EcosystemFactory {
    @Override
    public Animal[] createEcosystem() {
        return new Animal[]{new TundraFox()};
    }
}
