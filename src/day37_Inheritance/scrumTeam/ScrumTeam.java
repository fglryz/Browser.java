package day37_Inheritance.scrumTeam;

import java.util.ArrayList;

public class ScrumTeam {
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
}
