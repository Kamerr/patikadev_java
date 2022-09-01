package com;

import View.HotelView;

public class Main {
    public static void main(String[] args) {
        HotelView hotel = new HotelView();
        DBConnector.getIstance();
    }
}