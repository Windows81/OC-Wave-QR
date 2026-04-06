package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import kotlin.Metadata;

@Metadata
public final class SingleValueAnimationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SpringSpec f2384a = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.State a(long r10, androidx.compose.animation.core.AnimationSpec r12, java.lang.String r13, kotlin.jvm.functions.Function1 r14, androidx.compose.runtime.Composer r15, int r16, int r17) {
        /*
            r6 = r15
            r0 = r16
            r1 = r17 & 2
            if (r1 == 0) goto L_0x000b
            androidx.compose.animation.core.SpringSpec r1 = f2384a
            r2 = r1
            goto L_0x000c
        L_0x000b:
            r2 = r12
        L_0x000c:
            r1 = r17 & 4
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "ColorAnimation"
            r4 = r1
            goto L_0x0015
        L_0x0014:
            r4 = r13
        L_0x0015:
            r1 = r17 & 8
            if (r1 == 0) goto L_0x001c
            r1 = 0
            r5 = r1
            goto L_0x001d
        L_0x001c:
            r5 = r14
        L_0x001d:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x002c
            r1 = -1
            java.lang.String r3 = "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:60)"
            r7 = -451899108(0xffffffffe510911c, float:-4.26686E22)
            androidx.compose.runtime.ComposerKt.Y(r7, r0, r1, r3)
        L_0x002c:
            androidx.compose.ui.graphics.colorspace.ColorSpace r1 = androidx.compose.ui.graphics.Color.q(r10)
            boolean r1 = r15.W(r1)
            java.lang.Object r3 = r15.g()
            if (r1 != 0) goto L_0x0042
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0056
        L_0x0042:
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.f15975b
            kotlin.jvm.functions.Function1 r1 = androidx.compose.animation.ColorVectorConverterKt.a(r1)
            androidx.compose.ui.graphics.colorspace.ColorSpace r3 = androidx.compose.ui.graphics.Color.q(r10)
            java.lang.Object r1 = r1.invoke(r3)
            r3 = r1
            androidx.compose.animation.core.TwoWayConverter r3 = (androidx.compose.animation.core.TwoWayConverter) r3
            r15.N(r3)
        L_0x0056:
            r1 = r3
            androidx.compose.animation.core.TwoWayConverter r1 = (androidx.compose.animation.core.TwoWayConverter) r1
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.h(r10)
            r7 = r0 & 14
            int r8 = r0 << 3
            r8 = r8 & 896(0x380, float:1.256E-42)
            r7 = r7 | r8
            int r0 = r0 << 6
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r0
            r7 = r7 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r8
            r7 = r7 | r0
            r8 = 8
            r9 = 0
            r0 = r3
            r3 = r9
            r6 = r15
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.AnimateAsStateKt.e(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0082
            androidx.compose.runtime.ComposerKt.X()
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SingleValueAnimationKt.a(long, androidx.compose.animation.core.AnimationSpec, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }
}
