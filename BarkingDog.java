public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true) {
            if (hourOfDay > 8 || hourOfDay < 22) {
                System.out.println("true");
            } else if (hourOfDay < 0 || hourOfDay > 23) {
                System.out.println("Invalid input");
            }
        }
            else if (barking == false) {
                    System.out.println("false");
                }else if(hourOfDay < 0 || hourOfDay > 23){
                    System.out.println("Invalid input");
                }
            }
        }


