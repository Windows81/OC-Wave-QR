package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;

public class EmptyLoadChangeSet extends OsCollectionChangeSet {
    public static final int[] C = new int[0];
    public static final OrderedCollectionChangeSet.Range[] D = new OrderedCollectionChangeSet.Range[0];

    public EmptyLoadChangeSet() {
        super(0, true);
    }

    public OrderedCollectionChangeSet.Range[] a() {
        return D;
    }

    public OrderedCollectionChangeSet.Range[] b() {
        return D;
    }

    public Throwable c() {
        return null;
    }

    public OrderedCollectionChangeSet.Range[] d() {
        return D;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return super.f();
    }

    public long getNativeFinalizerPtr() {
        return super.getNativeFinalizerPtr();
    }

    public long getNativePtr() {
        return super.getNativePtr();
    }

    public String toString() {
        return super.toString();
    }
}
