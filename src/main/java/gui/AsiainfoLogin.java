package gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liumf
 * @date 23:42 2020/10/21
 * @className AsiainfoLogin
 * @description
 */

public class AsiainfoLogin extends JFrame {


    private JPanel contentPanel = new JPanel();

    // 设置按钮组件
    private JButton login = new JButton("登录");

    private JLabel jlb1 = new JLabel("用户名:");
    private JLabel jlb2 = new JLabel("密码:");
    private JLabel jlbtitle = new JLabel("");
    // 设置文本框组件
    private JTextField admin = new JTextField();
    private JTextField password = new JTextField();


    public AsiainfoLogin() {
        this.init();
        // this.addListener();
    }

    public void init(){

        //获得屏幕尺寸
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setTitle("LoginAsiainfo  || by 刘梦飞");
        this.setSize(500, 350);
        //实现居中显示
        this.setLocation((d.width-500)/2,(d.height-350)/2);
        this.setVisible(true);
        contentPanel.setLayout(null);
        add(admin);
        add(password);
        add(login);
        add(jlb1);
        add(jlb2);
        add(jlbtitle);
        /*
         * 组件绝对位置
         */
        jlb1.setBounds(50, 130, 90, 25);
        jlb1.setForeground(Color.BLACK);
        admin.setBounds(95, 130, 300, 25);
        password.setBounds(95, 154, 300, 25);
        jlb2.setBounds(50, 154, 90, 25);
        jlb2.setForeground(Color.BLACK);
        login.setBounds(315, 225, 90, 20);

        /*
         * 组件透明化
         */
        admin.setOpaque(true);
        password.setOpaque(true);
        contentPanel.setOpaque(false);
        getContentPane().add(contentPanel);

        // 监听器结束当前进程
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    /**
     * 登录事件监听
     */
    private void addListener() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // forLogin(admin.getText(), password.getText());

            }
        });
    }

}
