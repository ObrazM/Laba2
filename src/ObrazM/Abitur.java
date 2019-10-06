package ObrazM;

import java.util.Arrays;

public class Abitur {
    int number;
    String lastName;
    String name;
    String fatherName;
    int yearOfBirth;
    int mark1;
    int mark2;
    int mark3;
    double averCertificate;

    public Abitur[] abiturs = new Abitur[7];

    public Abitur(int number,String lastName,String name,String fatherName,int yearOfBirth,int mark1,int mark2,int mark3, double averCertificate)
    {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.fatherName = fatherName;
        this.yearOfBirth = yearOfBirth;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.averCertificate = averCertificate;
    }

    public String toString() {
        return "\n" + "Student: " +
                "Number: " + number + "\n"+ "FIO: " + lastName + " " + name +" "+ fatherName +"\n"+"Year of Birth: " + yearOfBirth + "\n"+"Marks for the exam: "
                + mark1 + "; " + mark2 + "; " + mark3 + "\n" + "Average mark of sertificate: " + averCertificate;
    }

    public double getAverMark(){
        return ((mark1+mark2+mark3)/3)*0.88 + averCertificate;
    }
    public String getData() {
        return "\n" + "Student: " +
                "Number: " + number + "\n"+ "FIO: " + lastName + " " + name +" "+ fatherName +"\n"+"Year of Birth: " + yearOfBirth + "\n"+"Mark: "
                + getAverMark();
    }

    public void Compare(String s1, String lastName){
        if (s1.equals(lastName)){
            System.out.println(toString());
        }
    }

    public void add(Abitur abitur)
    {
        //int n = abiturs.length;
        int n = 0;
        for (Abitur ab : abiturs) {
            if (ab == null)
                break;
            else
                n++;
        }
         if (abiturs.length == n){
            Abitur[] tempTriangles = Arrays.copyOf(abiturs, n+1);
            abiturs = tempTriangles;
            abiturs[n] = abitur;
        }
    }
    /*public Abitur remove() {
        for (int i = 0; i < 4; i++) {
            if (abiturs[i].averCertificate < 8) {
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
    }*/
}
