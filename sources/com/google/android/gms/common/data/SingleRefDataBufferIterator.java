package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public Object f24801B;

    public final Object next() {
        if (hasNext()) {
            int i2 = this.f24786A + 1;
            this.f24786A = i2;
            if (i2 == 0) {
                Object m2 = Preconditions.m(this.f24787z.get(0));
                this.f24801B = m2;
                if (!(m2 instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(m2.getClass());
                    throw new IllegalStateException("DataBuffer reference of type " + valueOf + " is not movable");
                }
            } else {
                ((DataBufferRef) Preconditions.m(this.f24801B)).a(this.f24786A);
            }
            return this.f24801B;
        }
        int i3 = this.f24786A;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i3);
    }
}
