package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT = new Object();

    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(int capasity) {
        this.map = new HashMap<>(capasity);
    }

    public AmigoSet(Collection<? extends E> collection) {
        this.map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        this.addAll(collection);
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public void forEach(Consumer<? super E> consumer) {

    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        return false;
    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return map.keySet().remove(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AmigoSet<E> copy = new AmigoSet<>();
        try {
            copy.addAll(this);
            copy.map.putAll((Map<? extends E, ?>) this.map.clone());
        } catch (Exception e) {
            throw new InternalError(e);
        }
        return copy;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {

        objectOutputStream.defaultWriteObject();

//        objectOutputStream.writeObject(map.size());
//        for(E e : map.keySet()){
//            objectOutputStream.writeObject(e);
//        }
//        objectOutputStream.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"capacity"));
//        objectOutputStream.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"loadFactor"));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();

//        int size = (int)objectInputStream.readObject();
//        Set<E> set = new HashSet<>();
//        for(int i = 0; i < size; i++){
//            set.add((E)objectInputStream.readObject());
//        }
//        int capacity = (int)objectInputStream.readObject();
//        float loadFactor = (float)objectInputStream.readObject();
//        map = new HashMap<>(capacity,loadFactor);
//        for(E e : set){
//            map.put(e,PRESENT);
//        }
    }
}
