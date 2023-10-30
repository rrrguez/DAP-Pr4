package animals.eagle;

import java.io.File;

public class MountainEagle extends Eagle {
    @Override
    public File showPicture() {
        // Obtenemos la ruta de la imagen
        String imagePath = "src/images/mountain_eagle.jpg";
        return new File(imagePath);
    }
}
