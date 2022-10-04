/**
 * @author Felipe  
 */
package util;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class mascara {
    
        public static DefaultFormatterFactory getDataMask(){
        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter ("##/##/####");
            mask.setPlaceholderCharacter('_');
        }catch (ParseException ex){
            return null;
        }
        return (new DefaultFormatterFactory (mask, mask));
    }

        public static DefaultFormatterFactory getALDataMask(){
        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter ("##/##/####");
            mask.setPlaceholderCharacter('_');
        }catch (ParseException ex){
            return null;
        }
        return (new DefaultFormatterFactory (mask, mask));
    }
        
        public static DefaultFormatterFactory getExDataMask(){
        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter ("##/##/####");
            mask.setPlaceholderCharacter('_');
        }catch (ParseException ex){
            return null;
        }
        return (new DefaultFormatterFactory (mask, mask));
    }        

}
