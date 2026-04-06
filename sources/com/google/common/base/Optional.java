package com.google.common.base;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class Optional<T> implements Serializable {

    /* renamed from: com.google.common.base.Optional$1  reason: invalid class name */
    class AnonymousClass1 implements Iterable<Object> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Iterable f27745z;

        public Iterator iterator() {
            return new AbstractIterator<Object>() {

                /* renamed from: B  reason: collision with root package name */
                public final Iterator f27746B;

                {
                    this.f27746B = (Iterator) Preconditions.q(AnonymousClass1.this.f27745z.iterator());
                }

                public Object b() {
                    while (this.f27746B.hasNext()) {
                        Optional optional = (Optional) this.f27746B.next();
                        if (optional.c()) {
                            return optional.b();
                        }
                    }
                    return c();
                }
            };
        }
    }

    public static Optional a() {
        return Absent.g();
    }

    public static Optional d(Object obj) {
        return new Present(Preconditions.q(obj));
    }

    public abstract Object b();

    public abstract boolean c();

    public abstract Object e(Object obj);

    public abstract Object f();
}
