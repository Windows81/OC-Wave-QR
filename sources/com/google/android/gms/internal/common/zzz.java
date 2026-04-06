package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
abstract class zzz extends zzak {

    /* renamed from: A  reason: collision with root package name */
    public int f25301A;

    /* renamed from: z  reason: collision with root package name */
    public final int f25302z;

    public zzz(int i2, int i3) {
        zzs.b(i3, i2, "index");
        this.f25302z = i2;
        this.f25301A = i3;
    }

    public abstract Object b(int i2);

    public final boolean hasNext() {
        return this.f25301A < this.f25302z;
    }

    public final boolean hasPrevious() {
        return this.f25301A > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i2 = this.f25301A;
            this.f25301A = i2 + 1;
            return b(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f25301A;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.f25301A - 1;
            this.f25301A = i2;
            return b(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f25301A - 1;
    }
}
