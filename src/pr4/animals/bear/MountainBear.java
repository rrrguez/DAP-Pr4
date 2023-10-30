package animals.bear;

import java.io.File;

public class MountainBear extends Bear {
    @Override
    public File showPicture() {
        return new File("src/images/mountain_bear.jpg");
    }
}
