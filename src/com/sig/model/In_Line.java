/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;


public class In_Line {
    In_Header header;
    String In_Item;
    double In_price;
    int In_Count;

    public In_Line() {
    }

    public In_Line(In_Header header, String In_Item, double In_price, int In_Count) {
        this.header = header;
        this.In_Item = In_Item;
        this.In_price = In_price;
        this.In_Count = In_Count;
    }

    public In_Header getHeader() {
        return header;
    }

    public void setHeader(In_Header header) {
        this.header = header;
    }

    public String getIn_Item() {
        return In_Item;
    }

    public void setIn_Item(String In_Item) {
        this.In_Item = In_Item;
    }

    public double getIn_price() {
        return In_price;
    }

    public void setIn_price(double In_price) {
        this.In_price = In_price;
    }

    public int getIn_Count() {
        return In_Count;
    }

    public void setIn_Count(int In_Count) {
        this.In_Count = In_Count;
    }

  
    public double LineTotal(){
         return In_price * In_Count ;
    }
 
    
    
}
