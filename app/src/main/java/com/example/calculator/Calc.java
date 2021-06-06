package com.example.calculator;

import java.io.Serializable;

public class Calc implements Serializable {
    private double memNumber;
    private double curNumber;
    private CalcOperation operation;
    private String memField;
    private String calcField;

    public Calc() {
        this.memNumber = 0.0;
        this.curNumber = 0.0;
        this.operation =CalcOperation.EMPTY;
        this.memField="";
        this.calcField="";
    }

    public String getMemField(){
        return this.memField;
    }

    public String getCalcField(){
        return this.calcField;
    }

    public void setCurNumber(String number){
        if (number.equals(""))
            this.curNumber = 0.0;
        else
            this.curNumber = Double.valueOf(number);

        this.calcField = number;
    }

    public void setInMem(String number, CalcOperation oper){
        this.memNumber = Double.valueOf(number);
        this.curNumber = 0.0;
        this.operation = oper;

        this.memField = memNumber + oper.toString();
        this.calcField = "";
    }

    public CalcOperation getOperation(){
        return this.operation;
    }

    public void calc(Double number){
        switch (this.operation){
            case PLUS:
                this.memNumber = this.memNumber + Double.valueOf(number);
                break;
            case MINUS:
                this.memNumber = this.memNumber - Double.valueOf(number);
                break;
            case DIVISION:
                this.memNumber = this.memNumber / Double.valueOf(number);
                break;
            case MULTIPLY:
                this.memNumber = this.memNumber * Double.valueOf(number);
                break;
        }

        this.operation = CalcOperation.EMPTY;
        this.curNumber=this.memNumber;

        this.calcField=String.valueOf(curNumber);
        this.memField = this.memField+number+"="+memNumber;
    }
}
