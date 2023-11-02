package animals.lion;

import java.io.File;

public class SavannaLion extends Lion {
    @Override
    public String showPicture() {
        // Obtenemos la ruta de la imagen
        return "DAP-Pr4-master/src/images/savannah_lion.jpg";
    }
    public  String getName(){ return "Congo lion";};

}
