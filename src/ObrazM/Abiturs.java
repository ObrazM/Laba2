package ObrazM;

import java.util.Arrays;

public class Abiturs {
    private Abitur[] abiturs;

    public Abiturs() {
        abiturs = new Abitur[0];
    }

    public Abitur[] getAbiturs() {
        return abiturs;
    }

    //добавление нового абитуриента
    public void addNew(Abitur abitur, int k) {
        int n = 0;
        for (Abitur ab : abiturs)
            if (ab == null)
                break;
            else
                n++;
        if (abiturs.length == n) {
            Abitur[] tempAbiturs = Arrays.copyOf(abiturs, n + 1);
            abiturs = tempAbiturs;
            abiturs[k] = abitur;
        }
    }

    public void add(Abitur abitur) {
        int n = 0;
        for (Abitur ab : abiturs)
            if (ab == null)
                break;
            else
                n++;
        if (abiturs.length == n) {
            Abitur[] tempAbiturs = Arrays.copyOf(abiturs, n + 1);
            abiturs = tempAbiturs;
            abiturs[n] = abitur;
        }
    }
    /*public Abitur checkRemove(int position)
    {
        if (position >=0 && position < abiturs.length)
        {
            Abitur abitur = abiturs[position-1];
            for (int i = position-1; i < abiturs.length-1; i++) {
                abiturs[i] = abiturs[i+1];
            }
            Abitur[] tempAbiturs = Arrays.copyOf(abiturs, abiturs.length - 1);
            abiturs = tempAbiturs;
        }
        return null;
    }*/
    //удаление абитуриента
    public Abitur remove(int averSert) {
        for (int i = 0; i < abiturs.length; i++) {
            if (abiturs[i].averCertificate < averSert) {
                Abitur abitur = abiturs[i - 1];
                for (int j = i - 1; j < abiturs.length - 1; j++) {
                    abiturs[j] = abiturs[j + 1];
                }
                Abitur[] tempAbiturs = Arrays.copyOf(abiturs, abiturs.length - 1);
                abiturs = tempAbiturs;
                //resize(list.length - 1);
                return abitur;
            }
        }
        return null;
    }
}
