package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CardElevation {

    /* renamed from: a  reason: collision with root package name */
    public final float f9358a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9359b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9360c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9361d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9362e;

    /* renamed from: f  reason: collision with root package name */
    public final float f9363f;

    public /* synthetic */ CardElevation(float f2, float f3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.State e(boolean r19, androidx.compose.foundation.interaction.InteractionSource r20, androidx.compose.runtime.Composer r21, int r22) {
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
            java.lang.String r4 = "androidx.compose.material3.CardElevation.animateElevation (Card.kt:666)"
            r5 = -1421890746(0xffffffffab3fab46, float:-6.809452E-13)
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
            androidx.compose.material3.CardElevation$animateElevation$1$1 r6 = new androidx.compose.material3.CardElevation$animateElevation$1$1
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
            float r0 = r7.f9363f
        L_0x006e:
            r2 = r0
            goto L_0x008f
        L_0x0070:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x0077
            float r0 = r7.f9359b
            goto L_0x006e
        L_0x0077:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x007e
            float r0 = r7.f9361d
            goto L_0x006e
        L_0x007e:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x0085
            float r0 = r7.f9360c
            goto L_0x006e
        L_0x0085:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r0 == 0) goto L_0x008c
            float r0 = r7.f9362e
            goto L_0x006e
        L_0x008c:
            float r0 = r7.f9358a
            goto L_0x006e
        L_0x008f:
            java.lang.Object r0 = r21.g()
            java.lang.Object r6 = r4.a()
            if (r0 != r6) goto L_0x00b2
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
        L_0x00b2:
            r11 = r0
            androidx.compose.animation.core.Animatable r11 = (androidx.compose.animation.core.Animatable) r11
            androidx.compose.ui.unit.Dp r12 = androidx.compose.ui.unit.Dp.j(r2)
            boolean r0 = r8.l(r11)
            boolean r6 = r8.h(r2)
            r0 = r0 | r6
            r6 = r1 & 14
            r6 = r6 ^ 6
            r13 = 4
            if (r6 <= r13) goto L_0x00cf
            boolean r6 = r8.d(r3)
            if (r6 != 0) goto L_0x00d3
        L_0x00cf:
            r6 = r1 & 6
            if (r6 != r13) goto L_0x00d5
        L_0x00d3:
            r6 = r9
            goto L_0x00d6
        L_0x00d5:
            r6 = r10
        L_0x00d6:
            r0 = r0 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r6 <= r13) goto L_0x00e5
            boolean r6 = r8.W(r7)
            if (r6 != 0) goto L_0x00eb
        L_0x00e5:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r13) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r9 = r10
        L_0x00eb:
            r0 = r0 | r9
            boolean r1 = r8.l(r5)
            r0 = r0 | r1
            java.lang.Object r1 = r21.g()
            if (r0 != 0) goto L_0x00fd
            java.lang.Object r0 = r4.a()
            if (r1 != r0) goto L_0x010d
        L_0x00fd:
            androidx.compose.material3.CardElevation$animateElevation$2$1 r9 = new androidx.compose.material3.CardElevation$animateElevation$2$1
            r6 = 0
            r0 = r9
            r1 = r11
            r3 = r19
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.N(r9)
            r1 = r9
        L_0x010d:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            androidx.compose.runtime.EffectsKt.g(r12, r1, r8, r10)
            androidx.compose.runtime.State r0 = r11.g()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x011f
            androidx.compose.runtime.ComposerKt.X()
        L_0x011f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardElevation.e(boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) obj;
        return Dp.o(this.f9358a, cardElevation.f9358a) && Dp.o(this.f9359b, cardElevation.f9359b) && Dp.o(this.f9360c, cardElevation.f9360c) && Dp.o(this.f9361d, cardElevation.f9361d) && Dp.o(this.f9363f, cardElevation.f9363f);
    }

    public final State f(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(-1763481333);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1763481333, i2, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:655)");
        }
        if (interactionSource == null) {
            composer.X(167751211);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e(Dp.j(this.f9358a), (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            composer.M();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            return mutableState;
        }
        composer.X(167824247);
        composer.M();
        State e2 = e(z2, interactionSource, composer, i2 & 1022);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return e2;
    }

    public int hashCode() {
        return (((((((Dp.p(this.f9358a) * 31) + Dp.p(this.f9359b)) * 31) + Dp.p(this.f9360c)) * 31) + Dp.p(this.f9361d)) * 31) + Dp.p(this.f9363f);
    }

    public CardElevation(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f9358a = f2;
        this.f9359b = f3;
        this.f9360c = f4;
        this.f9361d = f5;
        this.f9362e = f6;
        this.f9363f = f7;
    }
}
