package animals.lion;

import java.io.File;

public class DesertLion extends Lion {

    public String getName(){
        return "South African Lion";
    }
    @Override
    public String showPicture() {
        // Obtenemos la ruta de la imagen
        return "DAP-Pr4-master/src/images/desert_lion.jpg";
    }
}
