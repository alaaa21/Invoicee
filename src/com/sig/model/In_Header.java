/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;
import java.util.ArrayList;
import java.util.Date;

public class In_Header {
    private int invoice_num;
    private String invoice_cust;
    private Date invoice_date;
    private ArrayList<In_Line> lines;

    public In_Header() {
    }

    public In_Header(int invoice_num, String invoice_cust, Date invoice_date) {
        this.invoice_num = invoice_num;
        this.invoice_cust = invoice_cust;
        this.invoice_date = invoice_date;
    }

    public Date getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(Date invoice_date) {
        this.invoice_date = invoice_date;
    }

    public int getInvoice_num() {
        return invoice_num;
    }

    public void setInvoice_num(int invoice_num) {
        this.invoice_num = invoice_num;
    }

    public String getInvoice_cust() {
        return invoice_cust;
    }

    public void setInvoice_cust(String invoice_cust) {
        this.invoice_cust = invoice_cust;
    }

    public ArrayList<In_Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<In_Line> lines) {
        this.lines = lines;
    }
    
    public double TotalInvoice (){
        double total = 0.0;
        for (int i=0 ; i<lines.size(); i++){
            total += lines.get(i).LineTotal();
    }
        return total;
    }
}

