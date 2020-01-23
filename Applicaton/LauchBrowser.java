
package Applicaton;

import java.net.URI;
import java.awt.Desktop;
import java.io.IOException;

/**
 *
 * @author Albertino Augusto */

public class LauchBrowser 
{
    // Método responsavel por abrir a pagína da DAS no facebook **/
    public void LauchFacebook()
    {        
        try 
        {   
            Desktop.getDesktop().browse(URI.create("http://www.facebook.com/digitalartscervices"));            
        } 
        catch (IOException ex) 
        {

        }
    } 
    
    // Método responsável por abrir a minha pagína no twitter **/
    public void LauchTwitter()
    {        
        try 
        {   
            Desktop.getDesktop().browse(URI.create("http://www.twitter.com/ferless_recall"));            
        } 
        catch (IOException ex) 
        {

        }
    }
}
