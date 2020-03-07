package com.loggerpro.logstask;

public class Compoundinterest {
	 double principle, rate, time;
    Compoundinterest(double principle,double rate,double time){
    	this.principle=principle;
    	this.rate=rate;
    	this.time=time;
    }
	double CI;
    public double getinterest() {
    	CI= principle * (Math.pow((1 + rate / 100), time));
        return(CI);
    }
    
}