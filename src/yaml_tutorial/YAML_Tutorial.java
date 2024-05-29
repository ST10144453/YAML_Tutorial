//-----------oooooooooo...........Start Of File..........oooooooooo-----------//
//Created by Anneme Holzhausen 

package yaml_tutorial;

public class YAML_Tutorial 
{
    //------------------------------Main Method-------------------------------//
    public static void main(String[] args) 
    {
        //Creating an instance of the StringClass.
        StringClass stringRunner = new StringClass();
        
        //Creating an instance of the IntClass
        IntClass intRunner = new IntClass();
        
        //Calling the StringTest method, passing the "text" and "length" values.
        stringRunner.StringTest("Test Me!", 10);
        
        //Calling the StringTest method, passing the "valueA" and "valueB" values.
        intRunner.IntTest(2, 3);
    }    
}
//-----------oooooooooo............End Of File...........oooooooooo-----------//
