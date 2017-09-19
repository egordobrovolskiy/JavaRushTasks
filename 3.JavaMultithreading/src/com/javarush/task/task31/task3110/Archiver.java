package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите путь и имя нового архива");
        String zipPath = reader.readLine();
        ZipFileManager zipFile = new ZipFileManager(Paths.get(zipPath));
        System.out.println("Укажите путь и имя файла, который будем архивировать");
        String filePath = reader.readLine();
        zipFile.createZip(Paths.get(filePath));

        new ExitCommand().execute();
    }
}
