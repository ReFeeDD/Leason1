package Lesson5;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class Main {

        public static void main(String [] args) throws IOException {
           GenerateCsvFile("C:\\Users\\pk\\IdeaProjects\\Hm1\\src\\Lesson5\\test.csv");
            // открываем файл
            BufferedReader reader = new BufferedReader(new FileReader(
                    "C:\\Users\\pk\\IdeaProjects\\Hm1\\src\\Lesson5\\test.csv"));


                    // считываем построчно
                    String line = null;
                    Scanner scanner = null;
                    int index = 0;
                    List<AppData> empList = new ArrayList<>();

                    while ((line = reader.readLine()) != null) {
                        AppData emp = new AppData();
                        scanner = new Scanner(line);
                        scanner.useDelimiter(",");
                        while (scanner.hasNext()) {
                            String data = scanner.next();
                             if (index == 0)
                                emp.setName(data);
                            else if (index == 1)
                                emp.setRole(data);
                            else if (index == 2)
                                emp.setSalary(data);
                            else
                                System.out.println("Incorrect Value:" + data);
                            index++;
                        }
                        index = 0;
                        empList.add(emp);
                    }

                    //закрываем наш ридер
                    reader.close();

                    System.out.println(empList);

                }

    private static void GenerateCsvFile(String sFileName)
    {
        try
        {
            FileWriter writer = new FileWriter(sFileName);

            writer.append("Vasya");
            writer.append(',');
            writer.append("QA");
            writer.append(',');
            writer.append("2000 USD");

            writer.append('\n');

            writer.append("Petya");
            writer.append(',');
            writer.append("GeekBrains Teacher");
            writer.append(',');
            writer.append("5000 USD");
            writer.append('\n');

            writer.append("Zhenya");
            writer.append(',');
            writer.append("Student");
            writer.append(',');
            writer.append("0 USD");
            writer.append('\n');


            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}








