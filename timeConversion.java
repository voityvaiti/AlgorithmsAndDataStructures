/* Given a time in -hour AM/PM format, 
function converts it to military (24-hour) time. */

public static String timeConversion(String s) {
        String militaryFormatTime;
        
        if(s.contains("P")){
            if(s.substring(0, 2).equals("12")){
                militaryFormatTime = s.replace("PM", "");
            }
            else {
                String hoursString = s.substring(0, 2);
                Integer hours = Integer.parseInt(hoursString) + 12;
                militaryFormatTime = s.replace(hoursString, hours.toString());
                militaryFormatTime = militaryFormatTime.replace("PM", "");
            }
        }
        else{
            if(s.substring(0, 2).equals("12")){
                militaryFormatTime = s.replace("12", "00");
                militaryFormatTime = militaryFormatTime.replace("AM", "");
            }
            else{
                militaryFormatTime = s.replace("AM", "");
            }
        }
        return militaryFormatTime;
    }
