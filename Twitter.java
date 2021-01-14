package packCodigo;

import java.io.IOException;
import java.util.List;
import com.raidentrance.controller.TwitterController;
import twitter4j.Status;
import twitter4j.TwitterException;
 
/**
 * @author raidentrance
 *
 */
public class Twitter {
 
	public Twitter(){
		
	}
    
	public void publicar(int puntuacion , String nombre ,int puntuacionHistorica) throws TwitterException{ 
        TwitterController controller = new TwitterController();
        	//envia tweet
        	controller.publicarTweet(puntuacion, nombre ,puntuacionHistorica);
        	//
            List<Status> result = controller.query();;
            controller.printStatus(result);
           
   		}
    }

 

