package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyStaggeredGridMeasureContext {

    /* renamed from: a  reason: collision with root package name */
    public final LazyStaggeredGridState f5079a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5080b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyStaggeredGridItemProvider f5081c;

    /* renamed from: d  reason: collision with root package name */
    public final LazyStaggeredGridSlots f5082d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5083e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5084f;

    /* renamed from: g  reason: collision with root package name */
    public final LazyLayoutMeasureScope f5085g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5086h;

    /* renamed from: i  reason: collision with root package name */
    public final long f5087i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5088j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5089k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5090l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5091m;

    /* renamed from: n  reason: collision with root package name */
    public final CoroutineScope f5092n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5093o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5094p;

    /* renamed from: q  reason: collision with root package name */
    public final LazyStaggeredGridLayoutInfo f5095q;

    /* renamed from: r  reason: collision with root package name */
    public final GraphicsContext f5096r;

    /* renamed from: s  reason: collision with root package name */
    public final LazyStaggeredGridMeasureProvider f5097s;

    /* renamed from: t  reason: collision with root package name */
    public final LazyStaggeredGridLaneInfo f5098t;

    /* renamed from: u  reason: collision with root package name */
    public final int f5099u;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z2, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i4, boolean z3, int i5, CoroutineScope coroutineScope, boolean z4, boolean z5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z2, lazyLayoutMeasureScope, i2, j3, i3, i4, z3, i5, coroutineScope, z4, z5, lazyStaggeredGridLayoutInfo, graphicsContext);
    }

    public final int a() {
        return this.f5089k;
    }

    public final LazyStaggeredGridLayoutInfo b() {
        return this.f5095q;
    }

    public final int c() {
        return this.f5088j;
    }

    public final long d() {
        return this.f5083e;
    }

    public final long e() {
        return this.f5087i;
    }

    public final CoroutineScope f() {
        return this.f5092n;
    }

    public final GraphicsContext g() {
        return this.f5096r;
    }

    public final LazyStaggeredGridItemProvider h() {
        return this.f5081c;
    }

    public final int i() {
        return this.f5099u;
    }

    public final LazyStaggeredGridLaneInfo j() {
        return this.f5098t;
    }

    public final int k() {
        return this.f5086h;
    }

    public final int l() {
        return this.f5091m;
    }

    public final LazyLayoutMeasureScope m() {
        return this.f5085g;
    }

    public final LazyStaggeredGridMeasureProvider n() {
        return this.f5097s;
    }

    public final List o() {
        return this.f5080b;
    }

    public final LazyStaggeredGridSlots p() {
        return this.f5082d;
    }

    public final boolean q() {
        return this.f5090l;
    }

    public final long r(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2, int i3) {
        boolean a2 = lazyStaggeredGridItemProvider.g().a(i2);
        int i4 = a2 ? this.f5099u : 1;
        if (a2) {
            i3 = 0;
        }
        return SpanRange.a(i3, i4);
    }

    public final LazyStaggeredGridState s() {
        return this.f5079a;
    }

    public final boolean t(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2) {
        return lazyStaggeredGridItemProvider.g().a(i2);
    }

    public final boolean u() {
        return this.f5093o;
    }

    public final boolean v() {
        return this.f5084f;
    }

    public LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z2, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i4, boolean z3, int i5, CoroutineScope coroutineScope, boolean z4, boolean z5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        this.f5079a = lazyStaggeredGridState;
        this.f5080b = list;
        this.f5081c = lazyStaggeredGridItemProvider;
        this.f5082d = lazyStaggeredGridSlots;
        this.f5083e = j2;
        this.f5084f = z2;
        this.f5085g = lazyLayoutMeasureScope;
        this.f5086h = i2;
        this.f5087i = j3;
        this.f5088j = i3;
        this.f5089k = i4;
        this.f5090l = z3;
        this.f5091m = i5;
        this.f5092n = coroutineScope;
        this.f5093o = z4;
        this.f5094p = z5;
        this.f5095q = lazyStaggeredGridLayoutInfo;
        this.f5096r = graphicsContext;
        this.f5097s = new LazyStaggeredGridMeasureContext$measuredItemProvider$1(this, z2, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots);
        this.f5098t = lazyStaggeredGridState.x();
        this.f5099u = lazyStaggeredGridSlots.b().length;
    }
}
