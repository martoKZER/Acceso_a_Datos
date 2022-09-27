import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Clase calendar en desuso.
        Calendar c = Calendar.getInstance();
        c.set(2022, Calendar.JANUARY, 1);
        //Clase LocalDate, mas extendida para fechas
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 1); //Inmutable
        //Clase LocalTime, mas extendida para fechas
        LocalTime time = LocalTime.of(10, 00);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, Month.JANUARY, 1, 10, 00);

        LocalDateTime lastWeek = dateTime.minusDays(7);
        // formato
        String dateFormatted = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(dateFormatted);
    }
}
