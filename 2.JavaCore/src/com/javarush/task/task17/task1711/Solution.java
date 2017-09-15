package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

/*
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
 */

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args.length > 0) {
           switch (args[0]) {
                case "-c" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; ) {
                            if (args[i + 1].equals("м")) {
                                allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                                System.out.println(allPeople.size() - 1);
                            } else if (args[i + 1].equals("ж")) {
                                allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                                System.out.println(allPeople.size() - 1);
                            }
                            i += 3;
                        }
                        break;
                    }
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; ) {
                            allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                            if (args[i + 2].equals("м")) {
                                allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                            } else if (args[i + 2].equals("ж")) {
                                allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                            }
                            allPeople.get(Integer.parseInt(args[i])).setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 3]));
                            i += 4;
                        }
                        break;
                    }
                case "-d" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            allPeople.get(Integer.parseInt(args[i])).setSex(null);
                            allPeople.get(Integer.parseInt(args[i])).setName(null);
                            allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                        }
                        break;
                    }
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);
                            String sex;
                            if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.MALE) {
                                sex = "м";
                            } else sex = "ж";
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + sex + " " + dateFormat.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                        }
                        break;
                    }

                }
            }
        }
    }

