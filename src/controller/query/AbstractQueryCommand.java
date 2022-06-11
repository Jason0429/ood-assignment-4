package controller.query;

import java.io.IOException;
import java.util.function.Consumer;

import model.ExceptionMessage;
import model.ImageProcessingModel;
import view.ImageProcessingView;

/**
 * Represents the abstract class for a query command.
 */
public abstract class AbstractQueryCommand implements QueryCommand {
  protected ImageProcessingModel model;
  protected ImageProcessingView view;

  /**
   * Constructs an abstract query command.
   *
   * @param model the image processing model for image storage.
   * @param view  the image processing view responsible for rendering output.
   */
  public AbstractQueryCommand(ImageProcessingModel model, ImageProcessingView view) {
    this.model = model;
    this.view = view;
  }

  @Override
  public void execute(String[] query) {
    try {
      this.executeCommand(query);
    } catch (IllegalArgumentException e) {
      this.writeMessage(e.getMessage());
    }
  }


  /**
   * Wrapper method for rendering message to view.
   *
   * @param message the message to be rendered.
   * @throws IllegalStateException if an IOException is thrown.
   */
  private void writeMessage(String message) throws IllegalStateException {
    try {
      this.view.renderMessage(message);
    } catch (IOException e) {
      throw new IllegalStateException("Failed to display message");
    }
  }

  /**
   * Throws an exception if the query length is not correct.
   *
   * @param length the set number of allowed tokens in the query.
   * @throws IllegalArgumentException if the query length does not equal the given length.
   */
  protected void checkQueryLength(String[] query, int length) throws IllegalArgumentException {
    if (query.length != length) {
      throw new IllegalArgumentException(ExceptionMessage.INVALID_COMMAND_PARAMETERS.toString());
    }
  }

  /**
   * Executes the proper command.
   *
   * @param query the query to be processed and executed.
   */
  protected abstract void executeCommand(String[] query) throws IllegalArgumentException;
}
