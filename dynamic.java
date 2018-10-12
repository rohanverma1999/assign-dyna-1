import java.io.*;

class Dynamic

    {

      public static void main(string args[])

         {
          
             try

              {

               File f=new File("def.txt");

          FileWriter w=new FileWriter("abc2.txt");

               String str;

          str=f.getAbsolutePath();

          w.write(str);

          w.close();

          system.out.println("complete");

          }

          catch(IOException  e)

          {

          e.printStackTrace();

          } 

       }

   }
