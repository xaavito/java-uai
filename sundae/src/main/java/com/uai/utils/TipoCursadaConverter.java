package com.uai.utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.uai.model.Tipo_Cursada;

@FacesConverter(value = "tipoCursadaConverter", forClass = Tipo_Cursada.class)
public class TipoCursadaConverter implements Converter{
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return SelectItemsUtils.findValueByStringConversion(context, component,
				value, this);
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((Tipo_Cursada) value).getIdTipoCursada());
	}
}
