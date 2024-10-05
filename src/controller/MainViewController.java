package controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainViewController {
    public static JButton showButton(JTextField textField,JLabel label) {
        JButton button = new JButton("Показать текст");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Получение текста из текстового поля и вывод в консоль
                
                String text = textField.getText();
                label.setText(text);
                System.out.println("Введенный текст: " + text);
            }
    });
    return button;
}
}
