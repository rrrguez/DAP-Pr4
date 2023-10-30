package animals.fox;

import java.io.File;

public class TundraFox extends Fox {
    @Override
    public File showPicture() {
        String imagePath = "/src/images/artic_fox.jpeg";
        return new File(imagePath);
    }
}
