package animals.fox;

import java.io.File;

public class DesertFox extends Fox {
    public String getName(){
        return "Fennec fox";
    }
    @Override
    public String showPicture() {
        // Obtenemos la ruta de la imagen
        return "DAP-Pr4-master/src/images/desert_fox.jpg";
    }
}
