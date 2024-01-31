package be.com.ada.pooii.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterService {
    public static Date formatDate(String dataStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(dataStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
