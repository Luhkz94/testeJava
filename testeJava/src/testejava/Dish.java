/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

/**
 *
 * @author Lucas
 */
public class Dish 
{
    int []count = {0,0,0,0,0};
    String[] DishInput;
    String DishOutput = "";
        
    void checkDish(String cd)
    {
        DishInput = cd.split(",");
        
        String[] morningType = {"eggs","toast","coffee","error","error"};
        String[] nightType = {"steak","potato","wine","cake","error"};
        
        if (DishInput[0].equals("morning"))
        {
            getNumbersofDish(cd,morningType);
            checkNumber(morningType,true);
            
            System.out.println(DishOutput);
        }
        
        if (DishInput[0].equals("night"))
        {
            getNumbersofDish(cd,nightType);
            checkNumber(nightType,false);
            
            System.out.println(DishOutput);
        }
        
         if(!DishInput[0].equals("morning")& !DishInput[0].equals("night"))
        {
            System.out.println("Error, you need to put morning or night on the beginning.");
        }
         
         else if (DishInput.length<2)
        {
            System.out.println("Error.");
        }
    }
    
    void getNumbersofDish(String cd, String []DishType)
    {        
        for (int i = 1; i < DishInput.length; i++) 
            {
                switch (DishInput[i]) 
                {
                    case "1":
                        count[0]++;
                        break;
                    case "2":
                        count[1]++;
                        break;
                    case "3":
                        count[2]++;
                        break;
                    case "4":
                        count[3]++;
                        break;
                    default:
                        count[4]++;
                        break;
                }
            }
    }
    
    void checkNumber(String []DishType,boolean type)
    {
        if (count[0]>0)
        {
           DishOutput= DishType[0];
            if (count[0]>1)
            {
                DishOutput= DishOutput+","+DishType[4];
                
                for(int i=0;i<count.length;i++)
                    count[i]=0;
            }
        }

        if (count[1]>0)
        {
           if(!type)
            {
                if (count[1]>1)
                    DishOutput= DishOutput+","+DishType[1]+"(x"+count[1]+")";
                else
                    DishOutput= DishOutput+","+DishType[1];
            }
            else
            {
                DishOutput= DishOutput+","+DishType[1];
                if (count[1]>1) 
                {
                    DishOutput= DishOutput+","+DishType[4];
                    for(int i=0;i<count.length;i++)
                        count[i]=0;
                }
            }
        }
        
        if (count[2]>0)
        {
            if(type)
            {
                if (count[2]>1)
                    DishOutput= DishOutput+","+DishType[2]+"(x"+count[2]+")";
                else
                    DishOutput= DishOutput+","+DishType[2];
            }
            else
            {
                DishOutput= DishOutput+","+DishType[2];
                if (count[2]>1) 
                {
                    DishOutput= DishOutput+","+DishType[4];
                    for(int i=0;i<count.length;i++)
                        count[i]=0;
                }
            }
            
        }

        if (count[3]>0)
        {
           DishOutput= DishOutput+","+DishType[3];
            if (count[3]>1) 
            {
                DishOutput= DishOutput+","+DishType[4];
                for(int i=0;i<count.length;i++)
                    count[i]=0;
            }
        }

        if (count[4]>0)
        {
            DishOutput= DishOutput+","+DishType[4];
            for(int i=0;i<count.length;i++)
                {
                    count[i]=0;
                }
        }        
    }
    
}
