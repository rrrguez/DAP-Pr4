package ecosistems;

import animals.Animal;
import animals.bear.MountainBear;
import animals.eagle.MountainEagle;

public class MountainFactory extends EcosystemFactory {
    @Override
    public Animal[] createEcosystem() {
        return new Animal[]{new MountainBear(), new MountainEagle()};
    }
}
