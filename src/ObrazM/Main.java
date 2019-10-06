package ObrazM;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //заполнение массива
        String lastNames = "Filin,Baranov,Mykhailov,Obraztsov,Shuliak";
        String[] lastNamesArray = lastNames.split(",");
        String names = "Dima,Maxim,Artem,Alexandr,Boris";
        String[] namesArray = names.split(",");
        String fatherNames = "Alexandroich,Victorovich";
        String[] fatherNamesArray = fatherNames.split(",");
        Abitur[] abiturs = new Abitur[5];
        for (int i = 0; i < abiturs.length; i++) {
            abiturs[i] = new Abitur(1, "Obraz", "Mary", "Evgen", 1999, 100, 100, 95, 11);
            abiturs[i].number = i;
            abiturs[i].lastName = lastNamesArray[(int) (Math.random() * lastNamesArray.length)];
            abiturs[i].name = namesArray[(int) (Math.random() * namesArray.length)];
            abiturs[i].fatherName = fatherNamesArray[(int) (Math.random() * fatherNamesArray.length)];
            abiturs[i].yearOfBirth = 1998 + i;
            abiturs[i].mark1 = (int) (Math.random() * 100);
            abiturs[i].mark2 = (int) (Math.random() * 100);
            abiturs[i].mark3 = (int) (Math.random() * 100);
            abiturs[i].averCertificate = (double) (Math.random() * 12);
        }

        //выдача сведений об абитуриенте с указанной фамилией
        System.out.println("If there is the last name: ");
       String s1 = "Obraztsova";
       for (int i = 0; i < abiturs.length; i++){
       abiturs[i].Compare(s1,abiturs[i].lastName);}
        System.out.println("\n"+"\n");

        //выдача сведений об абитуриентах с отображением оценок в 100-бальной системе
        System.out.println("Show marks: ");
        for (int i = 0; i < abiturs.length; i++){
        System.out.println(abiturs[i].getData());}
        System.out.println("\n"+"\n");

       //добавление нового абитуриента после абитуриента с заданной фамилией
        String s2 = "Obraztsov";
        int n = abiturs.length;
        for (int i = 0; i < abiturs.length; i++) {
            if (s2.equals(abiturs[i].lastName)) {
            Abitur[] tempAbiturs = Arrays.copyOf(abiturs, n+1);
            abiturs = tempAbiturs;
            abiturs[i+1] = new Abitur(5,"Obraz","Mary","Evgen",1999,100,100,95,11);
            }
        }
        System.out.println("After adding: ");
        for (int j = 0; j < abiturs.length; j++) {
            System.out.println(abiturs[j].toString() + abiturs.length);
        }
        System.out.println("\n"+"\n");

        //удаление абитуриентов с аттестатом ниже среднего
        int averSertCheck = 8;
        int r=0;
        for (int i = 0; i < abiturs.length-1; i++) {
            for (Abitur av : abiturs)
            if (abiturs[i].averCertificate<averSertCheck) {
                Abitur[] tempAbiturs = Arrays.copyOf(abiturs, abiturs.length);
                for (int m=i; m<tempAbiturs.length-1;m++){
                    tempAbiturs[m] = tempAbiturs[m+1];
                }
                abiturs = tempAbiturs;
            }
        }

        System.out.println("After deleting: ");
            for (int j = 0; j < abiturs.length; j++) {
                System.out.println(abiturs[j].toString() + abiturs.length);
            }
        }
    }
