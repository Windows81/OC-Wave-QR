package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: A  reason: collision with root package name */
    public int f24786A = -1;

    /* renamed from: z  reason: collision with root package name */
    public final DataBuffer f24787z;

    public DataBufferIterator(DataBuffer dataBuffer) {
        this.f24787z = (DataBuffer) Preconditions.m(dataBuffer);
    }

    public final boolean hasNext() {
        return this.f24786A < this.f24787z.getCount() + -1;
    }

    public Object next() {
        if (hasNext()) {
            DataBuffer dataBuffer = this.f24787z;
            int i2 = this.f24786A + 1;
            this.f24786A = i2;
            return dataBuffer.get(i2);
        }
        int i3 = this.f24786A;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i3);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
