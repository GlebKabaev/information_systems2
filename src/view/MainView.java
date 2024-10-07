package view;
import javax.swing.*;
import java.util.*;
import controller.MainViewController ;
import controller.Observer;
public class MainView implements Observer{
    private static MainView mainView;
    private JFrame frame = new JFrame("Главное окно");
    private JLabel label = new JLabel("Welcome");
    private JList<String> jlist=new JList<>() ;
    private MainViewController mainViewController=new MainViewController();
    @Override
    public void update(ArrayList<String> newInfo) {
        jlist=new JList<>(newInfo.toArray(new String[0]));
    }
    private MainView() {
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
        JButton button2= mainViewController.DBButton();
        button2.setBounds(200, 80, 200, 30);
        jlist.setBounds(50,180, 300, 900);
        frame.add(jlist); // Добавляем список в окно
        frame.add(button);
        frame.add(button2);
        frame.setVisible(true);
    }
    
    //синглтон 
    public static MainView openFrame() {
        if(mainView == null){
            mainView = new MainView();
        }
        return mainView;
    }
}
