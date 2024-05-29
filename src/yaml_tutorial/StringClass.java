//-----------oooooooooo...........Start Of File..........oooooooooo-----------//
//Created by Anneme Holzhausen 

package yaml_tutorial;

public class StringClass 
{
    //--------------------------Default Constructor---------------------------//
    public StringClass()
    {
        
    }
    
    //-----------------------------StringTest()-------------------------------//
    public boolean StringTest(String text, int length) //Passing values to the method.
    {
        //Checking whether the text is or less than the length variable.
        if (text.length() <= length) 
        {
            System.out.println("Your text was the right length!");
            return true; //Return statement for boolean method.
        }
        else
        {
            System.out.println("Your text was the wrong length!");
            return false; //Return statement for boolean method.
        }
    }
}
//-----------oooooooooo............End Of File...........oooooooooo-----------//
