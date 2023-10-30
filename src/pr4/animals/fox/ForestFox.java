package animals.fox;

import java.io.File;


public class ForestFox extends Fox {
    @Override
    public File showPicture() {
        // Obtenemos la ruta de la imagen
        String imagePath = "/src/images/forest_fox.jpeg";
        return new File(imagePath);
    }
}
