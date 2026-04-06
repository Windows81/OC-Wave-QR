package androidx.compose.material.ripple;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public final class PlatformRipple extends Ripple {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r15 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x005e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.material.ripple.RippleIndicationInstance c(androidx.compose.foundation.interaction.InteractionSource r9, boolean r10, float r11, androidx.compose.runtime.State r12, androidx.compose.runtime.State r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r8 = this;
            r0 = 331259447(0x13be9e37, float:4.8118755E-27)
            r14.X(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:84)"
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r1, r2)
        L_0x0012:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r14.C(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup r6 = androidx.compose.material.ripple.Ripple_androidKt.e(r0)
            r0 = r15 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L_0x002f
            boolean r9 = r14.W(r9)
            if (r9 != 0) goto L_0x0033
        L_0x002f:
            r9 = r15 & 6
            if (r9 != r3) goto L_0x0035
        L_0x0033:
            r9 = r2
            goto L_0x0036
        L_0x0035:
            r9 = r1
        L_0x0036:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r15
            r3 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 ^ r3
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= r4) goto L_0x0046
            boolean r0 = r14.W(r8)
            if (r0 != 0) goto L_0x0049
        L_0x0046:
            r15 = r15 & r3
            if (r15 != r4) goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            r9 = r9 | r1
            boolean r15 = r14.W(r6)
            r9 = r9 | r15
            java.lang.Object r15 = r14.g()
            if (r9 != 0) goto L_0x005e
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x006c
        L_0x005e:
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r15 = new androidx.compose.material.ripple.AndroidRippleIndicationInstance
            r7 = 0
            r1 = r15
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.N(r15)
        L_0x006c:
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r15 = (androidx.compose.material.ripple.AndroidRippleIndicationInstance) r15
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0077
            androidx.compose.runtime.ComposerKt.X()
        L_0x0077:
            r14.M()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.PlatformRipple.c(androidx.compose.foundation.interaction.InteractionSource, boolean, float, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):androidx.compose.material.ripple.RippleIndicationInstance");
    }
}
