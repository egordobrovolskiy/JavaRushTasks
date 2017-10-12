package com.javarush.task.task33.task3310.strategy;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class Entry implements Serializable {
    Long key;
    String value;
    Entry next;
    int hash;

    public Entry(int hash, Long key, String value, Entry next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public int hashCode() {
//        return Objects.hashCode(this.key) ^ Objects.hashCode(this.value);
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    public boolean equals(Object var1) {
//        if (var1 == this) {
//            return true;
//        } else {
//            if (var1 instanceof Map.Entry) {
//                Map.Entry var2 = (Map.Entry)var1;
//                if (Objects.equals(this.key, var2.getKey()) && Objects.equals(this.value, var2.getValue())) {
//                    return true;
//                }
//            }
//
//            return false;
//        }
        if (!(var1 instanceof Entry))
            return false;

        Long k1 = getKey();
        Long k2 = ((Entry) var1).getKey();
        String v1 = getValue();
        String v2 = ((Entry) var1).getValue();
        if (k1 == k2 || (k1 != null && k1.equals(k2))) {
            if (v1 == v2 || (v1 != null && v1.equals(v2))) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }
}
