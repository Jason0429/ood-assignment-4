package model;

/**
 * Enumerates exception messages to be used through program.
 */
public enum ExceptionMessage {
  NULL_VALUE("Value cannot be null."),
  NULL_VALUES("Values cannot be null."),
  SPECIFIC_NULL_ARGUMENT("%s cannot be null."),
  PIXEL_RGB_INVALID_RANGE("Values must be between 0 and the maximum value."),
  INVALID_FILE_PATH("Invalid file path."),
  INVALID_PPM_FILE("Invalid PPM file: plain RAW file should begin with P3."),
  OUT_OF_BOUNDS("Value out of bounds"),
  STRING_CANNOT_BE_EMPTY("%s cannot be empty."),
  SPECIFIC_NOT_FOUND("%s could not be found");

  private final String message;

  ExceptionMessage(String message) {
    this.message = message;
  }

  /**
   * Returns the message as a string.
   *
   * @return the message as a string.
   */
  @Override
  public String toString() {
    return this.message;
  }
}
