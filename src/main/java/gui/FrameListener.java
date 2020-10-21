package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liumf
 * @date 22:57 2020/10/21
 * @className FrameListener
 * @description
 */

public class FrameListener extends WindowAdapter {

    /**
     * 设置窗口监听器,关闭窗口
     * @param e
     */
    @Override
    public void windowClosing(WindowEvent e) {
        Window component = (Window)e.getComponent();
        component.dispose();
    }
}
