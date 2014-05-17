package com.uai.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;

import com.uai.model.Cursada;
import com.uai.model.Tipo_Cursada;
import com.uai.model.Tipo_Examen;
 
public final class SelectItemsUtils {
 
    private SelectItemsUtils() {
    }
 
    public static Object findValueByStringConversion(FacesContext context, UIComponent component, String value, Converter converter) {
    	Iterator<Object> items = createSelectItems(component).iterator();
        return findValueByStringConversion(context, component, items, value, converter);        
    }
    
    private static Object findValueByStringConversion(FacesContext context, UIComponent component, Iterator<Object> items, String value, Converter converter ) {
    	while (items.hasNext()) {
    		Object item = items.next();
            if (item instanceof Tipo_Cursada) {
            	if (((Tipo_Cursada)item).getIdTipoCursada() == Integer.parseInt(value)) {
            		return (Tipo_Cursada)item;
            	}
            }
            if (item instanceof Cursada) {
            	if (((Cursada)item).getIdCursada() == Integer.parseInt(value)) {
            		return (Cursada)item;
            	}
            }
            if (item instanceof Tipo_Examen) {
            	if (((Tipo_Examen)item).getIdTipoExamen() == Integer.parseInt(value)) {
            		return (Tipo_Examen)item;
            	}
            } 
        }        
        return null;
    }
 
    public static List<Object> createSelectItems(UIComponent component) {
		List<Object> items = new ArrayList<Object>();
		Iterator<UIComponent> children = component.getChildren().iterator();
		
		while(children.hasNext()) {
			UIComponent child = children.next();
			
			if(child instanceof UISelectItem) {
				UISelectItem selectItem = (UISelectItem) child;
				
				items.add(selectItem);
			} else if(child instanceof UISelectItems) {
				Object selectItems = ((UISelectItems) child).getValue();
			
				if(selectItems instanceof SelectItem[]) {
					SelectItem[] itemsArray = (SelectItem[]) selectItems;
					
					for(SelectItem item : itemsArray)
						items.add(item);
					
				} else if(selectItems instanceof Collection) {
					@SuppressWarnings("unchecked")
					Collection<Object> collection = (Collection<Object>) selectItems;
					
					for(Object item : collection)
						items.add(item);
				}
			}
		}
		
		return items;
	}
    
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;    
    }
 
    /**
     * This class is based on Mojarra version
     */
    static class ArrayIterator implements Iterator<Object> {
 
        public ArrayIterator(Object items[]) {
            this.items = items;
        }
 
        private Object items[];
        private int index = 0;
 
        public boolean hasNext() {
            return (index < items.length);
        }
 
        public Object next() {
            try {
                return (items[index++]);
            }
            catch (IndexOutOfBoundsException e) {
                throw new NoSuchElementException();
            }
        }
 
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}