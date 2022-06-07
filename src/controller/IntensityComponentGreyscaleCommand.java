package controller;

import model.Pixel;

public class IntensityComponentGreyscaleCommand
        extends ImageProcessingNoParamCommand implements ImageProcessingCommand {

  /**
   * Creates a new command that creates greyscale images using the intensity of each pixel.
   */
  public IntensityComponentGreyscaleCommand() {

  }

  /**
   * Produces the greyscale version of the pixel using the intensity of each pixel.
   *
   * @param pixel      the pixel to be processed
   * @param parameters should not have any parameters
   * @return the greyscale version of the pixel using the intensity of the pixel
   * @throws IllegalArgumentException if the pixel is null, or if parameters are passed
   */
  @Override
  Pixel processPixel(Pixel pixel, int... parameters) throws IllegalArgumentException {
    if (parameters.length > 0) {
      throw new IllegalArgumentException("This command does not accept parameters");
    }

    return new Pixel(pixel.getMaxValue(), (int) pixel.getIntensity(),
            (int) pixel.getIntensity(), (int) pixel.getIntensity());
  }
}