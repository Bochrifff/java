package Employe;

import java.util.Comparator;

public class ComparteurParGrade implements Comparator<Employe> {
    public int compare(Employe o1, Employe o2) {
        return o1.getGrade() - o2.getGrade();
    }
}
