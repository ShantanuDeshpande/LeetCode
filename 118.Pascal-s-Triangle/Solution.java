public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<>();
		List<Integer> temp = new ArrayList<Integer>();
		if (numRows == 0 || numRows < 0){
			return myList;
		}
		else if(numRows == 1){
			temp.add(1);
			myList.add(temp);
			return myList;
		}
		else if(numRows == 2){
			temp.add(1);
			myList.add(temp);
			temp = new ArrayList<Integer>();
			temp.add(1);
			temp.add(1);
			myList.add(temp);
			return myList;
		}
		temp.add(1);
		myList.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(1);
		myList.add(temp);
		for (int i = 2; i < numRows; ++i){
			
			temp = new ArrayList<Integer>();
			List<Integer> curr = myList.get(i-1);
			temp.add(curr.get(0));
			for (int j = 0; j < curr.size() - 1; ++j){
				int a = curr.get(j);
				int b = curr.get(j+1);
				temp.add(a+b);
			}
			temp.add(curr.get(curr.size()-1));
			myList.add(temp);
		}
		return myList;
    }
}
