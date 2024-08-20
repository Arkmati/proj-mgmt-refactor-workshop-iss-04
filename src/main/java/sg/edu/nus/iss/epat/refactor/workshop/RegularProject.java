package sg.edu.nus.iss.epat.refactor.workshop;

import java.util.ArrayList;
import java.util.List;

public class RegularProject extends Project{

    private List<String> members;
    public RegularProject() {
        super();
        members = new ArrayList<String>();
    }

    public void addMember(String member) {
        members.add(member);
    }

    public String removeMember(String member) {
        members.remove(member);
        return member;
    }

    public List<String> getMembers() {
        return members;
    }
}
