package acjavatest;

import acjavatest.domain.Student;

import java.io.*;
import java.util.*;

public class Objects {

    public static List<Student> readStudentsFromCsv(String filename) {
        List<Student> students = new ArrayList<>();

        try (InputStream inputStream = Objects.class.getResourceAsStream("/" + filename)) {
            if (inputStream == null) {
                return students;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                boolean isHeader = true;
                while ((line = reader.readLine()) != null) {
                    if (isHeader) {
                        isHeader = false;
                        continue;
                    }
                    if (line.trim().isEmpty()) continue;

                    String[] parts = line.split(",", 2);
                    if (parts.length == 2) {
                        String id = parts[0].trim();
                        String name = parts[1].trim();
                        students.add(new Student(id, name));
                    }
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {

        List<Student> students = readStudentsFromCsv("data.csv");
        students.sort(Comparator.comparing(Student::getName));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
