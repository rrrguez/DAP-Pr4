package animals.lion;

import java.io.File;

public class DesertLion extends Lion {
    @Override
    public File showPicture() {
        // Obtenemos la ruta de la imagen
        String imagePath = "/src/images/desert_lion.jpeg";
        return new File (imagePath);
    }
}
