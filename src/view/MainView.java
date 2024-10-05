package view;
import javax.swing.*;

import controller.MainViewController;
public class MainView {
    public static void openFrame() {
        JFrame frame = new JFrame("Главное окно");
        JLabel label = new JLabel("Welcome");
        label.setBounds(50, 150, 200, 30);
        frame.add(label); // Добавляем лейбл в окно
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        JTextField textField = new JTextField();
        textField.setBounds(50, 30, 200, 30); // Устанавливаем размеры и положение текстового поля
        frame.add(textField);
        JButton button = MainViewController.showButton(textField,label);
        button.setBounds(50, 80, 200, 30); // Устанавливаем размеры и положение кнопки
        frame.add(button);
        frame.setVisible(true);
    }
}
