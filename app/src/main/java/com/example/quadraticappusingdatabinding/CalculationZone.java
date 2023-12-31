package com.example.quadraticappusingdatabinding;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticappusingdatabinding.databinding.ActivityMainBinding;
import com.example.quadraticappusingdatabinding.databinding.ActivityMainBindingImpl;

public class CalculationZone extends BaseObservable {

    String a;
    String b;
    String c;
    ActivityMainBinding abuBinding;


    public CalculationZone(ActivityMainBinding abuBinding) {
        this.abuBinding = abuBinding;
    }

    public CalculationZone() {

        //we make an empty constructor to avoid any error when we have null
    }
    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }


    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public  void QuadraticSolution(View v){

        double a = Double.parseDouble(getA());
        double b = Double.parseDouble(getB());
        double c = Double.parseDouble(getC());

        double solutionP = (-b + Math.sqrt(((Math.pow(b,2))-(4*a*c))) )/(2*a);
        double solutionN = (-b - Math.sqrt(((Math.pow(b,2))-(4*a*c))) )/(2*a);

        //Displaying Result
        if((4*a*c)>0)
        {
            abuBinding.submitTextV.setText("X+: " + solutionP + "\nX-: " + solutionN);
        }
        else if((4*a*c)< 0){
            abuBinding.submitTextV.setText("No Real Solutions");
        }
        else
        {
            abuBinding.submitTextV.setText("X+: " + solutionP);
        }
    }
}
