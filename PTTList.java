import java.io.PrintStream;
import java.util.ArrayList;

public class PTTList {
    private ArrayList<PartTimeTeacher> PList = new ArrayList<>(); // Create a arraylist to storage the part-time teacher
    private ArrayList<RequirementList> RList = new ArrayList<>(); // Create a arraylist to storage the requirements of teacher
    private ArrayList<PTTList> PTTList = new ArrayList<>(); //Create a arraylist to storage both the PList and the RList

    //Constructor
    public PTTList(ArrayList<PartTimeTeacher> PList, ArrayList<RequirementList> RList){
        this.PList = PList;
        this.RList = RList;
    }

    public ArrayList<PartTimeTeacher> getPList(){ // getter
        return PList;
    }

    public ArrayList<RequirementList> getRList(){ //getter
        return RList;
    }

    // add value to PList and RList and then add both of them to PTTList
    public void add(PartTimeTeacher p, RequirementList r, PTTList l){ 
        PList.add(p);
        RList.add(r);
        PTTList.add(l);
    }

    // method to remove the value from PTTList
    public void remove(PTTList list){
        int	j;
        int i = -1;
		for (j = 0; j < PTTList.size(); j++){
            if (PTTList.get(j) == list){
                i = j;               
                break;
            }
        }
		PTTList.remove(i);	
    }

    //method to find the PTTList
    public PTTList find(String name){
        int	j;
        int i = -1;
		for (j = 0; j < PList.size(); j++){
            if (PList.get(j).getName() == name){
                i = j;               
                break;
            }
        }
        if(i != -1){
            return PTTList.get(j);
        }else{
            return null;
        }      
    }

    //output form of PTTList
    public void print(PrintStream ps){
        for (int j = 0; j < PTTList.size(); j++){
            ps.print(String.format(PList.get(j).print(), RList.get(j).print()));
            ps.println();
        }
    }
}
