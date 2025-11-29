public class App {
    public static void main(String[] args) throws Exception {

        String s="A man, a plan, a canal: Panama";
        s.toLowerCase().trim();
        String tmp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                tmp+=s.charAt(i);
            }
        }
        System.out.println(tmp);

        //Pattern 1
        /*
        #
        ##
        ###
        ####
        #####
         */

         /*for(int i=1;i<=5;i++)
         {
            for(int j=1;j<=i;j++)
            {
                System.out.print("#");
            }
            System.out.println();
         }*/
         
         //Pattern 2
        /*
        1
        12
        123
        1234
        12345
         */

         /*for(int i=1;i<=5;i++)
         {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
         }*/

          //Pattern 3
        /*
        1
        22
        333
        4444
        55555
         */

         /*for(int i=1;i<=5;i++)
         {
            int k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
            }
            System.out.println();
         }*/

         //Pattern 4
        /*
        #####
        ####
        ###
        ##
        #
         */

         /*for(int i=5;i>=1;i--)
         {
            for(int j=i;j>=1;j--)
            {
                System.out.print("#");
            }
            System.out.println();
         }*/

         //Pattern 5
        /*
        12345
        1234
        123
        12
        1
         */

         /*for(int i=5;i>=1;i--)
         {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
         }*/

         //Pattern 3
        /*
        pyramid
         */

         /*for(int i=1;i<=5;i++)
         {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=1+(i-1)*2;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
         }*/
         

         
    }
}
