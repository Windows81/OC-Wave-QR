package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class BackdropScaffoldKt$BackdropScaffold$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7208A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f7209B;
    public final /* synthetic */ float C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ BackdropScaffoldState F;
    public final /* synthetic */ AnchoredDraggableState G;
    public final /* synthetic */ Shape H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ float K;
    public final /* synthetic */ float L;
    public final /* synthetic */ float M;
    public final /* synthetic */ float N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ long P;
    public final /* synthetic */ Function3 Q;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f7210z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$2(Modifier modifier, Function2 function2, Function1 function1, float f2, boolean z2, boolean z3, BackdropScaffoldState backdropScaffoldState, AnchoredDraggableState anchoredDraggableState, Shape shape, long j2, long j3, float f3, float f4, float f5, float f6, Function2 function22, long j4, Function3 function3) {
        super(2);
        this.f7210z = modifier;
        this.f7208A = function2;
        this.f7209B = function1;
        this.C = f2;
        this.D = z2;
        this.E = z3;
        this.F = backdropScaffoldState;
        this.G = anchoredDraggableState;
        this.H = shape;
        this.I = j2;
        this.J = j3;
        this.K = f3;
        this.L = f4;
        this.M = f5;
        this.N = f6;
        this.O = function22;
        this.P = j4;
        this.Q = function3;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1961515015, i3, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:395)");
            }
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer2);
                composer2.N(g2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) g2;
            Modifier f2 = SizeKt.f(this.f7210z, 0.0f, 1, (Object) null);
            Function2 function2 = this.f7208A;
            Function1 function1 = this.f7209B;
            final float f3 = this.C;
            final boolean z2 = this.D;
            final boolean z3 = this.E;
            final BackdropScaffoldState backdropScaffoldState = this.F;
            final AnchoredDraggableState anchoredDraggableState = this.G;
            final Shape shape = this.H;
            Function1 function12 = function1;
            AnonymousClass1 r3 = r6;
            final long j2 = this.I;
            final long j3 = this.J;
            final float f4 = this.K;
            final float f5 = this.L;
            final float f6 = this.M;
            final float f7 = this.N;
            final Function2 function22 = this.O;
            final long j4 = this.P;
            final Function3 function3 = this.Q;
            AnonymousClass1 r6 = new Function4<Constraints, Float, Composer, Integer, Unit>() {
                public final void b(long j2, float f2, Composer composer, int i2) {
                    int i3;
                    float f3 = f2;
                    Composer composer2 = composer;
                    long j3 = j2;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer2.j(j3) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer2.h(f3) ? 32 : 16;
                    }
                    if (composer2.E((i3 & 147) != 146, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(516504859, i3, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:399)");
                        }
                        final Ref.FloatRef floatRef = new Ref.FloatRef();
                        float k2 = ((float) Constraints.k(j2)) - f3;
                        floatRef.f40905z = k2;
                        if (z2) {
                            floatRef.f40905z = Math.min(k2, f3);
                        }
                        Modifier b2 = z3 ? NestedScrollModifierKt.b(Modifier.f15489d, backdropScaffoldState.e(), (NestedScrollDispatcher) null, 2, (Object) null) : Modifier.f15489d;
                        AnchoredDraggableState anchoredDraggableState = anchoredDraggableState;
                        Orientation orientation = Orientation.Vertical;
                        final float f4 = f6;
                        final BackdropScaffoldState backdropScaffoldState = backdropScaffoldState;
                        Modifier e2 = AnchoredDraggableKt.e(AnchoredDraggableKt.h(b2, anchoredDraggableState, orientation, new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue>>() {

                            @Metadata
                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {

                                /* renamed from: a  reason: collision with root package name */
                                public static final /* synthetic */ int[] f7217a;

                                /* JADX WARNING: Failed to process nested try/catch */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                                static {
                                    /*
                                        androidx.compose.material.BackdropValue[] r0 = androidx.compose.material.BackdropValue.values()
                                        int r0 = r0.length
                                        int[] r0 = new int[r0]
                                        androidx.compose.material.BackdropValue r1 = androidx.compose.material.BackdropValue.Concealed     // Catch:{ NoSuchFieldError -> 0x0010 }
                                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                                        r2 = 1
                                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                                    L_0x0010:
                                        androidx.compose.material.BackdropValue r1 = androidx.compose.material.BackdropValue.Revealed     // Catch:{ NoSuchFieldError -> 0x0019 }
                                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                                        r2 = 2
                                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                                    L_0x0019:
                                        f7217a = r0
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.AnonymousClass1.WhenMappings.<clinit>():void");
                                }
                            }

                            public final Pair b(long j2, long j3) {
                                BackdropValue backdropValue;
                                float f2 = f4;
                                DraggableAnchors a2 = AnchoredDraggableKt.a(new BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1((float) IntSize.f(j2), f2, ((float) IntSize.f(j2)) - f2, floatRef));
                                int i2 = WhenMappings.f7217a[backdropScaffoldState.g().ordinal()];
                                if (i2 == 1) {
                                    backdropValue = BackdropValue.Concealed;
                                } else if (i2 == 2) {
                                    backdropValue = BackdropValue.Revealed;
                                    if (!a2.f(backdropValue)) {
                                        backdropValue = BackdropValue.Concealed;
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return TuplesKt.a(a2, backdropValue);
                            }

                            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                                return b(((IntSize) obj).j(), ((Constraints) obj2).r());
                            }
                        }), anchoredDraggableState, orientation, z3, false, (MutableInteractionSource) null, false, 56, (Object) null);
                        boolean W = composer2.W(backdropScaffoldState) | composer2.l(coroutineScope);
                        BackdropScaffoldState backdropScaffoldState2 = backdropScaffoldState;
                        CoroutineScope coroutineScope = coroutineScope;
                        Object g2 = composer.g();
                        if (W || g2 == Composer.f14567a.a()) {
                            g2 = new BackdropScaffoldKt$BackdropScaffold$2$1$2$1(backdropScaffoldState2, coroutineScope);
                            composer2.N(g2);
                        }
                        Modifier d2 = SemanticsModifierKt.d(e2, false, (Function1) g2, 1, (Object) null);
                        Shape shape = shape;
                        long j4 = j2;
                        long j5 = j3;
                        float f5 = f4;
                        final float f6 = f7;
                        final Function2 function2 = function22;
                        final long j6 = j4;
                        final boolean z2 = z3;
                        final BackdropScaffoldState backdropScaffoldState3 = backdropScaffoldState;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        Ref.FloatRef floatRef2 = floatRef;
                        SurfaceKt.a(d2, shape, j4, j5, (BorderStroke) null, f5, ComposableLambdaKt.e(1946125143, true, new Function2<Composer, Integer, Unit>() {
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.jvm.functions.Function0} */
                            /* JADX WARNING: Multi-variable type inference failed */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void b(androidx.compose.runtime.Composer r18, int r19) {
                                /*
                                    r17 = this;
                                    r0 = r17
                                    r7 = r18
                                    r1 = r19
                                    r2 = r1 & 3
                                    r3 = 2
                                    r4 = 1
                                    r5 = 0
                                    if (r2 == r3) goto L_0x000f
                                    r2 = r4
                                    goto L_0x0010
                                L_0x000f:
                                    r2 = r5
                                L_0x0010:
                                    r3 = r1 & 1
                                    boolean r2 = r7.E(r2, r3)
                                    if (r2 == 0) goto L_0x0101
                                    boolean r2 = androidx.compose.runtime.ComposerKt.P()
                                    if (r2 == 0) goto L_0x0027
                                    r2 = -1
                                    java.lang.String r3 = "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:460)"
                                    r6 = 1946125143(0x73ff8357, float:4.0487658E31)
                                    androidx.compose.runtime.ComposerKt.Y(r6, r1, r2, r3)
                                L_0x0027:
                                    androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
                                    float r12 = r17
                                    r13 = 7
                                    r14 = 0
                                    r9 = 0
                                    r10 = 0
                                    r11 = 0
                                    androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r8, r9, r10, r11, r12, r13, r14)
                                    kotlin.jvm.functions.Function2 r2 = r18
                                    long r8 = r19
                                    boolean r3 = r21
                                    androidx.compose.material.BackdropScaffoldState r6 = r22
                                    kotlinx.coroutines.CoroutineScope r10 = r23
                                    androidx.compose.ui.Alignment$Companion r11 = androidx.compose.ui.Alignment.f15444a
                                    androidx.compose.ui.Alignment r11 = r11.o()
                                    androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.g(r11, r5)
                                    int r12 = androidx.compose.runtime.ComposablesKt.a(r7, r5)
                                    androidx.compose.runtime.CompositionLocalMap r13 = r18.I()
                                    androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r7, r1)
                                    androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.f17222h
                                    kotlin.jvm.functions.Function0 r15 = r14.a()
                                    androidx.compose.runtime.Applier r16 = r18.v()
                                    if (r16 != 0) goto L_0x0063
                                    androidx.compose.runtime.ComposablesKt.d()
                                L_0x0063:
                                    r18.s()
                                    boolean r16 = r18.n()
                                    if (r16 == 0) goto L_0x0070
                                    r7.y(r15)
                                    goto L_0x0073
                                L_0x0070:
                                    r18.K()
                                L_0x0073:
                                    androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r18)
                                    kotlin.jvm.functions.Function2 r4 = r14.c()
                                    androidx.compose.runtime.Updater.g(r15, r11, r4)
                                    kotlin.jvm.functions.Function2 r4 = r14.e()
                                    androidx.compose.runtime.Updater.g(r15, r13, r4)
                                    kotlin.jvm.functions.Function2 r4 = r14.b()
                                    boolean r11 = r15.n()
                                    if (r11 != 0) goto L_0x009d
                                    java.lang.Object r11 = r15.g()
                                    java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
                                    boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r13)
                                    if (r11 != 0) goto L_0x00ab
                                L_0x009d:
                                    java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                                    r15.N(r11)
                                    java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                                    r15.A(r11, r4)
                                L_0x00ab:
                                    kotlin.jvm.functions.Function2 r4 = r14.d()
                                    androidx.compose.runtime.Updater.g(r15, r1, r4)
                                    androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
                                    java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                                    r2.m(r7, r1)
                                    boolean r1 = r7.d(r3)
                                    boolean r2 = r7.W(r6)
                                    r1 = r1 | r2
                                    boolean r2 = r7.l(r10)
                                    r1 = r1 | r2
                                    java.lang.Object r2 = r18.g()
                                    if (r1 != 0) goto L_0x00d7
                                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
                                    java.lang.Object r1 = r1.a()
                                    if (r2 != r1) goto L_0x00df
                                L_0x00d7:
                                    androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1 r2 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1
                                    r2.<init>(r3, r6, r10)
                                    r7.N(r2)
                                L_0x00df:
                                    r3 = r2
                                    kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                                    androidx.compose.material.BackdropValue r1 = r6.g()
                                    androidx.compose.material.BackdropValue r2 = androidx.compose.material.BackdropValue.Revealed
                                    if (r1 != r2) goto L_0x00ec
                                    r4 = 1
                                    goto L_0x00ed
                                L_0x00ec:
                                    r4 = r5
                                L_0x00ed:
                                    r6 = 0
                                    r1 = r8
                                    r5 = r18
                                    androidx.compose.material.BackdropScaffoldKt.g(r1, r3, r4, r5, r6)
                                    r18.T()
                                    boolean r1 = androidx.compose.runtime.ComposerKt.P()
                                    if (r1 == 0) goto L_0x0104
                                    androidx.compose.runtime.ComposerKt.X()
                                    goto L_0x0104
                                L_0x0101:
                                    r18.B()
                                L_0x0104:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.AnonymousClass3.b(androidx.compose.runtime.Composer, int):void");
                            }

                            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                                b((Composer) obj, ((Number) obj2).intValue());
                                return Unit.f40552a;
                            }
                        }, composer2, 54), composer, 1572864, 16);
                        Modifier m2 = PaddingKt.m(Modifier.f15489d, 0.0f, 0.0f, 0.0f, (!backdropScaffoldState.i() || floatRef2.f40905z != ((float) Constraints.k(j2)) - f3) ? Dp.m((float) 0) : f5, 7, (Object) null);
                        Alignment b3 = Alignment.f15444a.b();
                        Function3 function3 = function3;
                        BackdropScaffoldState backdropScaffoldState4 = backdropScaffoldState;
                        MeasurePolicy g3 = BoxKt.g(b3, false);
                        int a2 = ComposablesKt.a(composer2, 0);
                        CompositionLocalMap I2 = composer.I();
                        Modifier e3 = ComposedModifierKt.e(composer2, m2);
                        ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
                        Function0 a3 = companion.a();
                        if (composer.v() == null) {
                            ComposablesKt.d();
                        }
                        composer.s();
                        if (composer.n()) {
                            composer2.y(a3);
                        } else {
                            composer.K();
                        }
                        Composer b4 = Updater.b(composer);
                        Updater.g(b4, g3, companion.c());
                        Updater.g(b4, I2, companion.e());
                        Function2 b5 = companion.b();
                        if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                            b4.N(Integer.valueOf(a2));
                            b4.A(Integer.valueOf(a2), b5);
                        }
                        Updater.g(b4, e3, companion.d());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                        function3.d(backdropScaffoldState4.f(), composer2, 0);
                        composer.T();
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    b(((Constraints) obj).r(), ((Number) obj2).floatValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return Unit.f40552a;
                }
            };
            BackdropScaffoldKt.e(f2, function2, function12, ComposableLambdaKt.e(516504859, true, r3, composer, 54), composer, 3120);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        Composer composer3 = composer2;
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
