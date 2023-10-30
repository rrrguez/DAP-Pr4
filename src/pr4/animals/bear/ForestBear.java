package animals.bear;

import java.io.File;

public class ForestBear extends Bear {
    @Override
    public File showPicture() {
        return new File("src/images/forest_bear.jpg");
    }
}
