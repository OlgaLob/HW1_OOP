package HWs.HW1;

import java.util.ArrayList;
import java.util.Iterator;

public class Search {
    private ArrayList<Branch> tree;

    public Search(GTree gtree) {
        this.tree = gtree.getTree();
    }

    public ArrayList<Persons> spend(Persons p, Relations r) {
        ArrayList<Persons> result = new ArrayList();
        Iterator var4 = this.tree.iterator();

        while (var4.hasNext()) {
            Branch t = (Branch) var4.next();
            if (t.getPer1().getName() == p.getName() && t.getRs() == r) {
                result.add(t.getPer2());
            }
        }
        return result;
    }
}
