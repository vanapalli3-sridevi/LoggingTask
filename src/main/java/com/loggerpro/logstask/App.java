package com.loggerpro.logstask;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	private static Scanner sc;
    public static void main( String[] args )
    {
    	 sc=new Scanner(System.in);
    	 LOGGER.debug("Enter principle: ");
    	 double principle=sc.nextInt();
    	 LOGGER.debug("Enter rate: ");
    	 double rate=sc.nextInt();
    	 LOGGER.debug("Enter time: ");
    	 double time=sc.nextInt();
         Simpleinterest sinterestobj=new Simpleinterest(principle,rate,time);
         double val=sinterestobj.getinterest();
         LOGGER.debug("SimpleInterest is: ");
         LOGGER.debug((float)val);
         Compoundinterest cinterestobj=new Compoundinterest(principle,rate,time);
         double compoundinterestvalue=cinterestobj.getinterest();
         LOGGER.debug("CompoundInterest is: ");
         LOGGER.debug((float)compoundinterestvalue);
         Construction c=new Construction();
         LOGGER.debug("Enter Area ofthe house: ");
         double area=sc.nextDouble();
         LOGGER.debug("1200INR if we use standard materials\n"+"1500INR if we use above standard materials\n"+"1800INR  for high standard material\n"
         +"2500INR for high standard material and fully automated home\n");
         LOGGER.debug("Enter the type:\n"+"1.standard\n"+"2.Above standard\n"+"3.High standard\n"+"4.High standard and fully automated home\n");
         int option=sc.nextInt();
         if(option<1 || option>4)
         LOGGER.debug("Select valid option from the list\n");
         else
         LOGGER.debug((int)(Math.ceil(c.getcost(option,area)))+":is the Cost for construction");
    }
}

