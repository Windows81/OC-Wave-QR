package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
abstract class zzj implements Iterator {

    /* renamed from: A  reason: collision with root package name */
    public int f25289A = 2;

    /* renamed from: z  reason: collision with root package name */
    public Object f25290z;

    public abstract Object b();

    public final Object c() {
        this.f25289A = 3;
        return null;
    }

    public final boolean hasNext() {
        int i2 = this.f25289A;
        if (i2 != 4) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                return true;
            } else {
                if (i3 != 2) {
                    this.f25289A = 4;
                    this.f25290z = b();
                    if (this.f25289A != 3) {
                        this.f25289A = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f25289A = 2;
            Object obj = this.f25290z;
            this.f25290z = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
