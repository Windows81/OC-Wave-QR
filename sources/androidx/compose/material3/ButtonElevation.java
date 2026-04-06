package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ButtonElevation {

    /* renamed from: a  reason: collision with root package name */
    public final float f9318a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9319b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9320c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9321d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9322e;

    public /* synthetic */ ButtonElevation(float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.State d(boolean r19, androidx.compose.foundation.interaction.InteractionSource r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r18 = this;
            r7 = r18
            r3 = r19
            r0 = r20
            r8 = r21
            r1 = r22
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0019
            r2 = -1
            java.lang.String r4 = "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:947)"
            r5 = -1312510462(0xffffffffb1c4ae02, float:-5.724133E-9)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0019:
            java.lang.Object r2 = r21.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r4.a()
            if (r2 != r5) goto L_0x002c
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = androidx.compose.runtime.SnapshotStateKt.f()
            r8.N(r2)
        L_0x002c:
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = (androidx.compose.runtime.snapshots.SnapshotStateList) r2
            r5 = r1 & 112(0x70, float:1.57E-43)
            r5 = r5 ^ 48
            r6 = 32
            r9 = 1
            r10 = 0
            if (r5 <= r6) goto L_0x003e
            boolean r5 = r8.W(r0)
            if (r5 != 0) goto L_0x0042
        L_0x003e:
            r5 = r1 & 48
            if (r5 != r6) goto L_0x0044
        L_0x0042:
            r5 = r9
            goto L_0x0045
        L_0x0044:
            r5 = r10
        L_0x0045:
            java.lang.Object r6 = r21.g()
            if (r5 != 0) goto L_0x0051
            java.lang.Object r5 = r4.a()
            if (r6 != r5) goto L_0x005a
        L_0x0051:
            androidx.compose.material3.ButtonElevation$animateElevation$1$1 r6 = new androidx.compose.material3.ButtonElevation$animateElevation$1$1
            r5 = 0
            r6.<init>(r0, r2, r5)
            r8.N(r6)
        L_0x005a:
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            int r5 = r1 >> 3
            r5 = r5 & 14
            androidx.compose.runtime.EffectsKt.g(r0, r6, r8, r5)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.q0(r2)
            r5 = r0
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            if (r3 != 0) goto L_0x0070
            float r0 = r7.f9322e
        L_0x006e:
            r2 = r0
            goto L_0x0088
        L_0x0070:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x0077
            float r0 = r7.f9319b
            goto L_0x006e
        L_0x0077:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x007e
            float r0 = r7.f9321d
            goto L_0x006e
        L_0x007e:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x0085
            float r0 = r7.f9320c
            goto L_0x006e
        L_0x0085:
            float r0 = r7.f9318a
            goto L_0x006e
        L_0x0088:
            java.lang.Object r0 = r21.g()
            java.lang.Object r6 = r4.a()
            if (r0 != r6) goto L_0x00ab
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
        L_0x00ab:
            r11 = r0
            androidx.compose.animation.core.Animatable r11 = (androidx.compose.animation.core.Animatable) r11
            androidx.compose.ui.unit.Dp r12 = androidx.compose.ui.unit.Dp.j(r2)
            boolean r0 = r8.l(r11)
            boolean r6 = r8.h(r2)
            r0 = r0 | r6
            r6 = r1 & 14
            r6 = r6 ^ 6
            r13 = 4
            if (r6 <= r13) goto L_0x00c8
            boolean r6 = r8.d(r3)
            if (r6 != 0) goto L_0x00cc
        L_0x00c8:
            r6 = r1 & 6
            if (r6 != r13) goto L_0x00ce
        L_0x00cc:
            r6 = r9
            goto L_0x00cf
        L_0x00ce:
            r6 = r10
        L_0x00cf:
            r0 = r0 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r6 <= r13) goto L_0x00de
            boolean r6 = r8.W(r7)
            if (r6 != 0) goto L_0x00e4
        L_0x00de:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r13) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r9 = r10
        L_0x00e4:
            r0 = r0 | r9
            boolean r1 = r8.l(r5)
            r0 = r0 | r1
            java.lang.Object r1 = r21.g()
            if (r0 != 0) goto L_0x00f6
            java.lang.Object r0 = r4.a()
            if (r1 != r0) goto L_0x0106
        L_0x00f6:
            androidx.compose.material3.ButtonElevation$animateElevation$2$1 r9 = new androidx.compose.material3.ButtonElevation$animateElevation$2$1
            r6 = 0
            r0 = r9
            r1 = r11
            r3 = r19
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.N(r9)
            r1 = r9
        L_0x0106:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            androidx.compose.runtime.EffectsKt.g(r12, r1, r8, r10)
            androidx.compose.runtime.State r0 = r11.g()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0118
            androidx.compose.runtime.ComposerKt.X()
        L_0x0118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonElevation.d(boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public final State e(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-2045116089, i2, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:939)");
        }
        State d2 = d(z2, interactionSource, composer, i2 & 1022);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        return Dp.o(this.f9318a, buttonElevation.f9318a) && Dp.o(this.f9319b, buttonElevation.f9319b) && Dp.o(this.f9320c, buttonElevation.f9320c) && Dp.o(this.f9321d, buttonElevation.f9321d) && Dp.o(this.f9322e, buttonElevation.f9322e);
    }

    public int hashCode() {
        return (((((((Dp.p(this.f9318a) * 31) + Dp.p(this.f9319b)) * 31) + Dp.p(this.f9320c)) * 31) + Dp.p(this.f9321d)) * 31) + Dp.p(this.f9322e);
    }

    public ButtonElevation(float f2, float f3, float f4, float f5, float f6) {
        this.f9318a = f2;
        this.f9319b = f3;
        this.f9320c = f4;
        this.f9321d = f5;
        this.f9322e = f6;
    }
}
