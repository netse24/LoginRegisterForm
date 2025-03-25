/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.geom.Ellipse2D;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class CircleProfilePicture extends JPanel {

    private final Image image;

    public CircleProfilePicture(ImageIcon icon) {
        if (icon != null) {
            System.out.println("Image loaded successfully.");
            this.image = icon.getImage(); // Use the provided image
        } else {
            System.out.println("Loading default image.");
            URL imgURL = getClass().getResource("/loginRegisterForm/default_profile.jpg");
            if (imgURL != null) {
                this.image = new ImageIcon(imgURL).getImage();
            } else {
                System.err.println("Default image not found at path: " + imgURL);
                this.image = null;
            }
        }
        this.setPreferredSize(new Dimension(100, 100)); // Set preferred size for the panel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        if (image != null) {
            Ellipse2D.Double clip = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
            g2d.setClip(clip);
            g2d.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        } else {
            // ✅ Draw a gray circle as a fallback
            g2d.setColor(Color.GRAY);
            g2d.fillOval(0, 0, getWidth(), getHeight());
        }

        g2d.dispose();
    }
}
