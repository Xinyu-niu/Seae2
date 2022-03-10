public class App {
	
	public static void main(String[] args)	{
		Teacher teacher1 = new Teacher("John","Physics");
		Teacher teacher2 = new Teacher("Jane","Math");
		Teacher teacher3 = new Teacher("David","Chemistry");
		Teacher teacher4 = new Teacher("Mary","Biology");
		
		teacher1.print(System.err, teacher1); System.err.print("\n");	
		
		Requirement requirement1 = new Requirement("class1","Math");
		Requirement requirement2 = new Requirement("class2","Physics");
		Requirement requirement3 = new Requirement("class3","Chemistry");
		Requirement requirement4 = new Requirement("class4","Biology");
		requirement1.print(System.err, requirement1); System.err.print("\n");
		
		PTTList pttlist = new PTTList();
		pttlist.add(teacher1,class2,PTTlist1);
		pttlist.add(teacher2,class1,PTTlist2);
		pttlist.add(teacher3,class3,PTTlist3);
		pttlist.add(teacher4,class4,PTTlist4);
		pttlist.print(System.err); System.err.print("\n");	
		
		pttlist.remove(teacher2);
		pttlist.print(System.err); System.err.print("\n");	
		
		PTTList p1 = pttlist.find("John");
		try {
			 p1.print(System.err,p1); System.err.print("\n");}
		catch (Exception e) {
			System.out.println("teacher with the specified name is not in the list\n");
		}
		
		
		PTTList p2 = pttlist.find("Mary");
		try {
			 p2.print(System.err,p2); System.err.print("\n");}
		catch (Exception e) {
			System.out.println("teacher with the specified name is not in the list\n");
		}
		
		pttlist.remove(teacher1);
		pttlist.print(System.err); System.err.print("\n");	
	}
}
