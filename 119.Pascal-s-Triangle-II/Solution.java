public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> myList = new ArrayList<Integer>();
        if (rowIndex < 0){
        	return myList;
        }
        else if (rowIndex == 0){
        	myList.add(1);
        	return myList;
        }
        else{
        	myList.add(1);
        	myList.add(1);
        }
        
        int a = 1;
        for (int i = 1; i < rowIndex; ++i){
        	for (int j = 1; j < myList.size(); ++j){
        		int b = myList.get(j);
        		myList.set(j,a+b);
        		a = b;
        	}
        	myList.add(a);
        }
        return myList;
    }
}
