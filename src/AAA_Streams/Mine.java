package AAA_Streams;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Mine {
    private static String srcFile;
    private static String[] files;

    public static void main(String[] args) {

       int[]arr= {1,2,3,4,5};
       for (int element: arr)
        System.out.println(element);



  /*Path aF = Paths.get("D:\\dir\\file.txt");
  while (aF.iterator().hasNext()){
      System.out.println("pe" + aF.iterator().next());
  }*/



       /*BufferedWriter b1 = new BufferedWriter(new File("f"));
       BufferedWriter b2 = new BufferedWriter(new FileWriter("f1"));
       BufferedWriter b3 = new BufferedWriter(new PrintWriter("f2"));
       BufferedWriter b4 = new BufferedWriter(new BufferedWriter("f3"));
*/



        /* Path aP = Paths.get("C:\\WINDOWS\\system32\\ config\\systemprofile\\StartMenu\\Programs\\Accessories\\Enterteinment\\WindowsMedia Player");


        System.out.println(aP.subpath(3,4));*/

       /*RandomAccessFile r = new RandomAccessFile("OutFile");
        DataInputStream d = new DataInputStream(System.in);
        OutputStreamWriter o = new OutputStreamWriter(System.out);
        File f = new File("/", "autoexec.bat");*/

      /*   File m = new File ("M");
         m.mkdir();
         File mF = new File( m, "myfile.txt");
         mF.createNewFile();
        System.out.println(m.delete());
        mF.delete();
        System.out.println(m.delete());
    }*/

       /* try (FileReader inp = new FileReader(new File(files[0]))) {
//1
          // Compilation error at
        }catch (FileNotFoundException | IOException e){
            //2
            //Compilation error at
            e.printStackTrace();
        }*/




        /*Mine m = new Mine();
        System.out.println(m.amethod());
    }
    public  int amethod() {
        try {
            FileInputStream dis = new FileInputStream("H.txt");

        } catch (FileNotFoundException fne) {
            System.out.println("Non such");
            return -1;
        } catch (IOException ioe) {

        } finally {
            System.out.println("Doing");
        }
    return 0;*/


      /*  Console console = System.console();
        if (console != null){

            String userName = null;
            char[] password = null;
            userName = console.readLine("Enter userName");
            password = console.readPassword("Enter password");
            System.out.println(userName+ ", " + new String(password) );
        }*/
    }
}


