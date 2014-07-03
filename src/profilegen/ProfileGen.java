/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package profilegen;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author DXNNX
 */
public class ProfileGen {
static int allprofiles = 0;


    public static int getAllprofiles() {
        return allprofiles;
    }

    public static void setAllprofiles(int allprofiles) {
        ProfileGen.allprofiles = allprofiles;
    }

public static void escribirperfil(String Nombre,String dia,String mes,String year,String madre,String padre,String nacionalidad,String genero,String foto,String win,String same, String lose,String id,String notas) throws IOException{
File file = new File("./database/animales/"+Nombre);
String content = Nombre+"\n"+dia+"\n"+mes+"\n"+year+"\n"+madre+"\n"+padre+"\n"+nacionalidad+"\n"+genero+"\n"+foto+"\n"+win+"\n"+same+"\n"+lose+"\n"+id+"\n"+ notas;



    FileWriter fw = new FileWriter(file.getAbsoluteFile());
    try (BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write(content);
    }


}
public static Image createResizedCopy(Image originalImage)
    {
        int scaledWidth = 108;
        int scaledHeight = 108;
        boolean preserveAlpha=true;
    	int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
    	BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
    	Graphics2D g = scaledBI.createGraphics();
    	if (preserveAlpha) {
    		g.setComposite(AlphaComposite.Src);
    	}
    	g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null); 
    	g.dispose();
    	return scaledBI;
    }    
}
