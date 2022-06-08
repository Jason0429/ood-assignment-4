package controller;

import controller.ImageLoader;
import model.Image;
import model.Pixel;
import org.junit.Test;

public class ImageLoaderTest {

  @Test
  public void testLoad() {
    Image test = ImageLoader.load("test-images/test3x4.ppm");
    assertEquals(3, test.getWidth());
    assertEquals(4, test.getHeight());
    assertEquals(255, test.getMaxValue());
    assertEquals(new Pixel(255, 252, 186, 3),
        test.getPixelAt(0, 0));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadInvalidLocation() {
    Image test = ImageLoader.load("test-images/imagenotfound.ppm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadNotP3() {
    Image test = ImageLoader.load("test-images/notP3.ppm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadNotEnoughInts() {
    Image test = ImageLoader.load("test-images/notEnoughInts.ppm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadWidthTooSmall() {
    Image test = ImageLoader.load("test-images/widthTooSmall.ppm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadWidthTooLarge() {
    Image test = ImageLoader.load("test-images/widthTooLarge.ppm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadHeightTooSmall() {
    Image test = ImageLoader.load("test-images/heightTooSmall.ppm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadHeightTooLarge() {
    Image test = ImageLoader.load("test-images/heightTooLarge.ppm");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLoadTooManyInts() {
    Image test = ImageLoader.load("test-images/tooManyInts.ppm");
  }
}
