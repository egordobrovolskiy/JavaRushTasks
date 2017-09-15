package com.javarush.task.task20.task2024;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public void writeObject(ObjectOutputStream in) throws IOException {
        in.writeInt(node);
        for (Solution sol : edges){
            in.writeObject(sol);
        }
    }
    public void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        node = inputStream.readInt();
        Object o;
        while ((o = inputStream.readObject()) != null){
            edges.add((Solution)o);
        }
    }

    public static void main(String[] args) {

    }
}
