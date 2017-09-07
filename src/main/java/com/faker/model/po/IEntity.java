package com.faker.model.po;

import java.io.Serializable;

public interface IEntity<T> extends Serializable {
    T getId();

    void setId(T pk);
}
