import io.quarkus.qute.TemplateGlobal;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

@TemplateGlobal
public class Global {

    public static DateTimeFormatter FULL_DATE_FORMAT = DateTimeFormatter.ofPattern("MMM dd YYYY", Locale.ENGLISH);
    public static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);

}
