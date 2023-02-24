package HWs.HW1;

import java.util.ArrayList;

public class GTree {
    private ArrayList<Branch> tree = new ArrayList<>();

    public ArrayList<Branch> getTree(){
        return tree;
    }

    public void appendParents(Persons parent, Persons children){
        tree.add(new Branch(parent, Relations.PARENT, children));
        tree.add(new Branch(children, Relations.CHILDREN, parent));
    }
    public void appendGrandparent(Persons grandparent, Persons grandchild){
        tree.add(new Branch(grandparent, Relations.GRANDPARENTS, grandchild));
        tree.add(new Branch(grandchild, Relations.GRANDCHILDREN, grandparent));
    }
    public void aunt(Persons aunt, Persons niece){
        tree.add(new Branch(niece, Relations.NIECE, aunt));
        tree.add(new Branch(aunt, Relations.AUNT, niece));
    }
    public void inLow(Persons daughter_in_low, Persons parent_in_law){
        tree.add(new Branch(daughter_in_low, Relations.DAUGHTER_IN_LOW, parent_in_law));
        tree.add(new Branch(parent_in_law, Relations.PARENT_IN_LAW, daughter_in_low));
    }
    public void siblings(Persons sib1, Persons sib2){
        tree.add(new Branch(sib1, Relations.SIBLING, sib2));
    }
}
