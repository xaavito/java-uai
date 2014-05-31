package com.uai.utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.uai.model.Examen;

@FacesConverter(value = "examenConverter", forClass = Examen.class)
public class ExamenConverter implements Converter{
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return SelectItemsUtils.findValueByStringConversion(context, component,
				value, this);
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((Examen) value).getIdExamen());
	}
}
