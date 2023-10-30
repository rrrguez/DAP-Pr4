package animals.fox;

import java.io.File;

public class DesertFox extends Fox {
    @Override
    public File showPicture() {
        // Obtenemos la ruta de la imagen
        String imagePath = "/src/images/desert_fox.jpg";
        return new File(imagePath);
    }
}
