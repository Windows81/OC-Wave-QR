package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultButtonElevation implements ButtonElevation {

    /* renamed from: a  reason: collision with root package name */
    public final float f7570a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7571b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7572c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7573d;

    /* renamed from: e  reason: collision with root package name */
    public final float f7574e;

    public /* synthetic */ DefaultButtonElevation(float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.State a(boolean r19, androidx.compose.foundation.interaction.InteractionSource r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r18 = this;
            r7 = r18
            r3 = r19
            r0 = r20
            r8 = r21
            r1 = r22
            r2 = -1588756907(0xffffffffa14d7e55, float:-6.96239E-19)
            r8.X(r2)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x001c
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:503)"
            androidx.compose.runtime.ComposerKt.Y(r2, r1, r4, r5)
        L_0x001c:
            java.lang.Object r2 = r21.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r4.a()
            if (r2 != r5) goto L_0x002f
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = androidx.compose.runtime.SnapshotStateKt.f()
            r8.N(r2)
        L_0x002f:
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = (androidx.compose.runtime.snapshots.SnapshotStateList) r2
            r5 = r1 & 112(0x70, float:1.57E-43)
            r5 = r5 ^ 48
            r6 = 32
            r9 = 1
            r10 = 0
            if (r5 <= r6) goto L_0x0041
            boolean r5 = r8.W(r0)
            if (r5 != 0) goto L_0x0045
        L_0x0041:
            r5 = r1 & 48
            if (r5 != r6) goto L_0x0047
        L_0x0045:
            r5 = r9
            goto L_0x0048
        L_0x0047:
            r5 = r10
        L_0x0048:
            java.lang.Object r6 = r21.g()
            if (r5 != 0) goto L_0x0054
            java.lang.Object r5 = r4.a()
            if (r6 != r5) goto L_0x005d
        L_0x0054:
            androidx.compose.material.DefaultButtonElevation$elevation$1$1 r6 = new androidx.compose.material.DefaultButtonElevation$elevation$1$1
            r5 = 0
            r6.<init>(r0, r2, r5)
            r8.N(r6)
        L_0x005d:
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            int r5 = r1 >> 3
            r5 = r5 & 14
            androidx.compose.runtime.EffectsKt.g(r0, r6, r8, r5)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.q0(r2)
            r5 = r0
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            if (r3 != 0) goto L_0x0073
            float r0 = r7.f7572c
        L_0x0071:
            r2 = r0
            goto L_0x008b
        L_0x0073:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x007a
            float r0 = r7.f7571b
            goto L_0x0071
        L_0x007a:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x0081
            float r0 = r7.f7573d
            goto L_0x0071
        L_0x0081:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x0088
            float r0 = r7.f7574e
            goto L_0x0071
        L_0x0088:
            float r0 = r7.f7570a
            goto L_0x0071
        L_0x008b:
            java.lang.Object r0 = r21.g()
            java.lang.Object r6 = r4.a()
            if (r0 != r6) goto L_0x00ae
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.Dp r12 = androidx.compose.ui.unit.Dp.j(r2)
            androidx.compose.ui.unit.Dp$Companion r6 = androidx.compose.ui.unit.Dp.f19144A
            androidx.compose.animation.core.TwoWayConverter r13 = androidx.compose.animation.core.VectorConvertersKt.e(r6)
            r16 = 12
            r17 = 0
            r14 = 0
            r15 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r8.N(r0)
        L_0x00ae:
            r11 = r0
            androidx.compose.animation.core.Animatable r11 = (androidx.compose.animation.core.Animatable) r11
            androidx.compose.ui.unit.Dp r12 = androidx.compose.ui.unit.Dp.j(r2)
            boolean r0 = r8.l(r11)
            boolean r6 = r8.h(r2)
            r0 = r0 | r6
            r6 = r1 & 14
            r6 = r6 ^ 6
            r13 = 4
            if (r6 <= r13) goto L_0x00cb
            boolean r6 = r8.d(r3)
            if (r6 != 0) goto L_0x00cf
        L_0x00cb:
            r6 = r1 & 6
            if (r6 != r13) goto L_0x00d1
        L_0x00cf:
            r6 = r9
            goto L_0x00d2
        L_0x00d1:
            r6 = r10
        L_0x00d2:
            r0 = r0 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r6 <= r13) goto L_0x00e1
            boolean r6 = r8.W(r7)
            if (r6 != 0) goto L_0x00e7
        L_0x00e1:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r13) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r9 = r10
        L_0x00e7:
            r0 = r0 | r9
            boolean r1 = r8.l(r5)
            r0 = r0 | r1
            java.lang.Object r1 = r21.g()
            if (r0 != 0) goto L_0x00f9
            java.lang.Object r0 = r4.a()
            if (r1 != r0) goto L_0x0109
        L_0x00f9:
            androidx.compose.material.DefaultButtonElevation$elevation$2$1 r9 = new androidx.compose.material.DefaultButtonElevation$elevation$2$1
            r6 = 0
            r0 = r9
            r1 = r11
            r3 = r19
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.N(r9)
            r1 = r9
        L_0x0109:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            androidx.compose.runtime.EffectsKt.g(r12, r1, r8, r10)
            androidx.compose.runtime.State r0 = r11.g()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x011b
            androidx.compose.runtime.ComposerKt.X()
        L_0x011b:
            r21.M()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultButtonElevation.a(boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public DefaultButtonElevation(float f2, float f3, float f4, float f5, float f6) {
        this.f7570a = f2;
        this.f7571b = f3;
        this.f7572c = f4;
        this.f7573d = f5;
        this.f7574e = f6;
    }
}
