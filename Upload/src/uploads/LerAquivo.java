/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uploads;
import java.io.File;
import java.io.FileInputStream;
/**
 *
 
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 
 */
public class LerAquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LerAquivo l = new LerAquivo();
        l.lerArquivo();
    }
   
    public void lerArquivo(){
        System.out.println("oi");
        String path = "C:\\Users\\igorv\\Documents\\NetBeansProjects\\uploadJava\\Upload\\build\\classes\\imagens\\igor.txt";
        File f = new File(path);
        byte data[] = new byte[(int)f.length()];
        try {
            FileInputStream fIn = new FileInputStream(f);
            fIn.read(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new String(data));
        System.out.println("teste");
    }
   
}