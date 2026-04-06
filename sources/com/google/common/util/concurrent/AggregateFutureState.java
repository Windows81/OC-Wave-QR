package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {
    public static final AtomicHelper I;
    public static final Logger J;
    public volatile Set G;
    public volatile int H;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f29375a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicIntegerFieldUpdater f29376b;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f29375a = atomicReferenceFieldUpdater;
            this.f29376b = atomicIntegerFieldUpdater;
        }
    }

    public static final class SynchronizedAtomicHelper extends AtomicHelper {
        public SynchronizedAtomicHelper() {
            super();
        }
    }

    static {
        AtomicHelper atomicHelper;
        Class<AggregateFutureState> cls = AggregateFutureState.class;
        J = Logger.getLogger(cls.getName());
        Throwable th = null;
        try {
            atomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "G"), AtomicIntegerFieldUpdater.newUpdater(cls, "H"));
        } catch (Throwable th2) {
            atomicHelper = new SynchronizedAtomicHelper();
            th = th2;
        }
        I = atomicHelper;
        if (th != null) {
            J.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
