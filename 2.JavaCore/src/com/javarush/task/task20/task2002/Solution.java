package com.javarush.task.task20.task2002;

import javax.xml.crypto.Data;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
В файле your_file_name.tmp может быть несколько объектов JavaRush.
Метод main реализован только для вас и не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = new File("C:\\Users\\dobro\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2002\\1.dev");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();

            user.setFirstName("Yehor");
            user.setLastName("Dobr");
            user.setBirthDate(new Date(1986-1900, 10, 18));
            user.setMale(true);
            user.setCountry(User.Country.UKRAINE);
            System.out.println(User.Country.valueOf("UKRAINE"));
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            loadedObject.equals(javaRush);
            System.out.println(loadedObject.equals(javaRush));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
         //   SimpleDateFormat formatData = new SimpleDateFormat("yyyy,MM,dd");
            PrintWriter writer = new PrintWriter(outputStream);
            String isUsersPresent = users != null ? "yes" : "no";
            writer.println(isUsersPresent);
            if (users != null) {
                for (User user : users) {
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    writer.println(user.getBirthDate());
                    writer.println(user.isMale());
                    writer.println(user.getCountry());
                }
            }
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isUserPesent = reader.readLine();
//            private String firstName;
//            private String lastName;
//            private Date birthDate;
//            private boolean isMale;
//            private Country country;
            if (isUserPesent.equals("yes")) {
                users.clear();
                while (reader.ready()) {
                    User x = new User();
                    x.setFirstName(reader.readLine());
                    x.setLastName(reader.readLine());
                    x.setBirthDate(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH).parse(reader.readLine()));
                    x.setMale(Boolean.parseBoolean(reader.readLine()));
                    x.setCountry(User.Country.valueOf(reader.readLine()));
                    users.add(x);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
