package HWs.HW1;

public class Program {
    public static void main(String[] args){
        Persons pers1 = new Persons("Olga", "female");
        Persons pers2 = new Persons("Tatiana", "female");
        Persons pers3 = new Persons("Nick", "male");
        Persons pers4 = new Persons("Nadejda", "female");

        Persons pers10 = new Persons("Ivan", "male");
        Persons pers11 = new Persons("Olga", "female");
        Persons pers12 = new Persons("Lidiya", "female");

        GTree gt = new GTree();
        gt.appendParents(pers4, pers1);
        gt.appendParents(pers4, pers2);
        gt.appendParents(pers3, pers1);
        gt.appendParents(pers3, pers2);
        gt.appendParents(pers10, pers3);
        gt.appendParents(pers11, pers3);
        gt.appendParents(pers10, pers12);
        gt.appendParents(pers11, pers12);
        gt.appendGrandparent(pers10, pers1);
        gt.appendGrandparent(pers10, pers2);
        gt.appendGrandparent(pers11, pers1);
        gt.appendGrandparent(pers11, pers2);
        gt.aunt(pers12, pers1);
        gt.aunt(pers12, pers2);
        gt.siblings(pers1, pers2);
        gt.siblings(pers3, pers12);
        gt.inLow(pers4, pers10);
        gt.inLow(pers4, pers11);

        System.out.println(new Search(gt).spend(pers1, Relations.NIECE));
    }
}
