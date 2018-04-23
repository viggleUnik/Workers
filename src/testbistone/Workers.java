/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbistone;

/**
 *
 * @author vicol
 */
/*
    We have an infinte nr of workers, they work on special parts of product,
worker1 on parts: 1, 2, 3, 4, 5...
worker 2 on parts: 2, 4, 6, 8.....
worker 3 on parts: 3, 6, 9, 12....

    The cost for work is n*10, where n is number of worker . Find the minumum 
cost for a specific part of a product. 
    
    We have a input integer c that is the cost , need to find witch part is.
*/



public class Workers {
        public Workers ( ){ };
        
        public  int  nrOfPart(int cost){
          int sum = 0;
          boolean oprire = false;
            
          for(int i=1; i< Math.pow(10, 7); i++){
            sum = part(i);
            if(cost == sum ){
                return i;
            }
            int diferentaMajora = sum - cost;
            if(diferentaMajora > 1000 ){
                break;
            }
          }
        return -1;       
        }     
        
        private int part(int n ){
            int var = n;
            int part = 0;
            int i=1;
            while(i < ((var/2)+1) ){
                if(n % i == 0 ){
                    part += i*10;
                }
                i++;    
            }
            part += n*10;
        return part;
        }
        
        
}
