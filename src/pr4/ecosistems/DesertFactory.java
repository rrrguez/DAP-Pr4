package ecosistems;

import animals.Animal;
import animals.eagle.DesertEagle;
import animals.fox.DesertFox;
import animals.lion.DesertLion;

public class DesertFactory extends EcosystemFactory {
    @Override
    public Animal[] createEcosystem() {
        return new Animal[]{new DesertEagle(), new DesertFox(), new DesertLion()};
    }
}
