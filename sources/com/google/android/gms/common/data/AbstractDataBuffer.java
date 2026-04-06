package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {

    /* renamed from: z  reason: collision with root package name */
    public final DataHolder f24782z;

    public final void close() {
        g();
    }

    public void g() {
        DataHolder dataHolder = this.f24782z;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public abstract Object get(int i2);

    public int getCount() {
        DataHolder dataHolder = this.f24782z;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    public Iterator iterator() {
        return new DataBufferIterator(this);
    }
}
