package animals.lion;

import java.io.File;

public class SavannaLion extends Lion {
    @Override
    public File showPicture() {
        // Obtenemos la ruta de la imagen
        String imagePath = "/src/images/savannah_lion.jpeg";
        return new File(imagePath);
    }
}
