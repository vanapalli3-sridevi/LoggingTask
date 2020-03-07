package com.loggerpro.logstask;

public class Simpleinterest {
	double P=1,R=1,T=1;
	Simpleinterest(double P,double R,double T){
		this.P=P;
		this.R=R;
		this.T=T;
	}
	public double getinterest() {
		 double SI = (P * T * R) / 100; 
		 return SI;
	}
    
}