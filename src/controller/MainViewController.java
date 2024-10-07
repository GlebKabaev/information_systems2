package controller;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainViewController implements Subject{
    private List<Observer> observers=new ArrayList<Observer>();
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


    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    public void notifyObservers(){
        ArrayList<String> books=new ArrayList<String>();
        Book_rep_DB db=Book_rep_DB.getInstance();
        for (int i=0; i<db.getCount();i++){
            books.add(db.getBookById(i).toString());
        }
        MainView mv=MainView.openFrame();
        mv.update(books);
    }













public static JButton DBButton(JTextField textField,JLabel label) {
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
