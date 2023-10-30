package animals.crocodile;

import java.io.File;

public class JungleCrocodile extends Crocodile {
    @Override
    public File showPicture() {
        String imagePath = "src/images/jungle_crocodrile.jpeg";
        return new File(imagePath);
    }
}
