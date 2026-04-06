package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class SnackbarHostKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8450a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.SnackbarDuration[] r0 = androidx.compose.material.SnackbarDuration.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Indefinite     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Long     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Short     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f8450a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.material.SnackbarData r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function3 r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r6 = r21
            r7 = r23
            r8 = r25
            r0 = 2
            r1 = 4
            r9 = 6
            r2 = 2036134589(0x795cf2bd, float:7.170179E34)
            r3 = r24
            androidx.compose.runtime.Composer r10 = r3.q(r2)
            r11 = 1
            r3 = r26 & 1
            if (r3 == 0) goto L_0x001a
            r3 = r8 | 6
            goto L_0x0033
        L_0x001a:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0032
            r3 = r8 & 8
            if (r3 != 0) goto L_0x0027
            boolean r3 = r10.W(r6)
            goto L_0x002b
        L_0x0027:
            boolean r3 = r10.l(r6)
        L_0x002b:
            if (r3 == 0) goto L_0x002f
            r3 = r1
            goto L_0x0030
        L_0x002f:
            r3 = r0
        L_0x0030:
            r3 = r3 | r8
            goto L_0x0033
        L_0x0032:
            r3 = r8
        L_0x0033:
            r0 = r26 & 2
            if (r0 == 0) goto L_0x003c
            r3 = r3 | 48
        L_0x0039:
            r4 = r22
            goto L_0x004e
        L_0x003c:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x0039
            r4 = r22
            boolean r5 = r10.W(r4)
            if (r5 == 0) goto L_0x004b
            r5 = 32
            goto L_0x004d
        L_0x004b:
            r5 = 16
        L_0x004d:
            r3 = r3 | r5
        L_0x004e:
            r1 = r26 & 4
            if (r1 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r1 = r8 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0065
            boolean r1 = r10.l(r7)
            if (r1 == 0) goto L_0x0062
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r1
        L_0x0065:
            r1 = r3 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r1 == r5) goto L_0x006d
            r1 = r11
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            r5 = r3 & 1
            boolean r1 = r10.E(r1, r5)
            if (r1 == 0) goto L_0x022d
            if (r0 == 0) goto L_0x007c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r13 = r0
            goto L_0x007d
        L_0x007c:
            r13 = r4
        L_0x007d:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0089
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)"
            androidx.compose.runtime.ComposerKt.Y(r2, r3, r0, r1)
        L_0x0089:
            java.lang.Object r0 = r10.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x009d
            androidx.compose.material.FadeInFadeOutState r0 = new androidx.compose.material.FadeInFadeOutState
            r0.<init>()
            r10.N(r0)
        L_0x009d:
            r14 = r0
            androidx.compose.material.FadeInFadeOutState r14 = (androidx.compose.material.FadeInFadeOutState) r14
            androidx.compose.material.Strings$Companion r0 = androidx.compose.material.Strings.f8507b
            int r0 = r0.h()
            java.lang.String r15 = androidx.compose.material.Strings_androidKt.a(r0, r10, r9)
            java.lang.Object r0 = r14.a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r6, r0)
            r5 = 54
            if (r0 != 0) goto L_0x0152
            r0 = 1522020731(0x5ab8317b, float:2.59229E16)
            r10.X(r0)
            r14.d(r6)
            java.util.List r0 = r14.b()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            int r2 = r0.size()
            r3 = 0
        L_0x00d1:
            if (r3 >= r2) goto L_0x00e4
            java.lang.Object r4 = r0.get(r3)
            androidx.compose.material.FadeInFadeOutAnimationItem r4 = (androidx.compose.material.FadeInFadeOutAnimationItem) r4
            java.lang.Object r4 = r4.c()
            androidx.compose.material.SnackbarData r4 = (androidx.compose.material.SnackbarData) r4
            r1.add(r4)
            int r3 = r3 + r11
            goto L_0x00d1
        L_0x00e4:
            java.util.List r4 = kotlin.collections.CollectionsKt.P0(r1)
            boolean r0 = r4.contains(r6)
            if (r0 != 0) goto L_0x00f1
            r4.add(r6)
        L_0x00f1:
            java.util.List r0 = r14.b()
            r0.clear()
            java.util.List r3 = androidx.compose.ui.util.ListUtilsKt.b(r4)
            java.util.List r0 = r14.b()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r1 = r3.size()
            r0 = 0
        L_0x0108:
            if (r0 >= r1) goto L_0x0149
            java.lang.Object r16 = r3.get(r0)
            r9 = r16
            androidx.compose.material.SnackbarData r9 = (androidx.compose.material.SnackbarData) r9
            androidx.compose.material.FadeInFadeOutAnimationItem r12 = new androidx.compose.material.FadeInFadeOutAnimationItem
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r11 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r17 = r0
            r0 = r11
            r18 = r1
            r1 = r9
            r6 = r2
            r2 = r21
            r19 = r3
            r3 = r4
            r20 = r4
            r4 = r14
            r8 = r5
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1471040642(0x57ae4c82, float:3.83287244E14)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r11, r10, r8)
            r12.<init>(r9, r0)
            r6.add(r12)
            int r0 = r17 + 1
            r11 = r1
            r2 = r6
            r5 = r8
            r1 = r18
            r3 = r19
            r4 = r20
            r9 = 6
            r6 = r21
            r8 = r25
            goto L_0x0108
        L_0x0149:
            r6 = r2
            r8 = r5
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            r10.M()
            goto L_0x015c
        L_0x0152:
            r8 = r5
            r0 = 1524617353(0x5adfd089, float:3.14991033E16)
            r10.X(r0)
            r10.M()
        L_0x015c:
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r0.o()
            r1 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r0, r1)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r10, r1)
            androidx.compose.runtime.CompositionLocalMap r1 = r10.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r10, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r10.v()
            if (r6 != 0) goto L_0x0182
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0182:
            r10.s()
            boolean r6 = r10.n()
            if (r6 == 0) goto L_0x018f
            r10.y(r5)
            goto L_0x0192
        L_0x018f:
            r10.K()
        L_0x0192:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r0, r6)
            kotlin.jvm.functions.Function2 r0 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r1, r0)
            kotlin.jvm.functions.Function2 r0 = r4.b()
            boolean r1 = r5.n()
            if (r1 != 0) goto L_0x01bc
            java.lang.Object r1 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r6)
            if (r1 != 0) goto L_0x01ca
        L_0x01bc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5.N(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5.A(r1, r0)
        L_0x01ca:
            kotlin.jvm.functions.Function2 r0 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r3, r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r0 = 0
            androidx.compose.runtime.RecomposeScope r1 = androidx.compose.runtime.ComposablesKt.c(r10, r0)
            r14.e(r1)
            r1 = 1801449988(0x6b5ff204, float:2.7073334E26)
            r10.X(r1)
            java.util.List r1 = r14.b()
            int r2 = r1.size()
            r12 = r0
        L_0x01ea:
            if (r12 >= r2) goto L_0x021c
            java.lang.Object r0 = r1.get(r12)
            androidx.compose.material.FadeInFadeOutAnimationItem r0 = (androidx.compose.material.FadeInFadeOutAnimationItem) r0
            java.lang.Object r3 = r0.a()
            androidx.compose.material.SnackbarData r3 = (androidx.compose.material.SnackbarData) r3
            kotlin.jvm.functions.Function3 r0 = r0.b()
            r4 = 2123994112(0x7e999400, float:1.0207017E38)
            r10.r(r4, r3)
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r4 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r4.<init>(r7, r3)
            r3 = 2041982076(0x79b62c7c, float:1.1823753E35)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r5, r4, r10, r8)
            r4 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r0.d(r3, r10, r6)
            r10.Q()
            int r12 = r12 + r5
            goto L_0x01ea
        L_0x021c:
            r10.M()
            r10.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x022b
            androidx.compose.runtime.ComposerKt.X()
        L_0x022b:
            r2 = r13
            goto L_0x0231
        L_0x022d:
            r10.B()
            r2 = r4
        L_0x0231:
            androidx.compose.runtime.ScopeUpdateScope r6 = r10.x()
            if (r6 == 0) goto L_0x0248
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3 r8 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
            r0 = r8
            r1 = r21
            r3 = r23
            r4 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x0248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.a(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(431012348);
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
                function3 = ComposableSingletons$SnackbarHostKt.f7553a.a();
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(431012348, i4, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            SnackbarData b2 = snackbarHostState.b();
            AccessibilityManager accessibilityManager = (AccessibilityManager) q2.C(CompositionLocalsKt.c());
            boolean l2 = q2.l(b2) | q2.l(accessibilityManager);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new SnackbarHostKt$SnackbarHost$1$1(b2, accessibilityManager, (Continuation) null);
                q2.N(g2);
            }
            EffectsKt.g(b2, (Function2) g2, q2, 0);
            a(snackbarHostState.b(), modifier, function3, q2, i4 & 1008, 0);
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
            x2.a(new SnackbarHostKt$SnackbarHost$2(snackbarHostState, modifier2, function32, i2, i3));
        }
    }

    public static final State f(AnimationSpec animationSpec, boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            function0 = SnackbarHostKt$animatedOpacity$1.f8451z;
        }
        Function0 function02 = function0;
        if (ComposerKt.P()) {
            ComposerKt.Y(1016418159, i2, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = AnimatableKt.b(!z2 ? 1.0f : 0.0f, 0.0f, 2, (Object) null);
            composer.N(g2);
        }
        Animatable animatable = (Animatable) g2;
        Boolean valueOf = Boolean.valueOf(z2);
        boolean z3 = false;
        boolean l2 = composer.l(animatable) | ((((i2 & 112) ^ 48) > 32 && composer.d(z2)) || (i2 & 48) == 32) | composer.l(animationSpec);
        if ((((i2 & 896) ^ 384) > 256 && composer.W(function02)) || (i2 & 384) == 256) {
            z3 = true;
        }
        boolean z4 = l2 | z3;
        Object g3 = composer.g();
        if (z4 || g3 == companion.a()) {
            SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, z2, animationSpec, function02, (Continuation) null);
            composer.N(snackbarHostKt$animatedOpacity$2$1);
            g3 = snackbarHostKt$animatedOpacity$2$1;
        }
        EffectsKt.g(valueOf, (Function2) g3, composer, (i2 >> 3) & 14);
        State g4 = animatable.g();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g4;
    }

    public static final State g(AnimationSpec animationSpec, boolean z2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(2003504988, i2, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
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

    public static final long h(SnackbarDuration snackbarDuration, boolean z2, AccessibilityManager accessibilityManager) {
        long j2;
        int i2 = WhenMappings.f8450a[snackbarDuration.ordinal()];
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
