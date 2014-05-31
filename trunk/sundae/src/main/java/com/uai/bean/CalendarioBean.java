package com.uai.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.model.Examen;
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
	private ScheduleEvent event = new DefaultScheduleEvent(); 
  
    public CalendarioBean() {  
        lazyEventModel = new LazyScheduleModel() {  
              
            /**
			 * 
			 */
			private static final long serialVersionUID = 8347674014644624094L;

			@Override  
            public void loadEvents(Date start, Date end) {  
                clear();  
                  
                List<Examen> examenes = getCalendarioService().getItemsCalendario(start, end, usuarioBean.getUsr());
                
                for (Examen ex : examenes) {
                	addEvent(new DefaultScheduleEvent(ex.getCursada().getMateria().getNombre() , ex.getFecha(), ex.getFecha()));
				}
            }     
        };  
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
    
    public void onDateSelect(SelectEvent selectEvent) {  
        setEvent(new DefaultScheduleEvent("", (Date) selectEvent.getObject(), (Date) selectEvent.getObject()));  
    }

    public void onEventSelect(SelectEvent selectEvent) {  
        event = (ScheduleEvent) selectEvent.getObject();  
    }  
    
	public ScheduleEvent getEvent() {
		return event;
	}

	public void setEvent(ScheduleEvent event) {
		this.event = event;
	}  
}  

