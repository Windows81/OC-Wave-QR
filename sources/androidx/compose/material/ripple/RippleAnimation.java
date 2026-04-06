package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@Metadata
public final class RippleAnimation {

    /* renamed from: a  reason: collision with root package name */
    public Offset f9063a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9064b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9065c;

    /* renamed from: d  reason: collision with root package name */
    public Float f9066d;

    /* renamed from: e  reason: collision with root package name */
    public Offset f9067e;

    /* renamed from: f  reason: collision with root package name */
    public final Animatable f9068f;

    /* renamed from: g  reason: collision with root package name */
    public final Animatable f9069g;

    /* renamed from: h  reason: collision with root package name */
    public final Animatable f9070h;

    /* renamed from: i  reason: collision with root package name */
    public final CompletableDeferred f9071i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableState f9072j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableState f9073k;

    public /* synthetic */ RippleAnimation(Offset offset, float f2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f2, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.b(r7)
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.C
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.ResultKt.b(r7)
            goto L_0x0066
        L_0x003f:
            java.lang.Object r2 = r0.C
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.ResultKt.b(r7)
            goto L_0x0056
        L_0x0047:
            kotlin.ResultKt.b(r7)
            r0.C = r6
            r0.F = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            r2.l(r5)
            kotlinx.coroutines.CompletableDeferred r7 = r2.f9071i
            r0.C = r2
            r0.F = r4
            java.lang.Object r7 = r7.G(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r7 = 0
            r0.C = r7
            r0.F = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(DrawScope drawScope, long j2) {
        if (this.f9066d == null) {
            this.f9066d = Float.valueOf(RippleAnimationKt.b(drawScope.c()));
        }
        if (this.f9063a == null) {
            this.f9063a = Offset.d(drawScope.T1());
        }
        if (this.f9067e == null) {
            this.f9067e = Offset.d(OffsetKt.a(Size.i(drawScope.c()) / 2.0f, Size.g(drawScope.c()) / 2.0f));
        }
        float floatValue = (!i() || j()) ? ((Number) this.f9068f.m()).floatValue() : 1.0f;
        Float f2 = this.f9066d;
        Intrinsics.f(f2);
        float b2 = MathHelpersKt.b(f2.floatValue(), this.f9064b, ((Number) this.f9069g.m()).floatValue());
        Offset offset = this.f9063a;
        Intrinsics.f(offset);
        float m2 = Offset.m(offset.t());
        Offset offset2 = this.f9067e;
        Intrinsics.f(offset2);
        float b3 = MathHelpersKt.b(m2, Offset.m(offset2.t()), ((Number) this.f9070h.m()).floatValue());
        Offset offset3 = this.f9063a;
        Intrinsics.f(offset3);
        float n2 = Offset.n(offset3.t());
        Offset offset4 = this.f9067e;
        Intrinsics.f(offset4);
        long a2 = OffsetKt.a(b3, MathHelpersKt.b(n2, Offset.n(offset4.t()), ((Number) this.f9070h.m()).floatValue()));
        long l2 = Color.l(j2, Color.o(j2) * floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (this.f9065c) {
            float i2 = Size.i(drawScope.c());
            float g2 = Size.g(drawScope.c());
            int b4 = ClipOp.f15971b.b();
            DrawContext G1 = drawScope.G1();
            long c2 = G1.c();
            G1.j().o();
            try {
                G1.e().b(0.0f, 0.0f, i2, g2, b4);
                DrawScope.k2(drawScope, l2, b2, a2, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
            } finally {
                G1.j().t();
                G1.f(c2);
            }
        } else {
            DrawScope.k2(drawScope, l2, b2, a2, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
        }
    }

    public final Object f(Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new RippleAnimation$fadeIn$2(this, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final Object g(Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new RippleAnimation$fadeOut$2(this, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final void h() {
        k(true);
        this.f9071i.c0(Unit.f40552a);
    }

    public final boolean i() {
        return ((Boolean) this.f9073k.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.f9072j.getValue()).booleanValue();
    }

    public final void k(boolean z2) {
        this.f9073k.setValue(Boolean.valueOf(z2));
    }

    public final void l(boolean z2) {
        this.f9072j.setValue(Boolean.valueOf(z2));
    }

    public RippleAnimation(Offset offset, float f2, boolean z2) {
        this.f9063a = offset;
        this.f9064b = f2;
        this.f9065c = z2;
        this.f9068f = AnimatableKt.b(0.0f, 0.0f, 2, (Object) null);
        this.f9069g = AnimatableKt.b(0.0f, 0.0f, 2, (Object) null);
        this.f9070h = AnimatableKt.b(0.0f, 0.0f, 2, (Object) null);
        this.f9071i = CompletableDeferredKt.a((Job) null);
        Boolean bool = Boolean.FALSE;
        this.f9072j = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f9073k = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
