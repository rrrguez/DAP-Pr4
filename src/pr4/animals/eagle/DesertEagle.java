package animals.eagle;

import java.io.File;

public class DesertEagle extends Eagle {
    @Override
    public File showPicture() {
        // Obtenemos la ruta de la imagen
        String imagePath = "src/images/desert_eagle.jpg";
        return new File(imagePath);
    }
}
