package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class LazyLayoutItemAnimation {

    /* renamed from: s  reason: collision with root package name */
    public static final Companion f4799s = new Companion((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f4800t = 8;

    /* renamed from: u  reason: collision with root package name */
    public static final long f4801u;

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineScope f4802a;

    /* renamed from: b  reason: collision with root package name */
    public final GraphicsContext f4803b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f4804c;

    /* renamed from: d  reason: collision with root package name */
    public FiniteAnimationSpec f4805d;

    /* renamed from: e  reason: collision with root package name */
    public FiniteAnimationSpec f4806e;

    /* renamed from: f  reason: collision with root package name */
    public FiniteAnimationSpec f4807f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4808g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableState f4809h;

    /* renamed from: i  reason: collision with root package name */
    public final MutableState f4810i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableState f4811j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableState f4812k;

    /* renamed from: l  reason: collision with root package name */
    public long f4813l;

    /* renamed from: m  reason: collision with root package name */
    public long f4814m;

    /* renamed from: n  reason: collision with root package name */
    public GraphicsLayer f4815n;

    /* renamed from: o  reason: collision with root package name */
    public final Animatable f4816o;

    /* renamed from: p  reason: collision with root package name */
    public final Animatable f4817p;

    /* renamed from: q  reason: collision with root package name */
    public final MutableState f4818q;

    /* renamed from: r  reason: collision with root package name */
    public long f4819r;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return LazyLayoutItemAnimation.f4801u;
        }

        public Companion() {
        }
    }

    static {
        long j2 = (long) Integer.MAX_VALUE;
        f4801u = IntOffset.f((j2 & 4294967295L) | (j2 << 32));
    }

    public LazyLayoutItemAnimation(CoroutineScope coroutineScope, GraphicsContext graphicsContext, Function0 function0) {
        GraphicsContext graphicsContext2 = graphicsContext;
        this.f4802a = coroutineScope;
        this.f4803b = graphicsContext2;
        this.f4804c = function0;
        Boolean bool = Boolean.FALSE;
        this.f4809h = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4810i = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4811j = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4812k = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        long j2 = f4801u;
        this.f4813l = j2;
        IntOffset.Companion companion = IntOffset.f19160b;
        this.f4814m = companion.b();
        this.f4815n = graphicsContext2 != null ? graphicsContext.b() : null;
        this.f4816o = new Animatable(IntOffset.c(companion.b()), VectorConvertersKt.g(companion), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        this.f4817p = new Animatable(Float.valueOf(1.0f), VectorConvertersKt.i(FloatCompanionObject.f40896a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        this.f4818q = SnapshotStateKt__SnapshotStateKt.e(IntOffset.c(companion.b()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4819r = j2;
    }

    public final void A(boolean z2) {
        this.f4812k.setValue(Boolean.valueOf(z2));
    }

    public final void B(boolean z2) {
        this.f4811j.setValue(Boolean.valueOf(z2));
    }

    public final void C(FiniteAnimationSpec finiteAnimationSpec) {
        this.f4805d = finiteAnimationSpec;
    }

    public final void D(FiniteAnimationSpec finiteAnimationSpec) {
        this.f4807f = finiteAnimationSpec;
    }

    public final void E(long j2) {
        this.f4814m = j2;
    }

    public final void F(long j2) {
        this.f4819r = j2;
    }

    public final void G(boolean z2) {
        this.f4809h.setValue(Boolean.valueOf(z2));
    }

    public final void H(long j2) {
        this.f4818q.setValue(IntOffset.c(j2));
    }

    public final void I(FiniteAnimationSpec finiteAnimationSpec) {
        this.f4806e = finiteAnimationSpec;
    }

    public final void J(long j2) {
        this.f4813l = j2;
    }

    public final void k() {
        GraphicsLayer graphicsLayer = this.f4815n;
        FiniteAnimationSpec finiteAnimationSpec = this.f4805d;
        if (!t() && finiteAnimationSpec != null && graphicsLayer != null) {
            z(true);
            boolean v2 = v();
            boolean z2 = !v2;
            if (!v2) {
                graphicsLayer.L(0.0f);
            }
            Job unused = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animateAppearance$2(z2, this, finiteAnimationSpec, graphicsLayer, (Continuation) null), 3, (Object) null);
        } else if (v()) {
            if (graphicsLayer != null) {
                graphicsLayer.L(1.0f);
            }
            Job unused2 = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animateAppearance$1(this, (Continuation) null), 3, (Object) null);
        }
    }

    public final void l() {
        GraphicsLayer graphicsLayer = this.f4815n;
        FiniteAnimationSpec finiteAnimationSpec = this.f4807f;
        if (graphicsLayer != null && !v() && finiteAnimationSpec != null) {
            B(true);
            Job unused = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animateDisappearance$1(this, finiteAnimationSpec, graphicsLayer, (Continuation) null), 3, (Object) null);
        }
    }

    public final void m(long j2, boolean z2) {
        FiniteAnimationSpec finiteAnimationSpec = this.f4806e;
        if (finiteAnimationSpec != null) {
            long n2 = IntOffset.n(r(), j2);
            H(n2);
            G(true);
            this.f4808g = z2;
            Job unused = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, n2, (Continuation) null), 3, (Object) null);
        }
    }

    public final void n() {
        if (w()) {
            Job unused = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, (Continuation) null), 3, (Object) null);
        }
    }

    public final long o() {
        return this.f4814m;
    }

    public final GraphicsLayer p() {
        return this.f4815n;
    }

    public final long q() {
        return this.f4819r;
    }

    public final long r() {
        return ((IntOffset) this.f4818q.getValue()).r();
    }

    public final long s() {
        return this.f4813l;
    }

    public final boolean t() {
        return ((Boolean) this.f4810i.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f4812k.getValue()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) this.f4811j.getValue()).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) this.f4809h.getValue()).booleanValue();
    }

    public final boolean x() {
        return this.f4808g;
    }

    public final void y() {
        GraphicsContext graphicsContext;
        if (w()) {
            G(false);
            Job unused = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$release$1(this, (Continuation) null), 3, (Object) null);
        }
        if (t()) {
            z(false);
            Job unused2 = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$release$2(this, (Continuation) null), 3, (Object) null);
        }
        if (v()) {
            B(false);
            Job unused3 = BuildersKt__Builders_commonKt.d(this.f4802a, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$release$3(this, (Continuation) null), 3, (Object) null);
        }
        this.f4808g = false;
        H(IntOffset.f19160b.b());
        this.f4813l = f4801u;
        GraphicsLayer graphicsLayer = this.f4815n;
        if (!(graphicsLayer == null || (graphicsContext = this.f4803b) == null)) {
            graphicsContext.a(graphicsLayer);
        }
        this.f4815n = null;
        this.f4805d = null;
        this.f4807f = null;
        this.f4806e = null;
    }

    public final void z(boolean z2) {
        this.f4810i.setValue(Boolean.valueOf(z2));
    }
}
