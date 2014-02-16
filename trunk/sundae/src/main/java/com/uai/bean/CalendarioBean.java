package com.uai.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Named;

import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleModel;
import org.springframework.context.annotation.Scope;

@Named("calendarioBean")
@Scope("session")
public class CalendarioBean implements Serializable {  
    
    /**
	 * 
	 */
	
	private static final long serialVersionUID = 6049595702208895073L;
	private ScheduleModel lazyEventModel;  
  
    public CalendarioBean() {  
        lazyEventModel = new LazyScheduleModel() {  
              
            /**
			 * 
			 */
			private static final long serialVersionUID = 8347674014644624094L;

			@Override  
            public void loadEvents(Date start, Date end) {  
                clear();  
                  
                Date random = getRandomDate(start);  
                addEvent(new DefaultScheduleEvent("Lazy Event 1", random, random));  
                  
                random = getRandomDate(start);  
                addEvent(new DefaultScheduleEvent("Lazy Event 2", random, random));  
            }     
        };  
    }  
      
    public Date getRandomDate(Date base) {  
        Calendar date = Calendar.getInstance();  
        date.setTime(base);  
        date.add(Calendar.DATE, ((int) (Math.random()*30)) + 1);    //set random day of month  
          
        return date.getTime();  
    }  
      
    public ScheduleModel getLazyEventModel() {  
        return lazyEventModel;  
    }  
}  

