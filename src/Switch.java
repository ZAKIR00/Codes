public class Switch {
    public static void main(String[] args) {
        int month = 1;
         String monthString;
         switch (month){

             case 1 :


                 monthString ="yanvar";
                 break;
             case 2 :
                 monthString ="fevral";
                 break;
             case 3:
                 monthString = "mart";
                 break;
             case 4:
                 monthString ="aprel";
                 break;
             case 5:
                 monthString = "may";
                 break;
             case 6:
                 monthString = "iyun";
                 break;
             case 7:
                 monthString = "iyul";
                 break;
             case 8:
                 monthString = "avqust";
                 break;
             case 9:
                 monthString = "sentyabr";
                 break;
             case 10:
                 monthString = "oktyabr";
                 break;
             case 11:
                 monthString = "noyabr";
                 break;
             case 12 :
                 monthString = "dekabr";
                 break;
             default:
                 monthString = "ele ay yoxdur";



         }
        System.out.println(monthString);
    }

}
