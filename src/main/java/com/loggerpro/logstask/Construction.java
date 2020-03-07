package com.loggerpro.logstask;

public class Construction {
  double area;
  int op;
  double cost;
  public double getcost(int op,double area) {
	  if(op==1){
		  this.cost=1200;
	  }else if(op==2) {
		  this.cost=1500;
	  }else if(op==3) {
		  this.cost=1800;
	  }else if(op==4){
		  this.cost=2500;
	  }
	  return area*cost;
  }
  
}