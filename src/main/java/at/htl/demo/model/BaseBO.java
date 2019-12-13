package at.htl.demo.model;

import at.htl.demo.model.data.EntityBase;

public abstract class BaseBO<T extends EntityBase> {
    protected final T state;

    protected BaseBO(T state) {
        this.state = state;
    }
}
