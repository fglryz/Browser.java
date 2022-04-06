package day37_Inheritance.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {//has a relationship
    public ProoductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester>testers=new ArrayList<>();
    public ArrayList<Developer>developers=new ArrayList<>();

    public ScrumTeam(ProoductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }
    public void addTester(Tester tester){
        testers.add(tester);

    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p->p.id==id);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);

    }
    public  void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(int id){
        developers.removeIf(p->p.id==id);
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA .name+
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", numbers of developers=" + developers.size() +
                '}';
    }
}

