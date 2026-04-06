package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: A  reason: collision with root package name */
    public Object f27639A;

    /* renamed from: z  reason: collision with root package name */
    public State f27640z = State.NOT_READY;

    /* renamed from: com.google.common.base.AbstractIterator$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27641a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.base.AbstractIterator$State[] r0 = com.google.common.base.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27641a = r0
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27641a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractIterator.AnonymousClass1.<clinit>():void");
        }
    }

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object b();

    public final Object c() {
        this.f27640z = State.DONE;
        return null;
    }

    public final boolean d() {
        this.f27640z = State.FAILED;
        this.f27639A = b();
        if (this.f27640z == State.DONE) {
            return false;
        }
        this.f27640z = State.READY;
        return true;
    }

    public final boolean hasNext() {
        Preconditions.w(this.f27640z != State.FAILED);
        int i2 = AnonymousClass1.f27641a[this.f27640z.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            return d();
        }
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            this.f27640z = State.NOT_READY;
            Object a2 = NullnessCasts.a(this.f27639A);
            this.f27639A = null;
            return a2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
