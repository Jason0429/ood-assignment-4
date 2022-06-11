package model.commands;

public class Kernel {
  // INVARIANT: ALL KERNELS MUST HAVE ODD DIMENSIONS

  public static double[][] gaussianBlur() {
    double[][] kernel = new double[3][3];
    kernel[0] = new double[]{(1.0 / 16), (1.0 / 8), (1.0 / 16)};
    kernel[1] = new double[]{(1.0 / 8), (1.0 / 4), (1.0 / 8)};
    kernel[2] = new double[]{(1.0 / 16), (1.0 / 8), (1.0 / 16)};
    return kernel;
  }

  public static double[][] sharpen() {
    double[][] kernel = new double[5][5];
    kernel[0] = new double[]{(-1.0 / 8), (-1.0 / 8), (-1.0 / 8), (-1.0 / 8), (-1.0 / 8)};
    kernel[1] = new double[]{(-1.0 / 8), (1.0 / 4), (1.0 / 4), (1.0 / 4), (-1.0 / 8)};
    kernel[2] = new double[]{(-1.0 / 8), (1.0 / 4), 1, (1.0 / 4), (1.0 / 8)};
    kernel[3] = new double[]{(-1.0 / 8), (1.0 / 4), (1.0 / 4), (1.0 / 4), (-1.0 / 8)};
    kernel[4] = new double[]{(-1.0 / 8), (-1.0 / 8), (-1.0 / 8), (-1.0 / 8), (-1.0 / 8)};
    return kernel;
  }
}