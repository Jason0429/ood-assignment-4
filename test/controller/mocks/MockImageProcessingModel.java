package controller.mocks;

import java.io.IOException;

import model.Image;
import model.ImageProcessingModel;

/**
 * This class is a mock implementation of the {@code ImageProcessingModel} for testing.
 */
public class MockImageProcessingModel implements ImageProcessingModel {
  private final Appendable log;

  /**
   * Constructs a new mock {@code ImageProcessingModel}.
   *
   * @param log the log output
   */
  public MockImageProcessingModel(Appendable log) {
    this.log = log;
  }

  @Override
  public void storeImage(String name, Image img) throws IllegalArgumentException {
    try {
      this.log.append(String.format("Store Image: %s\n", name));
    } catch (IOException e) {
      throw new IllegalStateException("Unable to write to log");
    }
  }

  @Override
  public Image getImage(String name) throws IllegalArgumentException {
    try {
      this.log.append(String.format("Get Image: %s\n", name));
      return null;
    } catch (IOException e) {
      throw new IllegalStateException("Unable to write to log");
    }
  }

  @Override
  public String[] getImageNames() {
    try {
      this.log.append("Get Image Names\n");
      return new String[0];
    } catch (IOException e) {
      throw new IllegalStateException("Unable to write to log");
    }
  }
}
