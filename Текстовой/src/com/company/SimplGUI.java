package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;            // Подключение библиотек для
import java.io.PrintWriter;     // записи в файл.
import java.io.IOException;     // Отслеживание ошибок при работе с файлом.
import java.io.BufferedReader;  // Подключение библиотек для
import java.io.FileReader;      // чтения из файла.

public class SimplGUI extends JFrame {
    private JButton button = new JButton("Сохранить");
    private JButton button1 = new JButton("Открыть");
    private TextField input1 = new TextField("", 5);

    public SimplGUI() {
        super("Формачка");
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input1);

        ButtonGroup group = new ButtonGroup();
        button.addActionListener(new ButtonEventLisener());
        container.add(button);
        button1.addActionListener(new Button1EventLisener());
        container.add(button1);
    }

    class ButtonEventLisener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String massage = "";
            massage += "Файл сохранен!\n";

            try {
                File file = new File("new_file.txt");       // Объявление файла.
                if (!file.exists())
                    file.createNewFile();                           // Создание файла.

                PrintWriter pw = new PrintWriter(file);             // Создание потока для записи в файл.
                pw.println(input1.getText());
                pw.close();                                         // Закрытие потока.
            }
            catch (IOException er) {
                System.out.print("Error " + er);
            }

            JOptionPane.showMessageDialog(null, massage, "Выводим", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class Button1EventLisener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            BufferedReader br = null;                               //  Создание потока для чтения.
            try {
                br = new BufferedReader(new FileReader("new_file.txt"));        // Поиск и чтение из файла.
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);                       // Запись файла в строку.
                    input1.setText(line);
                }
            }
            catch(IOException er) {
                System.out.print("Error " + er);
            }
            finally {
                try {
                    br.close();
                }
                catch(IOException er) {
                    System.out.print("Error " + er);
                }
            }

        }
    }
}