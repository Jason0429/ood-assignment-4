import controller.ImageProcessingControllerImpl;
import model.ImageProcessingModel;
import model.ImageProcessingModelImpl;
import model.commands.ImageProcessingCommand;
import view.ImageProcessingTextView;
import view.ImageProcessingView;

/**
 * This class represents an image processor program that can import, manipulate, and export .PPM
 * files.
 */
public class ImageProcessor {

  /**
   * Starts the program.
   *
   * @param args takes no arguments
   */
  public static void main(String[] args) {
    ImageProcessingModel model = new ImageProcessingModelImpl();
    ImageProcessingView view = new ImageProcessingTextView();
    ImageProcessingControllerImpl controller = new ImageProcessingControllerImpl(model, view);
    controller.start();
  }
}