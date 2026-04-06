package com.google.common.cache;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
final class LongAddables {

    /* renamed from: a  reason: collision with root package name */
    public static final Supplier f27929a;

    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        public PureJavaLongAddable() {
        }

        public void a() {
            getAndIncrement();
        }

        public void b(long j2) {
            getAndAdd(j2);
        }
    }

    static {
        Supplier supplier;
        try {
            new LongAdder();
            supplier = new Supplier<LongAddable>() {
                /* renamed from: a */
                public LongAddable get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() {
                /* renamed from: a */
                public LongAddable get() {
                    return new PureJavaLongAddable();
                }
            };
        }
        f27929a = supplier;
    }

    public static LongAddable a() {
        return (LongAddable) f27929a.get();
    }
}
