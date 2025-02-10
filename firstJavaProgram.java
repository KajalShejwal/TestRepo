public class firstJavaProgram {

	public static void main(String[] args) {
		
		List<Integer> numberList=Arrays.asList(1,3,5,4,6,9,10);
		//System.out.println(n->n%2==0);
		 
		//print odd number from list using stream
		List<Integer> oddnumberlist=new ArrayList<Integer>();
		oddnumberlist=numberList.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(oddnumberlist);
		
    }}