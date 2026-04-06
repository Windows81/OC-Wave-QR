package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {

    /* renamed from: a  reason: collision with root package name */
    public final float f7595a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7596b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7597c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7598d;

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: androidx.compose.material.FloatingActionButtonElevationAnimatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: androidx.compose.material.FloatingActionButtonElevationAnimatable} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r10 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x003e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.State a(androidx.compose.foundation.interaction.InteractionSource r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = -478475335(0xffffffffe37b0bb9, float:-4.6309775E21)
            r2.X(r4)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x001a
            r5 = -1
            java.lang.String r6 = "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)"
            androidx.compose.runtime.ComposerKt.Y(r4, r3, r5, r6)
        L_0x001a:
            r4 = r3 & 14
            r5 = r4 ^ 6
            r6 = 0
            r7 = 1
            r8 = 4
            if (r5 <= r8) goto L_0x0029
            boolean r9 = r2.W(r1)
            if (r9 != 0) goto L_0x002d
        L_0x0029:
            r9 = r3 & 6
            if (r9 != r8) goto L_0x002f
        L_0x002d:
            r9 = r7
            goto L_0x0030
        L_0x002f:
            r9 = r6
        L_0x0030:
            java.lang.Object r10 = r19.g()
            if (r9 != 0) goto L_0x003e
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0051
        L_0x003e:
            androidx.compose.material.FloatingActionButtonElevationAnimatable r10 = new androidx.compose.material.FloatingActionButtonElevationAnimatable
            float r12 = r0.f7595a
            float r13 = r0.f7596b
            float r14 = r0.f7597c
            float r15 = r0.f7598d
            r16 = 0
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r2.N(r10)
        L_0x0051:
            androidx.compose.material.FloatingActionButtonElevationAnimatable r10 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r10
            boolean r9 = r2.l(r10)
            r11 = r3 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            r12 = 32
            if (r11 <= r12) goto L_0x0065
            boolean r11 = r2.W(r0)
            if (r11 != 0) goto L_0x0069
        L_0x0065:
            r11 = r3 & 48
            if (r11 != r12) goto L_0x006b
        L_0x0069:
            r11 = r7
            goto L_0x006c
        L_0x006b:
            r11 = r6
        L_0x006c:
            r9 = r9 | r11
            java.lang.Object r11 = r19.g()
            r12 = 0
            if (r9 != 0) goto L_0x007c
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r11 != r9) goto L_0x0084
        L_0x007c:
            androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1 r11 = new androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1
            r11.<init>(r10, r0, r12)
            r2.N(r11)
        L_0x0084:
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            int r9 = r3 >> 3
            r9 = r9 & 14
            androidx.compose.runtime.EffectsKt.g(r0, r11, r2, r9)
            if (r5 <= r8) goto L_0x0095
            boolean r5 = r2.W(r1)
            if (r5 != 0) goto L_0x0099
        L_0x0095:
            r3 = r3 & 6
            if (r3 != r8) goto L_0x009a
        L_0x0099:
            r6 = r7
        L_0x009a:
            boolean r3 = r2.l(r10)
            r3 = r3 | r6
            java.lang.Object r5 = r19.g()
            if (r3 != 0) goto L_0x00ad
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00b5
        L_0x00ad:
            androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1 r5 = new androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1
            r5.<init>(r1, r10, r12)
            r2.N(r5)
        L_0x00b5:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            androidx.compose.runtime.EffectsKt.g(r1, r5, r2, r4)
            androidx.compose.runtime.State r1 = r10.c()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00c7
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c7:
            r19.M()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultFloatingActionButtonElevation.a(androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultFloatingActionButtonElevation)) {
            return false;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) obj;
        if (Dp.o(this.f7595a, defaultFloatingActionButtonElevation.f7595a) && Dp.o(this.f7596b, defaultFloatingActionButtonElevation.f7596b) && Dp.o(this.f7597c, defaultFloatingActionButtonElevation.f7597c)) {
            return Dp.o(this.f7598d, defaultFloatingActionButtonElevation.f7598d);
        }
        return false;
    }

    public int hashCode() {
        return (((((Dp.p(this.f7595a) * 31) + Dp.p(this.f7596b)) * 31) + Dp.p(this.f7597c)) * 31) + Dp.p(this.f7598d);
    }

    public DefaultFloatingActionButtonElevation(float f2, float f3, float f4, float f5) {
        this.f7595a = f2;
        this.f7596b = f3;
        this.f7597c = f4;
        this.f7598d = f5;
    }
}
