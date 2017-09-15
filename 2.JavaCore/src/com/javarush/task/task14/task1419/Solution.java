package com.javarush.task.task14.task1419;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;
import javax.xml.crypto.dsig.TransformException;
import java.awt.datatransfer.MimeTypeParseException;
import java.lang.instrument.IllegalClassFormatException;
import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.acl.AclNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new AclNotFoundException();
        } catch (AclNotFoundException e) {
            exceptions.add(e);
        }
        try {
            throw new ActivationException();
        } catch (ActivationException e) {
            exceptions.add(e);
        }
        try {
            throw new AlreadyBoundException();
        } catch (AlreadyBoundException e) {
            exceptions.add(e);
        }
        try {
            throw new InvalidTargetObjectTypeException();
        }  catch (InvalidTargetObjectTypeException e) {
            exceptions.add(e);
        }
        try {
            throw new NamingException();
        } catch (NamingException e) {
            exceptions.add(e);
        }
        try {
            throw  new TransformException();
        } catch (TransformException e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalClassFormatException();
        } catch (IllegalClassFormatException e) {
            exceptions.add(e);
        }
        try {
            throw new MimeTypeParseException();
        } catch (MimeTypeParseException e) {
            exceptions.add(e);
        }
        try {
            throw new LineUnavailableException();
        } catch (LineUnavailableException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
