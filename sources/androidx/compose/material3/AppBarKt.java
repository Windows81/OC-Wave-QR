package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AppBarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9182a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f9183b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f9184c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f9185d;

    /* renamed from: e  reason: collision with root package name */
    public static final ProvidableCompositionLocal f9186e = CompositionLocalKt.h((SnapshotMutationPolicy) null, new C0252u(), 1, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public static final ProvidableCompositionLocal f9187f = CompositionLocalKt.h((SnapshotMutationPolicy) null, new C0261v(), 1, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    public static final CubicBezierEasing f9188g = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);

    /* renamed from: h  reason: collision with root package name */
    public static final float f9189h = Dp.m((float) 24);

    /* renamed from: i  reason: collision with root package name */
    public static final float f9190i = Dp.m((float) 28);

    /* renamed from: j  reason: collision with root package name */
    public static final float f9191j;

    /* renamed from: k  reason: collision with root package name */
    public static final float f9192k;

    static {
        float f2 = (float) 16;
        float f3 = (float) 12;
        float m2 = Dp.m(Dp.m(f2) - Dp.m(f3));
        f9182a = m2;
        float m3 = Dp.m(Dp.m(f2) - Dp.m(f3));
        f9183b = m3;
        f9184c = Dp.m(Dp.m(f2) - m2);
        f9185d = Dp.m(Dp.m(f3) - m3);
        float m4 = Dp.m((float) 4);
        f9191j = m4;
        f9192k = Dp.m(Dp.m(f2) - m4);
    }

    public static final Unit A(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public static final Unit B(Function0 function0, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(((Number) function0.invoke()).floatValue());
        return Unit.f40552a;
    }

    public static final Unit C(Modifier modifier, FloatProducer floatProducer, long j2, long j3, long j4, long j5, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Function0 function0, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, boolean z2, Function2 function23, Function2 function24, float f2, int i3, int i4, Composer composer, int i5) {
        x(modifier, floatProducer, j2, j3, j4, j5, function2, textStyle, function22, textStyle2, function0, vertical, horizontal, i2, z2, function23, function24, f2, composer, RecomposeScopeImplKt.a(i3 | 1), RecomposeScopeImplKt.a(i4));
        return Unit.f40552a;
    }

    public static final Unit D(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        w(function2, modifier, function22, function3, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = androidx.compose.ui.layout.OnRemeasuredModifierKt.a(r1, new androidx.compose.material3.C0216q((r2 = r2.c())));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier M(androidx.compose.ui.Modifier r1, androidx.compose.material3.TopAppBarScrollBehavior r2) {
        /*
            if (r2 == 0) goto L_0x0015
            androidx.compose.material3.TopAppBarState r2 = r2.c()
            if (r2 == 0) goto L_0x0015
            androidx.compose.material3.q r0 = new androidx.compose.material3.q
            r0.<init>(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.OnRemeasuredModifierKt.a(r1, r0)
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.M(androidx.compose.ui.Modifier, androidx.compose.material3.TopAppBarScrollBehavior):androidx.compose.ui.Modifier");
    }

    public static final Unit N(TopAppBarState topAppBarState, IntSize intSize) {
        topAppBarState.l(-(((float) ((int) (intSize.j() & 4294967295L))) - topAppBarState.g()));
        return Unit.f40552a;
    }

    public static final float O() {
        return f9183b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object P(androidx.compose.material3.TopAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec r24, androidx.compose.animation.core.AnimationSpec r25, kotlin.coroutines.Continuation r26) {
        /*
            r0 = r22
            r1 = r26
            boolean r2 = r1 instanceof androidx.compose.material3.AppBarKt$settleAppBar$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.material3.AppBarKt$settleAppBar$1 r2 = (androidx.compose.material3.AppBarKt$settleAppBar$1) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.G = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.AppBarKt$settleAppBar$1 r2 = new androidx.compose.material3.AppBarKt$settleAppBar$1
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.F
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.G
            r10 = 2
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0051
            if (r3 == r4) goto L_0x003e
            if (r3 != r10) goto L_0x0036
            java.lang.Object r0 = r2.C
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            kotlin.ResultKt.b(r1)
            goto L_0x010e
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r0 = r2.E
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            java.lang.Object r3 = r2.D
            androidx.compose.animation.core.AnimationSpec r3 = (androidx.compose.animation.core.AnimationSpec) r3
            java.lang.Object r4 = r2.C
            androidx.compose.material3.TopAppBarState r4 = (androidx.compose.material3.TopAppBarState) r4
            kotlin.ResultKt.b(r1)
            r1 = r0
            r13 = r3
            r0 = r4
            goto L_0x00b2
        L_0x0051:
            kotlin.ResultKt.b(r1)
            float r1 = r22.e()
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x011a
            float r1 = r22.e()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x006b
            goto L_0x011a
        L_0x006b:
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r5 = r23
            r1.f40905z = r5
            if (r24 == 0) goto L_0x00b4
            float r6 = java.lang.Math.abs(r23)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b4
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r20 = 28
            r21 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r14 = r23
            androidx.compose.animation.core.AnimationState r5 = androidx.compose.animation.core.AnimationStateKt.c(r13, r14, r15, r17, r19, r20, r21)
            androidx.compose.material3.l r6 = new androidx.compose.material3.l
            r6.<init>(r3, r0, r1)
            r2.C = r0
            r13 = r25
            r2.D = r13
            r2.E = r1
            r2.G = r4
            r7 = 0
            r8 = 2
            r9 = 0
            r3 = r5
            r4 = r24
            r5 = r7
            r7 = r2
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.i(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r11) goto L_0x00b2
            return r11
        L_0x00b2:
            r5 = r13
            goto L_0x00b7
        L_0x00b4:
            r13 = r25
            goto L_0x00b2
        L_0x00b7:
            if (r5 == 0) goto L_0x010f
            float r3 = r0.g()
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x010f
            float r3 = r0.g()
            float r4 = r0.h()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            float r13 = r0.g()
            r20 = 30
            r21 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.c(r13, r14, r15, r17, r19, r20, r21)
            float r4 = r0.e()
            r6 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ec
            r4 = r12
            goto L_0x00f0
        L_0x00ec:
            float r4 = r0.h()
        L_0x00f0:
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.b(r4)
            androidx.compose.material3.r r7 = new androidx.compose.material3.r
            r7.<init>(r0)
            r2.C = r1
            r0 = 0
            r2.D = r0
            r2.E = r0
            r2.G = r10
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r2
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.k(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L_0x010d
            return r11
        L_0x010d:
            r0 = r1
        L_0x010e:
            r1 = r0
        L_0x010f:
            float r0 = r1.f40905z
            long r0 = androidx.compose.ui.unit.VelocityKt.a(r12, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.b(r0)
            return r0
        L_0x011a:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.f19186b
            long r0 = r0.a()
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.P(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Unit Q(Ref.FloatRef floatRef, TopAppBarState topAppBarState, Ref.FloatRef floatRef2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.e()).floatValue() - floatRef.f40905z;
        float g2 = topAppBarState.g();
        topAppBarState.k(g2 + floatValue);
        float abs = Math.abs(g2 - topAppBarState.g());
        floatRef.f40905z = ((Number) animationScope.e()).floatValue();
        floatRef2.f40905z = ((Number) animationScope.f()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.a();
        }
        return Unit.f40552a;
    }

    public static final Unit R(TopAppBarState topAppBarState, AnimationScope animationScope) {
        topAppBarState.k(((Number) animationScope.e()).floatValue());
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object S(androidx.compose.material3.BottomAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec r24, androidx.compose.animation.core.AnimationSpec r25, kotlin.coroutines.Continuation r26) {
        /*
            r0 = r22
            r1 = r26
            boolean r2 = r1 instanceof androidx.compose.material3.AppBarKt$settleAppBarBottom$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.material3.AppBarKt$settleAppBarBottom$1 r2 = (androidx.compose.material3.AppBarKt$settleAppBarBottom$1) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.G = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.AppBarKt$settleAppBarBottom$1 r2 = new androidx.compose.material3.AppBarKt$settleAppBarBottom$1
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.F
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.G
            r10 = 2
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0051
            if (r3 == r4) goto L_0x003e
            if (r3 != r10) goto L_0x0036
            java.lang.Object r0 = r2.C
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            kotlin.ResultKt.b(r1)
            goto L_0x010e
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r0 = r2.E
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            java.lang.Object r3 = r2.D
            androidx.compose.animation.core.AnimationSpec r3 = (androidx.compose.animation.core.AnimationSpec) r3
            java.lang.Object r4 = r2.C
            androidx.compose.material3.BottomAppBarState r4 = (androidx.compose.material3.BottomAppBarState) r4
            kotlin.ResultKt.b(r1)
            r1 = r0
            r13 = r3
            r0 = r4
            goto L_0x00b2
        L_0x0051:
            kotlin.ResultKt.b(r1)
            float r1 = r22.a()
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x011a
            float r1 = r22.a()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x006b
            goto L_0x011a
        L_0x006b:
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r5 = r23
            r1.f40905z = r5
            if (r24 == 0) goto L_0x00b4
            float r6 = java.lang.Math.abs(r23)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b4
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r20 = 28
            r21 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r14 = r23
            androidx.compose.animation.core.AnimationState r5 = androidx.compose.animation.core.AnimationStateKt.c(r13, r14, r15, r17, r19, r20, r21)
            androidx.compose.material3.s r6 = new androidx.compose.material3.s
            r6.<init>(r3, r0, r1)
            r2.C = r0
            r13 = r25
            r2.D = r13
            r2.E = r1
            r2.G = r4
            r7 = 0
            r8 = 2
            r9 = 0
            r3 = r5
            r4 = r24
            r5 = r7
            r7 = r2
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.i(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r11) goto L_0x00b2
            return r11
        L_0x00b2:
            r5 = r13
            goto L_0x00b7
        L_0x00b4:
            r13 = r25
            goto L_0x00b2
        L_0x00b7:
            if (r5 == 0) goto L_0x010f
            float r3 = r0.b()
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x010f
            float r3 = r0.b()
            float r4 = r0.f()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            float r13 = r0.b()
            r20 = 30
            r21 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.c(r13, r14, r15, r17, r19, r20, r21)
            float r4 = r0.a()
            r6 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ec
            r4 = r12
            goto L_0x00f0
        L_0x00ec:
            float r4 = r0.f()
        L_0x00f0:
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.b(r4)
            androidx.compose.material3.t r7 = new androidx.compose.material3.t
            r7.<init>(r0)
            r2.C = r1
            r0 = 0
            r2.D = r0
            r2.E = r0
            r2.G = r10
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r2
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.k(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L_0x010d
            return r11
        L_0x010d:
            r0 = r1
        L_0x010e:
            r1 = r0
        L_0x010f:
            float r0 = r1.f40905z
            long r0 = androidx.compose.ui.unit.VelocityKt.a(r12, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.b(r0)
            return r0
        L_0x011a:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.f19186b
            long r0 = r0.a()
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.S(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Unit T(Ref.FloatRef floatRef, BottomAppBarState bottomAppBarState, Ref.FloatRef floatRef2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.e()).floatValue() - floatRef.f40905z;
        float b2 = bottomAppBarState.b();
        bottomAppBarState.e(b2 + floatValue);
        float abs = Math.abs(b2 - bottomAppBarState.b());
        floatRef.f40905z = ((Number) animationScope.e()).floatValue();
        floatRef2.f40905z = ((Number) animationScope.f()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.a();
        }
        return Unit.f40552a;
    }

    public static final Unit U(BottomAppBarState bottomAppBarState, AnimationScope animationScope) {
        bottomAppBarState.e(((Number) animationScope.e()).floatValue());
        return Unit.f40552a;
    }

    public static final BottomAppBarState p(float f2, float f3, float f4) {
        return new BottomAppBarStateImpl(f2, f3, f4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(kotlin.jvm.functions.Function2 r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function3 r30, float r31, androidx.compose.foundation.layout.WindowInsets r32, androidx.compose.material3.TopAppBarColors r33, androidx.compose.material3.TopAppBarScrollBehavior r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r9 = r36
            r10 = r37
            r0 = -302230691(0xffffffffedfc535d, float:-9.7613753E27)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r27
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r27
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r27
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r28
            goto L_0x0046
        L_0x0034:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r28
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r29
            goto L_0x0061
        L_0x004f:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r29
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r30
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r30
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r31
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r31
            boolean r14 = r1.h(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b1
            r14 = r10 & 32
            if (r14 != 0) goto L_0x00ab
            r14 = r32
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r14 = r32
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r15
            goto L_0x00b3
        L_0x00b1:
            r14 = r32
        L_0x00b3:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00ce
            r15 = r10 & 64
            if (r15 != 0) goto L_0x00c7
            r15 = r33
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c7:
            r15 = r33
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00ce:
            r15 = r33
        L_0x00d0:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00db
            r3 = r3 | r17
            r2 = r34
            goto L_0x00ee
        L_0x00db:
            r17 = r9 & r17
            r2 = r34
            if (r17 != 0) goto L_0x00ee
            boolean r17 = r1.W(r2)
            if (r17 == 0) goto L_0x00ea
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r17
        L_0x00ee:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r2 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r2 == r5) goto L_0x00fa
            r2 = 1
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0201
            r1.p()
            r2 = r9 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = 6
            if (r2 == 0) goto L_0x0130
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x0115
            goto L_0x0130
        L_0x0115:
            r1.B()
            r0 = r10 & 32
            if (r0 == 0) goto L_0x011e
            r3 = r3 & r17
        L_0x011e:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0126
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0126:
            r2 = r28
        L_0x0128:
            r8 = r34
        L_0x012a:
            r0 = r11
            r4 = r14
            r6 = r15
            r11 = r3
            r3 = r13
            goto L_0x0173
        L_0x0130:
            if (r4 == 0) goto L_0x0135
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0137
        L_0x0135:
            r2 = r28
        L_0x0137:
            if (r6 == 0) goto L_0x0140
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f9484a
            kotlin.jvm.functions.Function2 r4 = r4.c()
            r7 = r4
        L_0x0140:
            if (r8 == 0) goto L_0x0149
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f9484a
            kotlin.jvm.functions.Function3 r4 = r4.b()
            r11 = r4
        L_0x0149:
            if (r12 == 0) goto L_0x0152
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f11631a
            float r4 = r4.b()
            r13 = r4
        L_0x0152:
            r4 = r10 & 32
            if (r4 == 0) goto L_0x015f
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f11631a
            androidx.compose.foundation.layout.WindowInsets r4 = r4.c(r1, r5)
            r3 = r3 & r17
            r14 = r4
        L_0x015f:
            r4 = r10 & 64
            if (r4 == 0) goto L_0x016e
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f11631a
            androidx.compose.material3.TopAppBarColors r4 = r4.d(r1, r5)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
            r15 = r4
        L_0x016e:
            if (r0 == 0) goto L_0x0128
            r0 = 0
            r8 = r0
            goto L_0x012a
        L_0x0173:
            r1.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0185
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:349)"
            r14 = -302230691(0xffffffffedfc535d, float:-9.7613753E27)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r12, r13)
        L_0x0185:
            androidx.compose.material3.tokens.AppBarSmallTokens r12 = androidx.compose.material3.tokens.AppBarSmallTokens.f12741a
            androidx.compose.material3.tokens.TypographyKeyTokens r12 = r12.b()
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material3.TypographyKt.e(r12, r1, r5)
            androidx.compose.ui.text.TextStyle$Companion r5 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r15 = r5.a()
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r16 = r5.g()
            androidx.compose.ui.unit.Dp$Companion r5 = androidx.compose.ui.unit.Dp.f19144A
            float r12 = r5.c()
            boolean r12 = androidx.compose.ui.unit.Dp.o(r3, r12)
            if (r12 != 0) goto L_0x01b5
            float r5 = r5.b()
            boolean r5 = androidx.compose.ui.unit.Dp.o(r3, r5)
            if (r5 == 0) goto L_0x01b2
            goto L_0x01b5
        L_0x01b2:
            r19 = r3
            goto L_0x01bd
        L_0x01b5:
            androidx.compose.material3.TopAppBarDefaults r5 = androidx.compose.material3.TopAppBarDefaults.f11631a
            float r5 = r5.b()
            r19 = r5
        L_0x01bd:
            int r5 = r11 >> 3
            r5 = r5 & 14
            r12 = 224256(0x36c00, float:3.1425E-40)
            r5 = r5 | r12
            int r12 = r11 << 3
            r12 = r12 & 112(0x70, float:1.57E-43)
            r5 = r5 | r12
            int r12 = r11 << 12
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r12
            r5 = r5 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r12
            r5 = r5 | r14
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r12 = r12 & r14
            r24 = r5 | r12
            int r5 = r11 >> 18
            r25 = r5 & 126(0x7e, float:1.77E-43)
            r26 = 0
            r14 = 0
            r11 = r2
            r12 = r27
            r17 = r7
            r18 = r0
            r20 = r4
            r21 = r6
            r22 = r8
            r23 = r1
            u(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01fb
            androidx.compose.runtime.ComposerKt.X()
        L_0x01fb:
            r5 = r3
            r3 = r7
            r7 = r6
            r6 = r4
            r4 = r0
            goto L_0x020d
        L_0x0201:
            r1.B()
            r2 = r28
            r8 = r34
            r3 = r7
            r4 = r11
            r5 = r13
            r6 = r14
            r7 = r15
        L_0x020d:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0222
            androidx.compose.material3.x r12 = new androidx.compose.material3.x
            r0 = r12
            r1 = r27
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.q(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit r(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        q(function2, modifier, function22, function3, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final SingleRowTopAppBarOverride s() {
        return DefaultSingleRowTopAppBarOverride.f9844a;
    }

    public static final TwoRowsTopAppBarOverride t() {
        return DefaultTwoRowsTopAppBarOverride.f9849a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(androidx.compose.ui.Modifier r32, kotlin.jvm.functions.Function2 r33, androidx.compose.ui.text.TextStyle r34, kotlin.jvm.functions.Function2 r35, androidx.compose.ui.text.TextStyle r36, androidx.compose.ui.Alignment.Horizontal r37, kotlin.jvm.functions.Function2 r38, kotlin.jvm.functions.Function3 r39, float r40, androidx.compose.foundation.layout.WindowInsets r41, androidx.compose.material3.TopAppBarColors r42, androidx.compose.material3.TopAppBarScrollBehavior r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r13 = r45
            r15 = r47
            r0 = -2033800111(0xffffffff86c6ac51, float:-7.473252E-35)
            r1 = r44
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0017
            r5 = r13 | 6
            r6 = r5
            r5 = r32
            goto L_0x002b
        L_0x0017:
            r5 = r13 & 6
            if (r5 != 0) goto L_0x0028
            r5 = r32
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0025
            r6 = 4
            goto L_0x0026
        L_0x0025:
            r6 = 2
        L_0x0026:
            r6 = r6 | r13
            goto L_0x002b
        L_0x0028:
            r5 = r32
            r6 = r13
        L_0x002b:
            r7 = r15 & 2
            if (r7 == 0) goto L_0x0034
            r6 = r6 | 48
        L_0x0031:
            r7 = r33
            goto L_0x0046
        L_0x0034:
            r7 = r13 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r33
            boolean r10 = r1.l(r7)
            if (r10 == 0) goto L_0x0043
            r10 = 32
            goto L_0x0045
        L_0x0043:
            r10 = 16
        L_0x0045:
            r6 = r6 | r10
        L_0x0046:
            r10 = r15 & 4
            if (r10 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r34
            goto L_0x0061
        L_0x004f:
            r10 = r13 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r34
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r11
        L_0x0061:
            r11 = r15 & 8
            if (r11 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r35
            goto L_0x007c
        L_0x006a:
            r11 = r13 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r35
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r12
        L_0x007c:
            r12 = r15 & 16
            if (r12 == 0) goto L_0x0085
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r36
            goto L_0x0097
        L_0x0085:
            r12 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r36
            boolean r14 = r1.W(r12)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r6 = r6 | r14
        L_0x0097:
            r14 = r15 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a2
            r6 = r6 | r16
        L_0x009f:
            r14 = r37
            goto L_0x00b5
        L_0x00a2:
            r14 = r13 & r16
            if (r14 != 0) goto L_0x009f
            r14 = r37
            boolean r16 = r1.W(r14)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r6 = r6 | r16
        L_0x00b5:
            r16 = r15 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c0
            r6 = r6 | r17
            r8 = r38
            goto L_0x00d3
        L_0x00c0:
            r16 = r13 & r17
            r8 = r38
            if (r16 != 0) goto L_0x00d3
            boolean r16 = r1.l(r8)
            if (r16 == 0) goto L_0x00cf
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r6 = r6 | r16
        L_0x00d3:
            r3 = r15 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00de
            r6 = r6 | r17
        L_0x00db:
            r3 = r39
            goto L_0x00f1
        L_0x00de:
            r3 = r13 & r17
            if (r3 != 0) goto L_0x00db
            r3 = r39
            boolean r17 = r1.l(r3)
            if (r17 == 0) goto L_0x00ed
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00ed:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r6 = r6 | r17
        L_0x00f1:
            r4 = r15 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x00fc
            r6 = r6 | r18
        L_0x00f9:
            r4 = r40
            goto L_0x010f
        L_0x00fc:
            r4 = r13 & r18
            if (r4 != 0) goto L_0x00f9
            r4 = r40
            boolean r18 = r1.h(r4)
            if (r18 == 0) goto L_0x010b
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010d
        L_0x010b:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010d:
            r6 = r6 | r18
        L_0x010f:
            r9 = r15 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r9 == 0) goto L_0x011a
            r6 = r6 | r19
        L_0x0117:
            r9 = r41
            goto L_0x012d
        L_0x011a:
            r9 = r13 & r19
            if (r9 != 0) goto L_0x0117
            r9 = r41
            boolean r19 = r1.W(r9)
            if (r19 == 0) goto L_0x0129
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012b
        L_0x0129:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012b:
            r6 = r6 | r19
        L_0x012d:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0138
            r0 = r46 | 6
            r16 = r0
            r0 = r42
            goto L_0x0150
        L_0x0138:
            r0 = r46 & 6
            if (r0 != 0) goto L_0x014c
            r0 = r42
            boolean r20 = r1.W(r0)
            if (r20 == 0) goto L_0x0147
            r16 = 4
            goto L_0x0149
        L_0x0147:
            r16 = 2
        L_0x0149:
            r16 = r46 | r16
            goto L_0x0150
        L_0x014c:
            r0 = r42
            r16 = r46
        L_0x0150:
            r0 = r15 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0159
            r16 = r16 | 48
        L_0x0156:
            r0 = r16
            goto L_0x0170
        L_0x0159:
            r0 = r46 & 48
            if (r0 != 0) goto L_0x016d
            r0 = r43
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x0168
            r18 = 32
            goto L_0x016a
        L_0x0168:
            r18 = 16
        L_0x016a:
            r16 = r16 | r18
            goto L_0x0156
        L_0x016d:
            r0 = r43
            goto L_0x0156
        L_0x0170:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r6 & r16
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            r5 = 0
            if (r3 != r4) goto L_0x0184
            r3 = r0 & 19
            r4 = 18
            if (r3 == r4) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r3 = r5
            goto L_0x0185
        L_0x0184:
            r3 = 1
        L_0x0185:
            r4 = r6 & 1
            boolean r3 = r1.E(r3, r4)
            if (r3 == 0) goto L_0x01d8
            if (r2 == 0) goto L_0x0192
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0194
        L_0x0192:
            r2 = r32
        L_0x0194:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01a2
            java.lang.String r3 = "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:2484)"
            r4 = -2033800111(0xffffffff86c6ac51, float:-7.473252E-35)
            androidx.compose.runtime.ComposerKt.Y(r4, r6, r0, r3)
        L_0x01a2:
            androidx.compose.material3.SingleRowTopAppBarOverrideScope r0 = new androidx.compose.material3.SingleRowTopAppBarOverrideScope
            r29 = 0
            r16 = r0
            r17 = r2
            r18 = r33
            r19 = r34
            r20 = r35
            r21 = r36
            r22 = r37
            r23 = r38
            r24 = r39
            r25 = r40
            r26 = r41
            r27 = r42
            r28 = r43
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = f9186e
            java.lang.Object r3 = r1.C(r3)
            androidx.compose.material3.SingleRowTopAppBarOverride r3 = (androidx.compose.material3.SingleRowTopAppBarOverride) r3
            r3.a(r0, r1, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01dd
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01dd
        L_0x01d8:
            r1.B()
            r2 = r32
        L_0x01dd:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.x()
            if (r6 == 0) goto L_0x0214
            androidx.compose.material3.y r5 = new androidx.compose.material3.y
            r0 = r5
            r1 = r2
            r2 = r33
            r3 = r34
            r4 = r35
            r11 = r5
            r5 = r36
            r12 = r6
            r6 = r37
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = r41
            r14 = r11
            r11 = r42
            r30 = r12
            r12 = r43
            r13 = r45
            r31 = r14
            r14 = r46
            r15 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r30
            r1 = r31
            r0.a(r1)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.u(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, androidx.compose.ui.Alignment$Horizontal, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit v(Modifier modifier, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Alignment.Horizontal horizontal, Function2 function23, Function3 function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, int i4, Composer composer, int i5) {
        u(modifier, function2, textStyle, function22, textStyle2, horizontal, function23, function3, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(kotlin.jvm.functions.Function2 r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function3 r30, float r31, androidx.compose.foundation.layout.WindowInsets r32, androidx.compose.material3.TopAppBarColors r33, androidx.compose.material3.TopAppBarScrollBehavior r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r9 = r36
            r10 = r37
            r0 = 1784421840(0x6a5c1dd0, float:6.6526116E25)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r27
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r27
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r27
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r28
            goto L_0x0046
        L_0x0034:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r28
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r29
            goto L_0x0061
        L_0x004f:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r29
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r30
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r30
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r31
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r31
            boolean r14 = r1.h(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b1
            r14 = r10 & 32
            if (r14 != 0) goto L_0x00ab
            r14 = r32
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r14 = r32
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r15
            goto L_0x00b3
        L_0x00b1:
            r14 = r32
        L_0x00b3:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00ce
            r15 = r10 & 64
            if (r15 != 0) goto L_0x00c7
            r15 = r33
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c7:
            r15 = r33
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00ce:
            r15 = r33
        L_0x00d0:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00db
            r3 = r3 | r17
            r2 = r34
            goto L_0x00ee
        L_0x00db:
            r17 = r9 & r17
            r2 = r34
            if (r17 != 0) goto L_0x00ee
            boolean r17 = r1.W(r2)
            if (r17 == 0) goto L_0x00ea
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r17
        L_0x00ee:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r2 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r2 == r5) goto L_0x00fa
            r2 = 1
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0201
            r1.p()
            r2 = r9 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = 6
            if (r2 == 0) goto L_0x0130
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x0115
            goto L_0x0130
        L_0x0115:
            r1.B()
            r0 = r10 & 32
            if (r0 == 0) goto L_0x011e
            r3 = r3 & r17
        L_0x011e:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0126
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0126:
            r2 = r28
        L_0x0128:
            r8 = r34
        L_0x012a:
            r0 = r11
            r4 = r14
            r6 = r15
            r11 = r3
            r3 = r13
            goto L_0x0173
        L_0x0130:
            if (r4 == 0) goto L_0x0135
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0137
        L_0x0135:
            r2 = r28
        L_0x0137:
            if (r6 == 0) goto L_0x0140
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f9484a
            kotlin.jvm.functions.Function2 r4 = r4.d()
            r7 = r4
        L_0x0140:
            if (r8 == 0) goto L_0x0149
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f9484a
            kotlin.jvm.functions.Function3 r4 = r4.a()
            r11 = r4
        L_0x0149:
            if (r12 == 0) goto L_0x0152
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f11631a
            float r4 = r4.b()
            r13 = r4
        L_0x0152:
            r4 = r10 & 32
            if (r4 == 0) goto L_0x015f
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f11631a
            androidx.compose.foundation.layout.WindowInsets r4 = r4.c(r1, r5)
            r3 = r3 & r17
            r14 = r4
        L_0x015f:
            r4 = r10 & 64
            if (r4 == 0) goto L_0x016e
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f11631a
            androidx.compose.material3.TopAppBarColors r4 = r4.d(r1, r5)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
            r15 = r4
        L_0x016e:
            if (r0 == 0) goto L_0x0128
            r0 = 0
            r8 = r0
            goto L_0x012a
        L_0x0173:
            r1.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0185
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.TopAppBar (AppBar.kt:225)"
            r14 = 1784421840(0x6a5c1dd0, float:6.6526116E25)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r12, r13)
        L_0x0185:
            androidx.compose.material3.tokens.AppBarSmallTokens r12 = androidx.compose.material3.tokens.AppBarSmallTokens.f12741a
            androidx.compose.material3.tokens.TypographyKeyTokens r12 = r12.b()
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material3.TypographyKt.e(r12, r1, r5)
            androidx.compose.ui.text.TextStyle$Companion r5 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r15 = r5.a()
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r16 = r5.k()
            androidx.compose.ui.unit.Dp$Companion r5 = androidx.compose.ui.unit.Dp.f19144A
            float r12 = r5.c()
            boolean r12 = androidx.compose.ui.unit.Dp.o(r3, r12)
            if (r12 != 0) goto L_0x01b5
            float r5 = r5.b()
            boolean r5 = androidx.compose.ui.unit.Dp.o(r3, r5)
            if (r5 == 0) goto L_0x01b2
            goto L_0x01b5
        L_0x01b2:
            r19 = r3
            goto L_0x01bd
        L_0x01b5:
            androidx.compose.material3.TopAppBarDefaults r5 = androidx.compose.material3.TopAppBarDefaults.f11631a
            float r5 = r5.b()
            r19 = r5
        L_0x01bd:
            int r5 = r11 >> 3
            r5 = r5 & 14
            r12 = 224256(0x36c00, float:3.1425E-40)
            r5 = r5 | r12
            int r12 = r11 << 3
            r12 = r12 & 112(0x70, float:1.57E-43)
            r5 = r5 | r12
            int r12 = r11 << 12
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r12
            r5 = r5 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r12
            r5 = r5 | r14
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r12 = r12 & r14
            r24 = r5 | r12
            int r5 = r11 >> 18
            r25 = r5 & 126(0x7e, float:1.77E-43)
            r26 = 0
            r14 = 0
            r11 = r2
            r12 = r27
            r17 = r7
            r18 = r0
            r20 = r4
            r21 = r6
            r22 = r8
            r23 = r1
            u(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01fb
            androidx.compose.runtime.ComposerKt.X()
        L_0x01fb:
            r5 = r3
            r3 = r7
            r7 = r6
            r6 = r4
            r4 = r0
            goto L_0x020d
        L_0x0201:
            r1.B()
            r2 = r28
            r8 = r34
            r3 = r7
            r4 = r11
            r5 = r13
            r6 = r14
            r7 = r15
        L_0x020d:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0222
            androidx.compose.material3.w r12 = new androidx.compose.material3.w
            r0 = r12
            r1 = r27
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.w(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void x(Modifier modifier, FloatProducer floatProducer, long j2, long j3, long j4, long j5, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Function0 function0, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, boolean z2, Function2 function23, Function2 function24, float f2, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Composer composer2;
        int i7;
        Object obj;
        Modifier.Companion companion;
        float f3;
        Modifier modifier2;
        Modifier modifier3;
        Function0 function02;
        Modifier modifier4 = modifier;
        FloatProducer floatProducer2 = floatProducer;
        Function2 function25 = function22;
        Function0 function03 = function0;
        Alignment.Horizontal horizontal2 = horizontal;
        boolean z3 = z2;
        Function2 function26 = function23;
        Function2 function27 = function24;
        int i8 = i3;
        int i9 = i4;
        boolean z4 = true;
        int i10 = 65536;
        int i11 = 8192;
        Composer q2 = composer.q(126395868);
        if ((i8 & 6) == 0) {
            i5 = i8 | (q2.W(modifier4) ? 4 : 2);
        } else {
            i5 = i8;
        }
        int i12 = 16;
        if ((i8 & 48) == 0) {
            i5 |= (i8 & 64) == 0 ? q2.W(floatProducer2) : q2.l(floatProducer2) ? 32 : 16;
        }
        int i13 = 128;
        if ((i8 & 384) == 0) {
            i5 |= q2.j(j2) ? 256 : 128;
        } else {
            long j6 = j2;
        }
        int i14 = 1024;
        Object obj2 = "title";
        long j7 = j3;
        if ((i8 & 3072) == 0) {
            i5 |= q2.j(j7) ? 2048 : 1024;
        }
        long j8 = j4;
        if ((i8 & 24576) == 0) {
            i5 |= q2.j(j8) ? 16384 : 8192;
        }
        long j9 = j5;
        if ((i8 & 196608) == 0) {
            i5 |= q2.j(j9) ? 131072 : 65536;
        }
        Function2 function28 = function2;
        if ((i8 & 1572864) == 0) {
            i5 |= q2.l(function28) ? 1048576 : 524288;
        }
        TextStyle textStyle3 = textStyle;
        if ((i8 & 12582912) == 0) {
            i5 |= q2.W(textStyle3) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i5 |= q2.l(function25) ? 67108864 : 33554432;
        }
        TextStyle textStyle4 = textStyle2;
        if ((i8 & 805306368) == 0) {
            i5 |= q2.W(textStyle4) ? 536870912 : 268435456;
        }
        int i15 = i5;
        if ((i9 & 6) == 0) {
            i6 = i9 | (q2.l(function03) ? 4 : 2);
        } else {
            i6 = i9;
        }
        Arrangement.Vertical vertical2 = vertical;
        if ((i9 & 48) == 0) {
            if (q2.W(vertical2)) {
                i12 = 32;
            }
            i6 |= i12;
        }
        if ((i9 & 384) == 0) {
            if (q2.W(horizontal2)) {
                i13 = 256;
            }
            i6 |= i13;
        }
        if ((i9 & 3072) == 0) {
            if (q2.i(i2)) {
                i14 = 2048;
            }
            i6 |= i14;
        } else {
            int i16 = i2;
        }
        if ((i9 & 24576) == 0) {
            if (q2.d(z3)) {
                i11 = 16384;
            }
            i6 |= i11;
        }
        if ((i9 & 196608) == 0) {
            if (q2.l(function26)) {
                i10 = 131072;
            }
            i6 |= i10;
        }
        if ((1572864 & i9) == 0) {
            i6 |= q2.l(function27) ? 1048576 : 524288;
        }
        if ((12582912 & i9) == 0) {
            i6 |= q2.h(f2) ? 8388608 : 4194304;
        } else {
            float f4 = f2;
        }
        int i17 = i6;
        if (q2.E(((i15 & 306783379) == 306783378 && (4793491 & i17) == 4793490) ? false : true, i15 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(126395868, i15, i17, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2994)");
            }
            int i18 = i17 & 896;
            boolean z5 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && q2.W(floatProducer2))) | ((i17 & 112) == 32) | (i18 == 256) | ((i17 & 7168) == 2048) | ((29360128 & i17) == 8388608);
            Object g2 = q2.g();
            if (z5 || g2 == Composer.f14567a.a()) {
                TopAppBarMeasurePolicy topAppBarMeasurePolicy = r2;
                obj = obj2;
                i7 = i17;
                TopAppBarMeasurePolicy topAppBarMeasurePolicy2 = new TopAppBarMeasurePolicy(floatProducer, vertical, horizontal, i2, f2, (DefaultConstructorMarker) null);
                composer2 = q2;
                TopAppBarMeasurePolicy topAppBarMeasurePolicy3 = topAppBarMeasurePolicy;
                composer2.N(topAppBarMeasurePolicy3);
                g2 = topAppBarMeasurePolicy3;
            } else {
                i7 = i17;
                obj = obj2;
                composer2 = q2;
            }
            TopAppBarMeasurePolicy topAppBarMeasurePolicy4 = (TopAppBarMeasurePolicy) g2;
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer2.I();
            Modifier e2 = ComposedModifierKt.e(composer2, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a3);
            } else {
                composer2.K();
            }
            Composer b2 = Updater.b(composer2);
            Updater.g(b2, topAppBarMeasurePolicy4, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            Modifier.Companion companion3 = Modifier.f15489d;
            Modifier b4 = LayoutIdKt.b(companion3, "navigationIcon");
            float f5 = f9191j;
            Modifier m2 = PaddingKt.m(b4, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            Alignment.Companion companion4 = Alignment.f15444a;
            MeasurePolicy g3 = BoxKt.g(companion4.o(), false);
            int a4 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer2.I();
            Modifier e3 = ComposedModifierKt.e(composer2, m2);
            Function0 a5 = companion2.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a5);
            } else {
                composer2.K();
            }
            Composer b5 = Updater.b(composer2);
            Updater.g(b5, g3, companion2.c());
            Updater.g(b5, I2, companion2.e());
            Function2 b6 = companion2.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                b5.N(Integer.valueOf(a4));
                b5.A(Integer.valueOf(a4), b6);
            }
            Updater.g(b5, e3, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            ProvidedValue d2 = ContentColorKt.a().d(Color.h(j2));
            int i19 = ProvidedValue.f14769i;
            CompositionLocalKt.c(d2, function26, composer2, ((i7 >> 12) & 112) | i19);
            composer2.T();
            if (function25 != null) {
                composer2.X(-1360720648);
                Modifier k2 = PaddingKt.k(LayoutIdKt.b(companion3, obj), f5, 0.0f, 2, (Object) null);
                if (z3) {
                    composer2.X(510303260);
                    Object g4 = composer2.g();
                    if (g4 == Composer.f14567a.a()) {
                        g4 = new C0297z();
                        composer2.N(g4);
                    }
                    modifier3 = SemanticsModifierKt.a(companion3, (Function1) g4);
                    composer2.M();
                } else {
                    composer2.X(510305197);
                    composer2.M();
                    modifier3 = companion3;
                }
                Modifier o0 = k2.o0(modifier3);
                if ((i7 & 14) != 4) {
                    z4 = false;
                }
                Object g5 = composer2.g();
                if (z4 || g5 == Composer.f14567a.a()) {
                    function02 = function0;
                    g5 = new C0180m(function02);
                    composer2.N(g5);
                } else {
                    function02 = function0;
                }
                Modifier a6 = GraphicsLayerModifierKt.a(o0, (Function1) g5);
                MeasurePolicy a7 = ColumnKt.a(Arrangement.f3739a.g(), horizontal2, composer2, (i18 >> 3) & 112);
                int a8 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I3 = composer2.I();
                Modifier e4 = ComposedModifierKt.e(composer2, a6);
                Function0 a9 = companion2.a();
                if (composer2.v() == null) {
                    ComposablesKt.d();
                }
                composer2.s();
                if (composer2.n()) {
                    composer2.y(a9);
                } else {
                    composer2.K();
                }
                Composer b7 = Updater.b(composer2);
                Updater.g(b7, a7, companion2.c());
                Updater.g(b7, I3, companion2.e());
                Function2 b8 = companion2.b();
                if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a8))) {
                    b7.N(Integer.valueOf(a8));
                    b7.A(Integer.valueOf(a8), b8);
                }
                Updater.g(b7, e4, companion2.d());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
                int i20 = i15 >> 18;
                int i21 = i15 >> 12;
                ProvideContentColorTextStyleKt.b(j3, textStyle, function2, composer2, ((i15 >> 9) & 14) | (i20 & 112) | (i21 & 896));
                f3 = f5;
                companion = companion3;
                ProvideContentColorTextStyleKt.b(j4, textStyle2, function22, composer2, ((i15 >> 24) & 112) | (i21 & 14) | (i20 & 896));
                composer2.T();
                composer2.M();
                Function0 function04 = function02;
            } else {
                f3 = f5;
                companion = companion3;
                Function0 function05 = function0;
                composer2.X(-1359701523);
                Modifier k3 = PaddingKt.k(LayoutIdKt.b(companion, obj), f3, 0.0f, 2, (Object) null);
                if (z3) {
                    composer2.X(510338172);
                    Object g6 = composer2.g();
                    if (g6 == Composer.f14567a.a()) {
                        g6 = new C0189n();
                        composer2.N(g6);
                    }
                    modifier2 = SemanticsModifierKt.a(companion, (Function1) g6);
                    composer2.M();
                } else {
                    composer2.X(510340109);
                    composer2.M();
                    modifier2 = companion;
                }
                Modifier o02 = k3.o0(modifier2);
                if ((i7 & 14) != 4) {
                    z4 = false;
                }
                Object g7 = composer2.g();
                if (z4 || g7 == Composer.f14567a.a()) {
                    g7 = new C0198o(function05);
                    composer2.N(g7);
                }
                Modifier a10 = GraphicsLayerModifierKt.a(o02, (Function1) g7);
                MeasurePolicy g8 = BoxKt.g(companion4.o(), false);
                int a11 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I4 = composer2.I();
                Modifier e5 = ComposedModifierKt.e(composer2, a10);
                Function0 a12 = companion2.a();
                if (composer2.v() == null) {
                    ComposablesKt.d();
                }
                composer2.s();
                if (composer2.n()) {
                    composer2.y(a12);
                } else {
                    composer2.K();
                }
                Composer b9 = Updater.b(composer2);
                Updater.g(b9, g8, companion2.c());
                Updater.g(b9, I4, companion2.e());
                Function2 b10 = companion2.b();
                if (b9.n() || !Intrinsics.d(b9.g(), Integer.valueOf(a11))) {
                    b9.N(Integer.valueOf(a11));
                    b9.A(Integer.valueOf(a11), b10);
                }
                Updater.g(b9, e5, companion2.d());
                ProvideContentColorTextStyleKt.b(j3, textStyle, function2, composer2, ((i15 >> 9) & 14) | ((i15 >> 18) & 112) | ((i15 >> 12) & 896));
                composer2.T();
                composer2.M();
            }
            Modifier m3 = PaddingKt.m(LayoutIdKt.b(companion, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11, (Object) null);
            MeasurePolicy g9 = BoxKt.g(companion4.o(), false);
            int a13 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I5 = composer2.I();
            Modifier e6 = ComposedModifierKt.e(composer2, m3);
            Function0 a14 = companion2.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a14);
            } else {
                composer2.K();
            }
            Composer b11 = Updater.b(composer2);
            Updater.g(b11, g9, companion2.c());
            Updater.g(b11, I5, companion2.e());
            Function2 b12 = companion2.b();
            if (b11.n() || !Intrinsics.d(b11.g(), Integer.valueOf(a13))) {
                b11.N(Integer.valueOf(a13));
                b11.A(Integer.valueOf(a13), b12);
            }
            Updater.g(b11, e6, companion2.d());
            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(j5)), function24, composer2, ((i7 >> 15) & 112) | i19);
            composer2.T();
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            Function0 function06 = function0;
            composer2 = q2;
            Function2 function29 = function27;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            C0207p pVar = r0;
            C0207p pVar2 = new C0207p(modifier, floatProducer, j2, j3, j4, j5, function2, textStyle, function22, textStyle2, function0, vertical, horizontal, i2, z2, function23, function24, f2, i3, i4);
            x2.a(pVar);
        }
    }

    public static final Unit y(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public static final Unit z(Function0 function0, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(((Number) function0.invoke()).floatValue());
        return Unit.f40552a;
    }
}
