import java.io.PrintStream;
import java.util.ArrayList;

public class PTTList {
    private ArrayList<PartTimeTeacher> PList = new ArrayList<>();;
    private ArrayList<RequirementList> RList = new ArrayList<>();;
    private ArrayList<PTTList> PTTList;

    public PTTList(ArrayList<PartTimeTeacher> PList, ArrayList<RequirementList> RList){
        this.PList = PList;
        this.RList = RList;
    }

    public ArrayList<PartTimeTeacher> getPList(){
        return PList;
    }

    public ArrayList<RequirementList> getRList(){
        return RList;
    }

    public void add(PartTimeTeacher p, RequirementList r, PTTList l){
        PList.add(p);
        RList.add(r);
        PTTList.add(l);
    }

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

    public void print(PrintStream ps){
        for (int j = 0; j < PTTList.size(); j++){
            ps.print(String.format(PList.get(j).print(), RList.get(j).print()));
            ps.println();
        }
    }
}
