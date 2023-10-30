package animals.crocodile;

import java.io.File;

public class SavannaCrocodile extends Crocodile {
    @Override
    public File showPicture() {
      String imagePath = "src/images/savanna_crocodrile.jpeg";
      return new File(imagePath);
    }
}
