
package Applicaton;

import javax.swing.ImageIcon;

/**
 *
 * @author Albertino Augusto */

public class ReadImageFile
{
    // Este método é responsavel por pegar uma imagem no computador ** /    
    public static ImageIcon getImage(String path)
    {
        java.net.URL imgURL = ReadImageFile.class.getResource(path);
	if (imgURL != null) 
	{
	    return new ImageIcon(imgURL);
	} 
	else 
	{
	    System.out.println("Não foi possível encontrar o arquivo: " + path);
            
	    return null;
        }    
    }
}