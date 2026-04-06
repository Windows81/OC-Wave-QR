package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AccessibilityServiceStateProvider_androidKt {
    public static final void h(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1868327245);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(lifecycleOwner) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function1) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function0) ? 256 : 128;
        }
        boolean z2 = false;
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                Object g2 = q2.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = new C0130c();
                    q2.N(g2);
                }
                function1 = (Function1) g2;
            }
            if (i6 != 0) {
                Object g3 = q2.g();
                if (g3 == Composer.f14567a.a()) {
                    g3 = new C0131d();
                    q2.N(g3);
                }
                function0 = (Function0) g3;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1868327245, i4, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean l2 = ((i4 & 112) == 32) | q2.l(lifecycleOwner);
            if ((i4 & 896) == 256) {
                z2 = true;
            }
            boolean z3 = l2 | z2;
            Object g4 = q2.g();
            if (z3 || g4 == Composer.f14567a.a()) {
                g4 = new C0132e(lifecycleOwner, function1, function0);
                q2.N(g4);
            }
            EffectsKt.c(lifecycleOwner, (Function1) g4, q2, i4 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Function1 function12 = function1;
        Function0 function02 = function0;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0133f(lifecycleOwner, function12, function02, i2, i3));
        }
    }

    public static final DisposableEffectResult i(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0, DisposableEffectScope disposableEffectScope) {
        C0134g gVar = new C0134g(function1);
        lifecycleOwner.a().a(gVar);
        return new AccessibilityServiceStateProvider_androidKt$ObserveState$lambda$12$lambda$11$$inlined$onDispose$1(function0, lifecycleOwner, gVar);
    }

    public static final void j(Function1 function1, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        function1.invoke(event);
    }

    public static final Unit k(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0, int i2, int i3, Composer composer, int i4) {
        h(lifecycleOwner, function1, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit l(Lifecycle.Event event) {
        return Unit.f40552a;
    }

    public static final Unit m() {
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State n(boolean r7, boolean r8, boolean r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = r12 & 1
            r1 = 1
            if (r0 == 0) goto L_0x0006
            r7 = r1
        L_0x0006:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x000b
            r8 = r1
        L_0x000b:
            r0 = 4
            r12 = r12 & r0
            if (r12 == 0) goto L_0x0010
            r9 = r1
        L_0x0010:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x001f
            r12 = -1
            java.lang.String r2 = "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)"
            r3 = 432241692(0x19c37c1c, float:2.0212655E-23)
            androidx.compose.runtime.ComposerKt.Y(r3, r11, r12, r2)
        L_0x001f:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r12 = r10.C(r12)
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r2 = "accessibility"
            java.lang.Object r12 = r12.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"
            kotlin.jvm.internal.Intrinsics.g(r12, r2)
            android.view.accessibility.AccessibilityManager r12 = (android.view.accessibility.AccessibilityManager) r12
            r2 = r11 & 14
            r2 = r2 ^ 6
            r3 = 0
            if (r2 <= r0) goto L_0x0043
            boolean r2 = r10.d(r7)
            if (r2 != 0) goto L_0x0047
        L_0x0043:
            r2 = r11 & 6
            if (r2 != r0) goto L_0x0049
        L_0x0047:
            r0 = r1
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            r2 = r11 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r4 = 32
            if (r2 <= r4) goto L_0x0058
            boolean r2 = r10.d(r8)
            if (r2 != 0) goto L_0x005c
        L_0x0058:
            r2 = r11 & 48
            if (r2 != r4) goto L_0x005e
        L_0x005c:
            r2 = r1
            goto L_0x005f
        L_0x005e:
            r2 = r3
        L_0x005f:
            r0 = r0 | r2
            r2 = r11 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 <= r4) goto L_0x006e
            boolean r2 = r10.d(r9)
            if (r2 != 0) goto L_0x0074
        L_0x006e:
            r11 = r11 & 384(0x180, float:5.38E-43)
            if (r11 != r4) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r3
        L_0x0074:
            r11 = r0 | r1
            java.lang.Object r0 = r10.g()
            if (r11 != 0) goto L_0x0084
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x008c
        L_0x0084:
            androidx.compose.material3.internal.Listener r0 = new androidx.compose.material3.internal.Listener
            r0.<init>(r7, r8, r9)
            r10.N(r0)
        L_0x008c:
            androidx.compose.material3.internal.Listener r0 = (androidx.compose.material3.internal.Listener) r0
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.c()
            java.lang.Object r7 = r10.C(r7)
            r1 = r7
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            boolean r7 = r10.W(r0)
            boolean r8 = r10.l(r12)
            r7 = r7 | r8
            java.lang.Object r8 = r10.g()
            if (r7 != 0) goto L_0x00b0
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00b8
        L_0x00b0:
            androidx.compose.material3.internal.a r8 = new androidx.compose.material3.internal.a
            r8.<init>(r0, r12)
            r10.N(r8)
        L_0x00b8:
            r2 = r8
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            boolean r7 = r10.W(r0)
            boolean r8 = r10.l(r12)
            r7 = r7 | r8
            java.lang.Object r8 = r10.g()
            if (r7 != 0) goto L_0x00d2
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00da
        L_0x00d2:
            androidx.compose.material3.internal.b r8 = new androidx.compose.material3.internal.b
            r8.<init>(r0, r12)
            r10.N(r8)
        L_0x00da:
            r3 = r8
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r5 = 0
            r6 = 0
            r4 = r10
            h(r1, r2, r3, r4, r5, r6)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00ec
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.n(boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    public static final Unit o(Listener listener, AccessibilityManager accessibilityManager, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            listener.v(accessibilityManager);
        }
        return Unit.f40552a;
    }

    public static final Unit p(Listener listener, AccessibilityManager accessibilityManager) {
        listener.x(accessibilityManager);
        return Unit.f40552a;
    }
}
