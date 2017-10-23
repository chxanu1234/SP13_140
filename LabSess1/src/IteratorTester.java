public class IteratorTester {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Collection repo = new Collection();

        while (repo.getIterator().hasNext()) {
        	double item=new Double(repo.getIterator().next().toString());
           //System.out.println("Item Value is:"+item);
            
        	double cost=repo.calculateCost(item);
        	
            System.out.println("Item with weight "+item+"  has shipmentCost of:" + cost);
        }

       


    }
}