package com.swing;

public class VO {

    public String rowNumber;
    public String columnNumber;
    public int rowNumber_int = 0;
    public int columnNumber_int = 0;



    public VO() {
    }

    public VO(String rowNumber, String columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        rowNumber_int = Integer.parseInt(this.rowNumber);
        columnNumber_int = Integer.parseInt(this.columnNumber);
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
        rowNumber_int = Integer.parseInt(this.rowNumber);
    }

    public void setColumnNumber(String columnNumber) {
        this.columnNumber = columnNumber;
        columnNumber_int = Integer.parseInt(this.columnNumber);
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public String getColumnNumber() {
        return columnNumber;
    }
}
