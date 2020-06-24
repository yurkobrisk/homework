package HomeWork1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class HomeWork1_7 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\korziuk\\Desktop\\cuple.jpg"); //создание объекта из существующего файла
        try {
            BufferedImage image = ImageIO.read(file); // создание графического объекта из объекта файл
            System.out.println(image);
            StringBuilder txt = new StringBuilder();
            // преобразование картинки в серую
            for (int row = 0; row < image.getWidth(); row++){   // чтение картинки по горизонтали
                for (int column = 0; column < image.getHeight(); column++){ // чтение картинки по вертикали
                    Color clr = new Color(image.getRGB(row, column));   // создание объекта цвет для пикселя из картинки
                    int r = clr.getRed();   // чтение цвета ...
                    int b = clr.getBlue();
                    int g = clr.getGreen();
                    int grey = (int) (r*0.299 + g*0.587 + b*0.114); // алгоритм создания серого цвета на основе RGB
                    int newr = grey; // запись в RGB серого цвета
                    int newb = grey;
                    int newg = grey;
                    Color newClr = new Color(newr, newg, newb);  // создание нового объекта цвет для пикселя из картинки
                    image.setRGB(row,column, newClr.getRGB());   // запись нового цвета пикселя в картинку

                    txt = txt.append(grey);
                }
                txt = txt.append("---\r\n");  // конец строки
            }
            FileWriter fileNewAscii = new FileWriter("C:\\Users\\korziuk\\Desktop\\cuple_new_ascii.txt");
            fileNewAscii.write(txt.toString());

            // сделать ресайз картинки
            //BufferedImage imageAscii = image;  // создал еще один объект картинки

            // формировать текстовый файл сопоставляя определенному значению RGB - символ

            /*String [][] txtArray = new String [image.getWidth()][image.getHeight()];
            int colorRGB = 0; // цвет пикселя
            for (int row = 0; row < image.getWidth(); row++) {   // чтение картинки по горизонтали
                for (int column = 0; column < image.getHeight(); column++) { // чтение картинки по вертикали
                    int rgb = image.getRGB(row, column);
                    txtArray [row] [column] = Integer.toString(rgb) + " ";  // чтение цвета пикселя
                }
            }*/

            // запись в файл серой картинки
            File fileNew = new File("C:\\Users\\korziuk\\Desktop\\cuple_new.jpg"); // создание нового объекта файл
            ImageIO.write(image,"jpg", fileNew); // запись объекта графическая картинка в объект файл


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
