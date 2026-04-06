package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final VectorizedAnimationSpec f2702a;

    /* renamed from: b  reason: collision with root package name */
    public final TwoWayConverter f2703b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2704c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2705d;

    /* renamed from: e  reason: collision with root package name */
    public AnimationVector f2706e;

    /* renamed from: f  reason: collision with root package name */
    public AnimationVector f2707f;

    /* renamed from: g  reason: collision with root package name */
    public final AnimationVector f2708g;

    /* renamed from: h  reason: collision with root package name */
    public long f2709h;

    /* renamed from: i  reason: collision with root package name */
    public AnimationVector f2710i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
        r1 = androidx.compose.animation.core.AnimationVectorsKt.e(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TargetBasedAnimation(androidx.compose.animation.core.VectorizedAnimationSpec r1, androidx.compose.animation.core.TwoWayConverter r2, java.lang.Object r3, java.lang.Object r4, androidx.compose.animation.core.AnimationVector r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f2702a = r1
            r0.f2703b = r2
            r0.f2704c = r4
            r0.f2705d = r3
            androidx.compose.animation.core.TwoWayConverter r1 = r0.c()
            kotlin.jvm.functions.Function1 r1 = r1.a()
            java.lang.Object r1 = r1.invoke(r3)
            androidx.compose.animation.core.AnimationVector r1 = (androidx.compose.animation.core.AnimationVector) r1
            r0.f2706e = r1
            androidx.compose.animation.core.TwoWayConverter r1 = r0.c()
            kotlin.jvm.functions.Function1 r1 = r1.a()
            java.lang.Object r1 = r1.invoke(r4)
            androidx.compose.animation.core.AnimationVector r1 = (androidx.compose.animation.core.AnimationVector) r1
            r0.f2707f = r1
            if (r5 == 0) goto L_0x0033
            androidx.compose.animation.core.AnimationVector r1 = androidx.compose.animation.core.AnimationVectorsKt.e(r5)
            if (r1 != 0) goto L_0x0045
        L_0x0033:
            androidx.compose.animation.core.TwoWayConverter r1 = r0.c()
            kotlin.jvm.functions.Function1 r1 = r1.a()
            java.lang.Object r1 = r1.invoke(r3)
            androidx.compose.animation.core.AnimationVector r1 = (androidx.compose.animation.core.AnimationVector) r1
            androidx.compose.animation.core.AnimationVector r1 = androidx.compose.animation.core.AnimationVectorsKt.g(r1)
        L_0x0045:
            r0.f2708g = r1
            r1 = -1
            r0.f2709h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TargetBasedAnimation.<init>(androidx.compose.animation.core.VectorizedAnimationSpec, androidx.compose.animation.core.TwoWayConverter, java.lang.Object, java.lang.Object, androidx.compose.animation.core.AnimationVector):void");
    }

    public boolean a() {
        return this.f2702a.a();
    }

    public long b() {
        if (this.f2709h < 0) {
            this.f2709h = this.f2702a.b(this.f2706e, this.f2707f, this.f2708g);
        }
        return this.f2709h;
    }

    public TwoWayConverter c() {
        return this.f2703b;
    }

    public AnimationVector d(long j2) {
        if (e(j2)) {
            return h();
        }
        return this.f2702a.c(j2, this.f2706e, this.f2707f, this.f2708g);
    }

    public Object f(long j2) {
        if (e(j2)) {
            return g();
        }
        AnimationVector f2 = this.f2702a.f(j2, this.f2706e, this.f2707f, this.f2708g);
        int b2 = f2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (Float.isNaN(f2.a(i2))) {
                PreconditionsKt.b("AnimationVector cannot contain a NaN. " + f2 + ". Animation: " + this + ", playTimeNanos: " + j2);
            }
        }
        return c().b().invoke(f2);
    }

    public Object g() {
        return this.f2704c;
    }

    public final AnimationVector h() {
        AnimationVector animationVector = this.f2710i;
        if (animationVector != null) {
            return animationVector;
        }
        AnimationVector e2 = this.f2702a.e(this.f2706e, this.f2707f, this.f2708g);
        this.f2710i = e2;
        return e2;
    }

    public final Object i() {
        return this.f2705d;
    }

    public final void j(Object obj) {
        if (!Intrinsics.d(obj, this.f2705d)) {
            this.f2705d = obj;
            this.f2706e = (AnimationVector) c().a().invoke(obj);
            this.f2710i = null;
            this.f2709h = -1;
        }
    }

    public final void k(Object obj) {
        if (!Intrinsics.d(this.f2704c, obj)) {
            this.f2704c = obj;
            this.f2707f = (AnimationVector) c().a().invoke(obj);
            this.f2710i = null;
            this.f2709h = -1;
        }
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.f2708g + ", duration: " + AnimationKt.c(this) + " ms,animationSpec: " + this.f2702a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationSpec, twoWayConverter, obj, obj2, (i2 & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector) {
        this(animationSpec.a(twoWayConverter), twoWayConverter, obj, obj2, animationVector);
    }
}
