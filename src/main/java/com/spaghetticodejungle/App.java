package com.spaghetticodejungle;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int day = 4;
        System.out.println("Day " + day + " of the week is a " + calcDayNameNew(day) + ".");
        day = 7;
        System.out.println("Day " + day + " of the week is a " + calcDayNameOld(day) + ".");
        day = 3;
        System.out.println("Day " + day + " of the week is a " + calcDayNameSuperOld(day) + ".");
    }

    private static String calcDayNameNew(int num)
    {
        String dayName = switch(num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not Applicable";
        };

        return dayName;

    }

    private static String calcDayNameOld(int num)
    {
        String dayName = switch(num) {
            case 1:
                yield "Monday";
            case 2:
                yield "Tuesday";
            case 3:
                yield "Wednesday";
            case 4:
                yield "Thursday";
            case 5:
                yield "Friday";
            case 6:
                yield "Saturday";
            case 7:
                yield "Sunday";
            default:
                yield"Not Applicable";
        };

        return dayName;

    }

    private static String calcDayNameSuperOld(int num)
    {
        String dayName;
        switch(num) {
            case 1:
               dayName = "Monday";
                break;
            case 2:
                dayName =  "Tuesday";
                break;
            case 3:
                dayName =  "Wednesday";
                break;
            case 4:
                dayName =  "Thursday";
                break;
            case 5:
                dayName =  "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName =  "Sunday";
                break;
            default:
                dayName =  "Not Applicable";
                break;
        }
      return dayName;

    }


}
