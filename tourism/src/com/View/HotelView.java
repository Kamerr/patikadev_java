package com.View;

import Helper.Helper;
import Hotels.Hotels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HotelView extends JFrame {

    private JPanel wrapper;
    private JPanel pnl_hotel_search;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton araButton;
    private JScrollPane scrl_hotel_list;
    private JTable tbl_hotel_list;
    private DefaultTableModel mdl_hotel_list;
    private Object[] row_hotel_list;

    public HotelView() {
        Helper.setLayout();

        add(wrapper);
        setSize(1000, 500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x, y);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle("Otel Arama");

        mdl_hotel_list = new DefaultTableModel();
        Object[] col_hotel_list = {"OTEL İSMİ", "ADRES" , "E-MAİL", "TELEFON NUMARASI"};

        mdl_hotel_list.setColumnIdentifiers(col_hotel_list);
        row_hotel_list = new Object[col_hotel_list.length];

        loadHotels();

        tbl_hotel_list.getTableHeader().setReorderingAllowed(false);
        tbl_hotel_list.setModel(mdl_hotel_list);





    }


    public void loadHotels(){
        DefaultTableModel clearmodel = (DefaultTableModel) tbl_hotel_list.getModel();
        clearmodel.setRowCount(0);
        int i;
        for (Hotels obj : Hotels.getHotels()){
            i = 0;
            row_hotel_list[i++] = obj.getName();
            row_hotel_list[i++] = obj.getAdress();
            row_hotel_list[i++] = obj.getEmail();
            row_hotel_list[i++] = obj.getPhone();
            mdl_hotel_list.addRow(row_hotel_list);

        }

    }
}
