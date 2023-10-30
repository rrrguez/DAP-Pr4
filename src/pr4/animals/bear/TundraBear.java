package animals.bear;

import java.io.File;

public class TundraBear extends Bear {

  @Override
  public File showPicture() {
    String imagePath = new String("/src/tundra_bear.jpg");
    return new File(imagePath);
  }

}
