package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class SnackbarHostKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11167a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SnackbarDuration[] r0 = androidx.compose.material3.SnackbarDuration.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SnackbarDuration r1 = androidx.compose.material3.SnackbarDuration.Indefinite     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SnackbarDuration r1 = androidx.compose.material3.SnackbarDuration.Long     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SnackbarDuration r1 = androidx.compose.material3.SnackbarDuration.Short     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f11167a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.material3.SnackbarData r16, androidx.compose.ui.Modifier r17, kotlin.jvm.functions.Function3 r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r1 = r16
            r3 = r18
            r4 = r20
            r0 = 2
            r2 = 4
            r5 = 6
            r6 = -977568115(0xffffffffc5bb7e8d, float:-5999.819)
            r7 = r19
            androidx.compose.runtime.Composer r7 = r7.q(r6)
            r8 = 1
            r9 = r21 & 1
            if (r9 == 0) goto L_0x001a
            r9 = r4 | 6
            goto L_0x002a
        L_0x001a:
            r9 = r4 & 6
            if (r9 != 0) goto L_0x0029
            boolean r9 = r7.W(r1)
            if (r9 == 0) goto L_0x0026
            r9 = r2
            goto L_0x0027
        L_0x0026:
            r9 = r0
        L_0x0027:
            r9 = r9 | r4
            goto L_0x002a
        L_0x0029:
            r9 = r4
        L_0x002a:
            r0 = r21 & 2
            if (r0 == 0) goto L_0x0033
            r9 = r9 | 48
        L_0x0030:
            r10 = r17
            goto L_0x0045
        L_0x0033:
            r10 = r4 & 48
            if (r10 != 0) goto L_0x0030
            r10 = r17
            boolean r11 = r7.W(r10)
            if (r11 == 0) goto L_0x0042
            r11 = 32
            goto L_0x0044
        L_0x0042:
            r11 = 16
        L_0x0044:
            r9 = r9 | r11
        L_0x0045:
            r2 = r21 & 4
            if (r2 == 0) goto L_0x004c
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x004c:
            r2 = r4 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005c
            boolean r2 = r7.l(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r9 = r9 | r2
        L_0x005c:
            r2 = r9 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            r12 = 0
            if (r2 == r11) goto L_0x0065
            r2 = r8
            goto L_0x0066
        L_0x0065:
            r2 = r12
        L_0x0066:
            r11 = r9 & 1
            boolean r2 = r7.E(r2, r11)
            if (r2 == 0) goto L_0x020a
            if (r0 == 0) goto L_0x0073
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r10 = r0
        L_0x0073:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x007f
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)"
            androidx.compose.runtime.ComposerKt.Y(r6, r9, r0, r2)
        L_0x007f:
            androidx.compose.material3.internal.Strings$Companion r0 = androidx.compose.material3.internal.Strings.f12320b
            int r0 = androidx.compose.material3.R.string.O
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            java.lang.String r0 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r7, r12)
            java.lang.Object r2 = r7.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r2 != r6) goto L_0x009f
            androidx.compose.material3.FadeInFadeOutState r2 = new androidx.compose.material3.FadeInFadeOutState
            r2.<init>()
            r7.N(r2)
        L_0x009f:
            androidx.compose.material3.FadeInFadeOutState r2 = (androidx.compose.material3.FadeInFadeOutState) r2
            java.lang.Object r6 = r2.a()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r1, r6)
            r9 = 54
            if (r6 != 0) goto L_0x012e
            r6 = 1154891761(0x44d63ff1, float:1713.9982)
            r7.X(r6)
            r2.d(r1)
            java.util.List r6 = r2.b()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r13 = r6.size()
            r11.<init>(r13)
            r13 = r6
            java.util.Collection r13 = (java.util.Collection) r13
            int r13 = r13.size()
            r14 = r12
        L_0x00cb:
            if (r14 >= r13) goto L_0x00de
            java.lang.Object r15 = r6.get(r14)
            androidx.compose.material3.FadeInFadeOutAnimationItem r15 = (androidx.compose.material3.FadeInFadeOutAnimationItem) r15
            java.lang.Object r15 = r15.c()
            androidx.compose.material3.SnackbarData r15 = (androidx.compose.material3.SnackbarData) r15
            r11.add(r15)
            int r14 = r14 + r8
            goto L_0x00cb
        L_0x00de:
            java.util.List r6 = kotlin.collections.CollectionsKt.P0(r11)
            boolean r11 = r6.contains(r1)
            if (r11 != 0) goto L_0x00eb
            r6.add(r1)
        L_0x00eb:
            java.util.List r11 = r2.b()
            r11.clear()
            java.util.List r6 = androidx.compose.ui.util.ListUtilsKt.b(r6)
            java.util.List r11 = r2.b()
            java.util.Collection r11 = (java.util.Collection) r11
            r13 = r6
            java.util.Collection r13 = (java.util.Collection) r13
            int r13 = r13.size()
            r14 = r12
        L_0x0104:
            if (r14 >= r13) goto L_0x0128
            java.lang.Object r15 = r6.get(r14)
            androidx.compose.material3.SnackbarData r15 = (androidx.compose.material3.SnackbarData) r15
            androidx.compose.material3.FadeInFadeOutAnimationItem r5 = new androidx.compose.material3.FadeInFadeOutAnimationItem
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r12 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r12.<init>(r15, r1, r2, r0)
            r17 = r0
            r0 = -1952400805(0xffffffff8ba0ba5b, float:-6.1910155E-32)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r8, r12, r7, r9)
            r5.<init>(r15, r0)
            r11.add(r5)
            int r14 = r14 + r8
            r0 = r17
            r5 = 6
            r12 = 0
            goto L_0x0104
        L_0x0128:
            java.util.List r11 = (java.util.List) r11
            r7.M()
            goto L_0x0137
        L_0x012e:
            r0 = 1443908949(0x56104d55, float:3.9665453E13)
            r7.X(r0)
            r7.M()
        L_0x0137:
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r0.o()
            r5 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r0, r5)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r7, r5)
            androidx.compose.runtime.CompositionLocalMap r5 = r7.I()
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.ComposedModifierKt.e(r7, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r13 = r12.a()
            androidx.compose.runtime.Applier r14 = r7.v()
            if (r14 != 0) goto L_0x015d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x015d:
            r7.s()
            boolean r14 = r7.n()
            if (r14 == 0) goto L_0x016a
            r7.y(r13)
            goto L_0x016d
        L_0x016a:
            r7.K()
        L_0x016d:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r7)
            kotlin.jvm.functions.Function2 r14 = r12.c()
            androidx.compose.runtime.Updater.g(r13, r0, r14)
            kotlin.jvm.functions.Function2 r0 = r12.e()
            androidx.compose.runtime.Updater.g(r13, r5, r0)
            kotlin.jvm.functions.Function2 r0 = r12.b()
            boolean r5 = r13.n()
            if (r5 != 0) goto L_0x0197
            java.lang.Object r5 = r13.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r14)
            if (r5 != 0) goto L_0x01a5
        L_0x0197:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r13.N(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r13.A(r5, r0)
        L_0x01a5:
            kotlin.jvm.functions.Function2 r0 = r12.d()
            androidx.compose.runtime.Updater.g(r13, r11, r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r0 = 0
            androidx.compose.runtime.RecomposeScope r5 = androidx.compose.runtime.ComposablesKt.c(r7, r0)
            r2.e(r5)
            r5 = -1888182177(0xffffffff8f74a05f, float:-1.2061015E-29)
            r7.X(r5)
            java.util.List r2 = r2.b()
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r12 = r0
        L_0x01c8:
            if (r12 >= r5) goto L_0x01f9
            java.lang.Object r0 = r2.get(r12)
            androidx.compose.material3.FadeInFadeOutAnimationItem r0 = (androidx.compose.material3.FadeInFadeOutAnimationItem) r0
            java.lang.Object r6 = r0.a()
            androidx.compose.material3.SnackbarData r6 = (androidx.compose.material3.SnackbarData) r6
            kotlin.jvm.functions.Function3 r0 = r0.b()
            r11 = 1325010085(0x4efa0ca5, float:2.09756634E9)
            r7.r(r11, r6)
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r11 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r11.<init>(r3, r6)
            r6 = -1893791890(0xffffffff8f1f076e, float:-7.840736E-30)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r8, r11, r7, r9)
            r11 = 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r0.d(r6, r7, r13)
            r7.Q()
            int r12 = r12 + r8
            goto L_0x01c8
        L_0x01f9:
            r7.M()
            r7.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0208
            androidx.compose.runtime.ComposerKt.X()
        L_0x0208:
            r2 = r10
            goto L_0x020e
        L_0x020a:
            r7.B()
            goto L_0x0208
        L_0x020e:
            androidx.compose.runtime.ScopeUpdateScope r6 = r7.x()
            if (r6 == 0) goto L_0x0225
            androidx.compose.material3.x6 r7 = new androidx.compose.material3.x6
            r0 = r7
            r1 = r16
            r3 = r18
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.d(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit e(SnackbarData snackbarData, Modifier modifier, Function3 function3, int i2, int i3, Composer composer, int i4) {
        d(snackbarData, modifier, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void f(SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1077081618);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(snackbarHostState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function3) ? 256 : 128;
        }
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (i6 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.f9585a.a();
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1077081618, i4, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:220)");
            }
            SnackbarData b2 = snackbarHostState.b();
            AccessibilityManager accessibilityManager = (AccessibilityManager) q2.C(CompositionLocalsKt.c());
            boolean W = q2.W(b2) | q2.l(accessibilityManager);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new SnackbarHostKt$SnackbarHost$1$1(b2, accessibilityManager, (Continuation) null);
                q2.N(g2);
            }
            EffectsKt.g(b2, (Function2) g2, q2, 0);
            d(snackbarHostState.b(), modifier, function3, q2, i4 & 1008, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        Function3 function32 = function3;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0268v6(snackbarHostState, modifier2, function32, i2, i3));
        }
    }

    public static final Unit g(SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, int i2, int i3, Composer composer, int i4) {
        f(snackbarHostState, modifier, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final State j(AnimationSpec animationSpec, boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new C0277w6();
                composer.N(g2);
            }
            function0 = (Function0) g2;
        }
        Function0 function02 = function0;
        if (ComposerKt.P()) {
            ComposerKt.Y(1431889134, i2, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:405)");
        }
        Object g3 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g3 == companion.a()) {
            g3 = AnimatableKt.b(!z2 ? 1.0f : 0.0f, 0.0f, 2, (Object) null);
            composer.N(g3);
        }
        Animatable animatable = (Animatable) g3;
        Boolean valueOf = Boolean.valueOf(z2);
        boolean z3 = false;
        boolean l2 = composer.l(animatable) | ((((i2 & 112) ^ 48) > 32 && composer.d(z2)) || (i2 & 48) == 32) | composer.l(animationSpec);
        if ((((i2 & 896) ^ 384) > 256 && composer.W(function02)) || (i2 & 384) == 256) {
            z3 = true;
        }
        boolean z4 = l2 | z3;
        Object g4 = composer.g();
        if (z4 || g4 == companion.a()) {
            SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, z2, animationSpec, function02, (Continuation) null);
            composer.N(snackbarHostKt$animatedOpacity$2$1);
            g4 = snackbarHostKt$animatedOpacity$2$1;
        }
        EffectsKt.g(valueOf, (Function2) g4, composer, (i2 >> 3) & 14);
        State g5 = animatable.g();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g5;
    }

    public static final Unit k() {
        return Unit.f40552a;
    }

    public static final State l(AnimationSpec animationSpec, boolean z2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1966809761, i2, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:415)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = AnimatableKt.b(!z2 ? 1.0f : 0.8f, 0.0f, 2, (Object) null);
            composer.N(g2);
        }
        Animatable animatable = (Animatable) g2;
        Boolean valueOf = Boolean.valueOf(z2);
        boolean l2 = composer.l(animatable) | ((((i2 & 112) ^ 48) > 32 && composer.d(z2)) || (i2 & 48) == 32) | composer.l(animationSpec);
        Object g3 = composer.g();
        if (l2 || g3 == companion.a()) {
            g3 = new SnackbarHostKt$animatedScale$1$1(animatable, z2, animationSpec, (Continuation) null);
            composer.N(g3);
        }
        EffectsKt.g(valueOf, (Function2) g3, composer, (i2 >> 3) & 14);
        State g4 = animatable.g();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g4;
    }

    public static final long m(SnackbarDuration snackbarDuration, boolean z2, AccessibilityManager accessibilityManager) {
        long j2;
        int i2 = WhenMappings.f11167a[snackbarDuration.ordinal()];
        if (i2 == 1) {
            j2 = Long.MAX_VALUE;
        } else if (i2 == 2) {
            j2 = 10000;
        } else if (i2 == 3) {
            j2 = 4000;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long j3 = j2;
        return accessibilityManager == null ? j3 : accessibilityManager.a(j3, true, true, z2);
    }
}
