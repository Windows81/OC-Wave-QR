package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyLayoutPrefetchState {

    /* renamed from: a  reason: collision with root package name */
    public final PrefetchScheduler f4908a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f4909b;

    /* renamed from: c  reason: collision with root package name */
    public final PrefetchMetrics f4910c;

    /* renamed from: d  reason: collision with root package name */
    public PrefetchHandleProvider f4911d;

    @Metadata
    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {

        /* renamed from: a  reason: collision with root package name */
        public final List f4912a = new ArrayList();

        public NestedPrefetchScopeImpl() {
        }

        public void a(int i2) {
            c(i2, LazyLayoutPrefetchStateKt.f4914a);
        }

        public final List b() {
            return this.f4912a;
        }

        public void c(int i2, long j2) {
            PrefetchHandleProvider c2 = LazyLayoutPrefetchState.this.c();
            if (c2 != null) {
                this.f4912a.add(c2.c(i2, j2, LazyLayoutPrefetchState.this.f4910c));
            }
        }
    }

    @Metadata
    public interface PrefetchHandle {
        void a();

        void cancel();
    }

    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, Function1 function1) {
        this.f4908a = prefetchScheduler;
        this.f4909b = function1;
        this.f4910c = new PrefetchMetrics();
    }

    public final List b() {
        Function1 function1 = this.f4909b;
        if (function1 == null) {
            return CollectionsKt.m();
        }
        NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new NestedPrefetchScopeImpl();
        function1.invoke(nestedPrefetchScopeImpl);
        return nestedPrefetchScopeImpl.b();
    }

    public final PrefetchHandleProvider c() {
        return this.f4911d;
    }

    public final PrefetchScheduler d() {
        return this.f4908a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.d(r3, r4, r2.f4910c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle e(int r3, long r4) {
        /*
            r2 = this;
            androidx.compose.foundation.lazy.layout.PrefetchHandleProvider r0 = r2.f4911d
            if (r0 == 0) goto L_0x000c
            androidx.compose.foundation.lazy.layout.PrefetchMetrics r1 = r2.f4910c
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r3 = r0.d(r3, r4, r1)
            if (r3 != 0) goto L_0x000e
        L_0x000c:
            androidx.compose.foundation.lazy.layout.DummyHandle r3 = androidx.compose.foundation.lazy.layout.DummyHandle.f4776a
        L_0x000e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.e(int, long):androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle");
    }

    public final void f(PrefetchHandleProvider prefetchHandleProvider) {
        this.f4911d = prefetchHandleProvider;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : prefetchScheduler, (i2 & 2) != 0 ? null : function1);
    }
}
