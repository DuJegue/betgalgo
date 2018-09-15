package br.betgalgo.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date> {

	private final String format = "yyyy-MM-dd HH:mm:ss";
	
    public DateFormatter() {
        super();
    }

    public Date parse(final String text, final Locale locale) throws ParseException {
        final SimpleDateFormat dateFormat = createDateFormat(format, locale);
        return dateFormat.parse(text);
    }

    public String print(final Date object, final Locale locale) {
        final SimpleDateFormat dateFormat = createDateFormat(format, locale);
        return dateFormat.format(object);
    }

    private SimpleDateFormat createDateFormat(String format, Locale locale) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat(format, locale);
        dateFormat.setLenient(false);
        return dateFormat;
    }
    
    public String printHora(final Date object) {
    	return createDateFormat("HH:mm", Locale.getDefault()).format(object);
    }

    
}