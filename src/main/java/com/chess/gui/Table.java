package com.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table {

    private static Dimension OUTER_FRAME_DIMENSION = new Dimension(900, 900);
    private final JFrame gameFrame;

    public Table() {
        this.gameFrame = new JFrame("JChess");
        final JMenuBar tableMenuBar = new JMenuBar();
        populateMenuBar(tableMenuBar);
        this.gameFrame.setJMenuBar(tableMenuBar);
        this.gameFrame.setSize(OUTER_FRAME_DIMENSION);
        this.gameFrame.setVisible(true);

    }

    private void populateMenuBar(final JMenuBar tableMenuBar) {
        tableMenuBar.add(createFileMenu());

    }

    private JMenu createFileMenu() {
        final JMenu fileMenu = new JMenu("File");

        final JMenuItem openPGN = new JMenuItem("Load PGN File");
        openPGN.addActionListener(e -> System.out.println("Open up that PGN file!"));

        fileMenu.add(openPGN);
        return fileMenu;
    }
}
