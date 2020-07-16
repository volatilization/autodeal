package com.traning.autodeal.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Type implements EnumClass<Integer> {

    CROSSOVER(10),
    UNIVERSAL(20),
    SEDAN(30);

    private Integer id;

    Type(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Type fromId(Integer id) {
        for (Type at : Type.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}