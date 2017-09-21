package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane   htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();



    public void initMenuBar() {

    }

    public void initEditor() {

    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void init() {
        initGui();
        this.addWindowListener(new FrameListener(this));
        this.setVisible(true);
    }

    public void selectedTabChanged() {

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {

        return controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void exit() {
        controller.exit();
    }
}
