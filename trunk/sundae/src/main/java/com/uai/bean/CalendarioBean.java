package com.uai.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.model.Calendario;
import com.uai.service.ICalendarioService;

@Named("calendarioBean")
@Scope("session")
public class CalendarioBean extends BaseBean implements Serializable {  
    
	
    //Spring User Service is injected...
    @Inject
    @Named("calendarioService")
    ICalendarioService calendarioService;
    
    @Inject
    @Named("usuarioBean")
    UsuarioBean usuarioBean;
    
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
                  
                List<Calendario> itemsCalendario = getCalendarioService().getItemsCalendario(start, end, usuarioBean.getUsr());
                
                for (Calendario calendario : itemsCalendario) {
                	addEvent(new DefaultScheduleEvent(calendario.getDescripcion(), calendario.getFecha(), calendario.getFecha()));
				}
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
    
    /**
     * Get Calendario Service
     *
     * @return ICalendarioService - Calendario Service
     */
    public ICalendarioService getCalendarioService() {
        return calendarioService;
    }
 
    /**
     * Set Calendario Service
     *
     * @param ICalendarioService - Calendario Service
     */
    @Autowired
    public void setCalendarioService(ICalendarioService calendarioService) {
        this.calendarioService = calendarioService;
    }
}  

