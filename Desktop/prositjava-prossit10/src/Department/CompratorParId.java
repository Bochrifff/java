package Department;

import java.util.Comparator;

public class CompratorParId implements Comparator<departement> {
    @Override
    public int compare(departement o1, departement o2) {
        return o1.getId() - o2.getId();
    }

}
