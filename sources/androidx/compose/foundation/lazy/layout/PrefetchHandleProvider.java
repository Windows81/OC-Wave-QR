package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

@Metadata
public final class PrefetchHandleProvider {

    /* renamed from: a  reason: collision with root package name */
    public final LazyLayoutItemContentFactory f4961a;

    /* renamed from: b  reason: collision with root package name */
    public final SubcomposeLayoutState f4962b;

    /* renamed from: c  reason: collision with root package name */
    public final PrefetchScheduler f4963c;

    @Metadata
    public final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {

        /* renamed from: a  reason: collision with root package name */
        public final int f4964a;

        /* renamed from: b  reason: collision with root package name */
        public final long f4965b;

        /* renamed from: c  reason: collision with root package name */
        public final PrefetchMetrics f4966c;

        /* renamed from: d  reason: collision with root package name */
        public SubcomposeLayoutState.PrecomposedSlotHandle f4967d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4968e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4969f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4970g;

        /* renamed from: h  reason: collision with root package name */
        public NestedPrefetchController f4971h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4972i;

        /* renamed from: j  reason: collision with root package name */
        public long f4973j;

        /* renamed from: k  reason: collision with root package name */
        public long f4974k;

        /* renamed from: l  reason: collision with root package name */
        public long f4975l;

        @Metadata
        public final class NestedPrefetchController {

            /* renamed from: a  reason: collision with root package name */
            public final List f4977a;

            /* renamed from: b  reason: collision with root package name */
            public final List[] f4978b;

            /* renamed from: c  reason: collision with root package name */
            public int f4979c;

            /* renamed from: d  reason: collision with root package name */
            public int f4980d;

            public NestedPrefetchController(List list) {
                this.f4977a = list;
                this.f4978b = new List[list.size()];
                if (list.isEmpty()) {
                    InlineClassHelperKt.a("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(PrefetchRequestScope prefetchRequestScope) {
                if (this.f4979c >= this.f4977a.size()) {
                    return false;
                }
                if (HandleAndRequestImpl.this.f4969f) {
                    InlineClassHelperKt.c("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f4979c < this.f4977a.size()) {
                    try {
                        if (this.f4978b[this.f4979c] == null) {
                            if (prefetchRequestScope.a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List[] listArr = this.f4978b;
                            int i2 = this.f4979c;
                            listArr[i2] = ((LazyLayoutPrefetchState) this.f4977a.get(i2)).b();
                        }
                        List list = this.f4978b[this.f4979c];
                        Intrinsics.f(list);
                        while (this.f4980d < list.size()) {
                            if (((PrefetchRequest) list.get(this.f4980d)).b(prefetchRequestScope)) {
                                Trace.endSection();
                                return true;
                            }
                            this.f4980d++;
                        }
                        this.f4980d = 0;
                        this.f4979c++;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Unit unit = Unit.f40552a;
                Trace.endSection();
                return false;
            }
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i2, long j2, PrefetchMetrics prefetchMetrics, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, j2, prefetchMetrics);
        }

        public void a() {
            this.f4972i = true;
        }

        /* JADX INFO: finally extract failed */
        public boolean b(PrefetchRequestScope prefetchRequestScope) {
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) PrefetchHandleProvider.this.f4961a.d().invoke();
            if (!this.f4969f) {
                int b2 = lazyLayoutItemProvider.b();
                int i2 = this.f4964a;
                if (i2 >= 0 && i2 < b2) {
                    Object f2 = lazyLayoutItemProvider.f(i2);
                    g(prefetchRequestScope.a());
                    if (!d()) {
                        if (!i(this.f4973j, this.f4966c.b(f2))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            e(lazyLayoutItemProvider, f2);
                            Unit unit = Unit.f40552a;
                            Trace.endSection();
                            j();
                            this.f4966c.d(f2, this.f4974k);
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!this.f4972i) {
                        if (!this.f4970g) {
                            if (this.f4973j <= 0) {
                                return true;
                            }
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            try {
                                this.f4971h = h();
                                this.f4970g = true;
                                Unit unit2 = Unit.f40552a;
                            } finally {
                                Trace.endSection();
                            }
                        }
                        NestedPrefetchController nestedPrefetchController = this.f4971h;
                        if (nestedPrefetchController != null ? nestedPrefetchController.a(prefetchRequestScope) : false) {
                            return true;
                        }
                        j();
                    }
                    if (!this.f4968e && !Constraints.p(this.f4965b)) {
                        if (!i(this.f4973j, this.f4966c.c(f2))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            f(this.f4965b);
                            Unit unit3 = Unit.f40552a;
                            Trace.endSection();
                            j();
                            this.f4966c.e(f2, this.f4974k);
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
            }
            return false;
        }

        public void cancel() {
            if (!this.f4969f) {
                this.f4969f = true;
                SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.f4967d;
                if (precomposedSlotHandle != null) {
                    precomposedSlotHandle.d();
                }
                this.f4967d = null;
            }
        }

        public final boolean d() {
            return this.f4967d != null;
        }

        public final void e(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
            if (!(this.f4967d == null)) {
                InlineClassHelperKt.a("Request was already composed!");
            }
            Object c2 = lazyLayoutItemProvider.c(this.f4964a);
            this.f4967d = PrefetchHandleProvider.this.f4962b.i(c2, PrefetchHandleProvider.this.f4961a.b(this.f4964a, c2, obj));
        }

        public final void f(long j2) {
            if (this.f4969f) {
                InlineClassHelperKt.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f4968e) {
                InlineClassHelperKt.a("Request was already measured!");
            }
            this.f4968e = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.f4967d;
            if (precomposedSlotHandle != null) {
                int b2 = precomposedSlotHandle.b();
                for (int i2 = 0; i2 < b2; i2++) {
                    precomposedSlotHandle.a(i2, j2);
                }
                return;
            }
            InlineClassHelperKt.b("performComposition() must be called before performMeasure()");
            throw new KotlinNothingValueException();
        }

        public final void g(long j2) {
            this.f4973j = j2;
            this.f4975l = TimeSource.Monotonic.f41219a.a();
            this.f4974k = 0;
        }

        public final NestedPrefetchController h() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.f4967d;
            if (precomposedSlotHandle != null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                precomposedSlotHandle.c("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1(objectRef));
                List list = (List) objectRef.f40908z;
                if (list != null) {
                    return new NestedPrefetchController(list);
                }
                return null;
            }
            InlineClassHelperKt.b("Should precompose before resolving nested prefetch states");
            throw new KotlinNothingValueException();
        }

        public final boolean i(long j2, long j3) {
            return (this.f4972i && j2 > 0) || j3 < j2;
        }

        public final void j() {
            long a2 = TimeSource.Monotonic.f41219a.a();
            long C = Duration.C(TimeSource.Monotonic.ValueTimeMark.k(a2, this.f4975l));
            this.f4974k = C;
            this.f4973j -= C;
            this.f4975l = a2;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.f4964a + ", constraints = " + Constraints.q(this.f4965b) + ", isComposed = " + d() + ", isMeasured = " + this.f4968e + ", isCanceled = " + this.f4969f + " }";
        }

        public HandleAndRequestImpl(int i2, long j2, PrefetchMetrics prefetchMetrics) {
            this.f4964a = i2;
            this.f4965b = j2;
            this.f4966c = prefetchMetrics;
            this.f4975l = TimeSource.Monotonic.f41219a.a();
        }
    }

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.f4961a = lazyLayoutItemContentFactory;
        this.f4962b = subcomposeLayoutState;
        this.f4963c = prefetchScheduler;
    }

    public final PrefetchRequest c(int i2, long j2, PrefetchMetrics prefetchMetrics) {
        return new HandleAndRequestImpl(this, i2, j2, prefetchMetrics, (DefaultConstructorMarker) null);
    }

    public final LazyLayoutPrefetchState.PrefetchHandle d(int i2, long j2, PrefetchMetrics prefetchMetrics) {
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, i2, j2, prefetchMetrics, (DefaultConstructorMarker) null);
        this.f4963c.a(handleAndRequestImpl);
        return handleAndRequestImpl;
    }
}
