import java.util.*;

public class Contents {
    public static void main(String[] args) {
        final String studentsStr = "Дмитренко Олександр - ІП-84; Матвійчук Андрій - ІВ-83; Лесик Сергій - ІО-82;" +
                " Ткаченко Ярослав - ІВ-83; Аверкова Анастасія - ІО-83; Соловйов Даніїл - ІО-83; Рахуба Вероніка - ІО-81;" +
                " Кочерук Давид - ІВ-83; Лихацька Юлія- ІВ-82; Головенець Руслан - ІВ-83; Ющенко Андрій - ІО-82;" +
                " Мінченко Володимир - ІП-83; Мартинюк Назар - ІО-82; Базова Лідія - ІВ-81; Снігурець Олег - ІВ-81;" +
                " Роман Олександр - ІО-82; Дудка Максим - ІО-81; Кулініч Віталій - ІВ-81; Жуков Михайло - ІП-83;" +
                " Грабко Михайло - ІВ-81; Іванов Володимир - ІО-81; Востриков Нікіта - ІО-82; Бондаренко Максим - ІВ-83;" +
                " Скрипченко Володимир - ІВ-82; Кобук Назар - ІО-81; Дровнін Павло - ІВ-83; Тарасенко Юлія - ІО-82;" +
                " Дрозд Світлана - ІВ-81; Фещенко Кирил - ІО-82; Крамар Віктор - ІО-83; Іванов Дмитро - ІВ-82";

        Map<String, ArrayList> studentsGroups = new HashMap<String, ArrayList>();

        String[] students = {"Дмитренко Олександр - ІП-84", "Матвійчук Андрій - ІВ-83", "Лесик Сергій - ІО-82",
                "Ткаченко Ярослав - ІВ-83", "Аверкова Анастасія - ІО-83", "Соловйов Даніїл - ІО-83",
                "Рахуба Вероніка - ІО-81", "Кочерук Давид - ІВ-83", "Лихацька Юлія - ІВ-82", "Головенець Руслан - ІВ-83",
                "Ющенко Андрій - ІО-82", "Мінченко Володимир - ІП-83", "Мартинюк Назар - ІО-82", "Базова Лідія - ІВ-81",
                "Снігурець Олег - ІВ-81", "Роман Олександр - ІО-82", "Іванов Володимир - ІО-81", "Востриков Нікіта - ІО-82",
                "Бондаренко Максим - ІВ-83", "Скрипченко Володимир - ІВ-82", "Кобук Назар - ІО-81", "Дровнін Павло - ІВ-83",
                "Тарасенко Юлія - ІО-82", "Дрозд Світлана - ІВ-81", "Фещенко Кирил - ІО-82", "Крамар Віктор - ІО-83", "Іванов Дмитро - ІВ-82"};

        ArrayList<String> ip_83 = new ArrayList<String>();
        ArrayList<String> ip_84 = new ArrayList<String>();
        ArrayList<String> iv_81 = new ArrayList<String>();
        ArrayList<String> iv_82 = new ArrayList<String>();
        ArrayList<String> iv_83 = new ArrayList<String>();
        ArrayList<String> io_81 = new ArrayList<String>();
        ArrayList<String> io_82 = new ArrayList<String>();
        ArrayList<String> io_83 = new ArrayList<String>();
        removeChar removeChar = new removeChar();

        for(int i = 0; i < students.length; i++){
            if(students[i].contains("ІП-83")){
                ip_83.add(removeChar.removeChars(students[i]));
            }
            if(students[i].contains("ІП-84")){
                ip_84.add(removeChar.removeChars(students[i]));
            }
            if(students[i].contains("ІВ-81")){
                iv_81.add(removeChar.removeChars(students[i]));
            }
            if(students[i].contains("ІВ-82")){
                iv_82.add(removeChar.removeChars(students[i]));
            }
            if(students[i].contains("ІВ-83")){
                iv_83.add(removeChar.removeChars(students[i]));
            }
            if(students[i].contains("ІО-81")){
                io_81.add(removeChar.removeChars(students[i]));
            }
            if(students[i].contains("ІО-82")){
                io_82.add(removeChar.removeChars(students[i]));
            }
            if(students[i].contains("ІО-83")){
                io_83.add(removeChar.removeChars(students[i]));
            }
        }

        studentsGroups.put("ІП-83", ip_83);
        studentsGroups.put("ІП-84", ip_84);
        studentsGroups.put("ІВ-81", iv_81);
        studentsGroups.put("ІВ-82", iv_82);
        studentsGroups.put("ІВ-83", iv_83);
        studentsGroups.put("ІО-81", io_81);
        studentsGroups.put("ІО-82", io_82);
        studentsGroups.put("ІО-83", io_83);

        System.out.println("Завдання 1");
        System.out.println(studentsGroups);


        final int[] points = {12, 12, 12, 12, 12, 12, 12, 16};
        Map<String, Map<String, ArrayList>> studentPoints = new HashMap<String, Map<String, ArrayList>>();

        List keys = new ArrayList(studentsGroups.keySet());
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for(int i = 0; i < keys.size(); i++){
            Map<String, ArrayList> studpoints = new HashMap<String, ArrayList>();
            for(int j = 0; j < studentsGroups.get(keys.get(i)).size(); j++){
                ArrayList<Integer> p = new ArrayList<Integer>();
                for(int k = 0; k < points.length; k++){
                    p.add(rundomValue(points[j]));
                }
                studpoints.put(studentsGroups.get(keys.get(i)).get(j).toString(), p);
            }
            studentPoints.put((String) studentsGroups.keySet().toArray()[i], studpoints);
        }

        System.out.println("Завдання 2");
        System.out.println(studentPoints);

        Map<String, Map<String, Integer>> sumPoints = new HashMap<String, Map<String, Integer>>();
        for(int i = 0; i < keys.size(); i++){
            Map<String, Integer> sumpoints = new HashMap<String, Integer>();
            for(int j = 0; j < studentPoints.get(keys.get(i)).size(); j++){
                List keys_2 = new ArrayList(studentPoints.get(keys.get(i)).keySet());
                Integer p = 0;
                for(int k = 0; k < points.length; k++){
                    p += (int)studentPoints.get(keys.get(i)).get(keys_2.get(j)).get(k);
                }
                sumpoints.put(studentPoints.get(keys.get(i)).keySet().toArray()[j].toString(), p);
            }
            sumPoints.put((String) studentsGroups.keySet().toArray()[i], sumpoints);
        }

        System.out.println("Завдання 3");
        System.out.println(sumPoints);

        Map<String, Double> groupAvg = new HashMap<String, Double>();
        for(int i = 0; i < keys.size(); i++){
            double avgpoints = 0;
            double p = 0;
            for(int j = 0; j < studentPoints.get(keys.get(i)).size(); j++){
                List keys_2 = new ArrayList(studentPoints.get(keys.get(i)).keySet());
                p += sumPoints.get(keys.get(i)).get(keys_2.get(j));
            }
            avgpoints += p/sumPoints.get(keys.get(i)).keySet().toArray().length;
            groupAvg.put((String) studentsGroups.keySet().toArray()[i], avgpoints);
        }

        System.out.println("Завдання 4");
        System.out.println(groupAvg);

        Map<String, ArrayList> passedPerGroup = new HashMap<String, ArrayList>();
        for(int i = 0; i < keys.size(); i++){
            ArrayList<String> well_done = new ArrayList<String>();
            List keys_2 = new ArrayList(sumPoints.get(keys.get(i)).keySet());
            for(int j = 0; j < sumPoints.get(keys.get(i)).size(); j++){
                String p = "";
                if(sumPoints.get(keys.get(i)).get(keys_2.get(j)) >= 60){
                    well_done.add(keys_2.get(j).toString());
                }
            }
            passedPerGroup.put((String) sumPoints.keySet().toArray()[i], well_done);
        }

        System.out.println("Завдання 5");
        System.out.println(passedPerGroup);
    }
    public static int rundomValue(int maxValue){
        switch ((int) (Math.random()*7)){
            case 1:
                return (int)(Math.round((float)maxValue * 0.7));
            case 2:
                return (int)(Math.round((float)maxValue * 0.9));
            case 3: case 4: case 5:
                return maxValue;
            default:
                return 0;
        }
    }
    public static class removeChar{
        private String removeChars(String s){
            return s.substring(0, s.length() - 8);
        }
    }
}