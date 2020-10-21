package gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author liumf
 * @date 22:15 2020/10/21
 * @className WindowFrame
 * @description
 */

public class WindowFrame {



    // 设置按钮组件
    private JButton login = new JButton("登录"), register = new JButton("注册");

    private JLabel jlb1 = new JLabel("用户名:"), jlb2 = new JLabel("密码:"), jlbtitle = new JLabel("登录界面");
    // 设置文本框组件
    private JTextField admin = new JTextField(), password = new JTextField();

    public static void main(String[] args) {

        WindowFrame windowFrame = new WindowFrame();

        windowFrame.initFrame();

    }




    /**
     * 初始化主界面
     */
    public void initFrame(){

        Frame frame = new Frame("我的窗口");
        frame.setSize(400,300);
        frame.setLocation(300,200);
        frame.setVisible(true);
        frame.addWindowListener(new FrameListener());




    }



    public void containerLabel(){


    }
}
