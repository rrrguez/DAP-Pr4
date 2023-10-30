package animals.fox;

import java.io.File;


public class SavannaFox extends Fox {
    @Override
    public File showPicture() {
        // Obtenemos la ruta de la imagen
        String imagePath = "/src/images/savannah_fox.jpeg";
        return new File(imagePath);
    }
}

