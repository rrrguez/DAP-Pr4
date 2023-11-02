package animals.eagle;

import java.io.File;

public class DesertEagle extends Eagle {
    public String getName(){
        return "Steppe eagle";
    }
    @Override
    public String showPicture() {
        // Obtenemos la ruta de la imagen
        return "DAP-Pr4-master/src/images/desert_eagle.jpg";
    }
}
