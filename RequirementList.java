public class RequirementList {
    private String Class;
    private String skill;

    public RequirementList(String Class, String skill){
        this.Class = Class;
        this.skill = skill;
    }

    public String getClassees() {
		return this.Class;
	}

    public String getSkill() {
		return this.skill;
	}
}
