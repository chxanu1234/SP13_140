
import java.lang.reflect.Array;

public class Collection implements Container {
	//list of weights of items for shipment
    public double[] list = {6.7, 3.4 ,11.2, 55 };

    public int index;

    @Override
    public Iterator getIterator() {
        // TODO Auto-generated method stub
        return new MyIterator();
    }
    
   
    
    //
    public double calculateCost(double item){
    	double totalCost;
    	if(item<=5){
    		totalCost=item*0.75;
    	}
    	else{
    		totalCost=item*0.5;
    	}
    	return totalCost;

    }
    
    //
    



    private class MyIterator implements Iterator {

        @Override
        public Object next() {
            // TODO Auto-generated method stub
            if (hasNext()) {
                return list[index++];
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            if (list.length > index) {
                return true;
            }
            return false;
        }

    }

}