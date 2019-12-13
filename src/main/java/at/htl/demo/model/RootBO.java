package at.htl.demo.model;

import at.htl.demo.model.data.EntityBase;

public abstract class RootBO<T extends EntityBase> extends BaseBO<T>{
    protected RootBO(T state) {
        super(state);
    }

    public T getState(){
        return this.state;
    }
}
