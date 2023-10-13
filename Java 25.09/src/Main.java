import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                LocalDate[] dates = {
                        LocalDate.of(2048, 4, 14),
                        LocalDate.of(2007, 8, 16),
                        LocalDate.of(2027, 9, 15),
                        LocalDate.of(2017, 11, 13),
                        LocalDate.of(2047, 1, 18),
                        LocalDate.of(2077, 3, 14)};
                int ind1 = 0;
                int ind2 = 0;
                for (int i = 0; i < dates.length; i++) {
                }
                boolean isNeedStep = true;
                while (isNeedStep) {

                    isNeedStep = false;
                    for (int i = 1; i < dates.length; i++) {
                        if (dates[i].getYear() < dates[i - 1].getYear()) {
                            ind1=i;
                            ind2=i-1;
                            LocalDate tmp = dates[ind1];
                            dates[ind1] = dates[ind2];
                            dates[ind2] = tmp;
                            isNeedStep = true;
                        }

                    }
                }
                System.out.println(Arrays.toString(dates));/// года
        for (int i = 0; i < dates.length; i++) {
        }
        boolean isNeedStep1 = true;
        while (isNeedStep1) {

            isNeedStep1 = false;
            for (int i = 1; i < dates.length; i++) {
                if (dates[i].getMonthValue() < dates[i - 1].getMonthValue()) {
                    ind1=i;
                    ind2=i-1;
                    LocalDate tmp = dates[ind1];
                    dates[ind1] = dates[ind2];
                    dates[ind2] = tmp;
                    isNeedStep1 = true;
                }

            }
        }
        System.out.println(Arrays.toString(dates));/// года

    }}

