package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
public abstract class CacheLoader<K, V> {

    /* renamed from: com.google.common.cache.CacheLoader$1  reason: invalid class name */
    class AnonymousClass1 extends CacheLoader<Object, Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Executor f27859A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ CacheLoader f27860z;

        public Object a(Object obj) {
            return this.f27860z.a(obj);
        }

        public ListenableFuture b(final Object obj, final Object obj2) {
            ListenableFutureTask a2 = ListenableFutureTask.a(new Callable<Object>() {
                public Object call() {
                    return AnonymousClass1.this.f27860z.b(obj, obj2).get();
                }
            });
            this.f27859A.execute(a2);
            return a2;
        }
    }

    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Function f27864z;

        public Object a(Object obj) {
            return this.f27864z.apply(Preconditions.q(obj));
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Supplier f27865z;

        public Object a(Object obj) {
            Preconditions.q(obj);
            return this.f27865z.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    public abstract Object a(Object obj);

    public ListenableFuture b(Object obj, Object obj2) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        return Futures.e(a(obj));
    }
}
