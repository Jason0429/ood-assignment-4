package view.gui;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class ImagePreview extends JScrollPane {
  private final JLabel label;

  public ImagePreview() {
    ImageIcon icon = new ImageIcon();
    this.label = new JLabel(icon);
    this.setViewportView(this.label);
  }

  public void updateImage(BufferedImage img) {
    this.label.setIcon(new ImageIcon(img));
  }
}
