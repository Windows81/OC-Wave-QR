package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class FloatingActionButtonElevationAnimatable {

    /* renamed from: a  reason: collision with root package name */
    public float f7864a;

    /* renamed from: b  reason: collision with root package name */
    public float f7865b;

    /* renamed from: c  reason: collision with root package name */
    public float f7866c;

    /* renamed from: d  reason: collision with root package name */
    public float f7867d;

    /* renamed from: e  reason: collision with root package name */
    public final Animatable f7868e;

    /* renamed from: f  reason: collision with root package name */
    public Interaction f7869f;

    /* renamed from: g  reason: collision with root package name */
    public Interaction f7870g;

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(androidx.compose.foundation.interaction.Interaction r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.D
            androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
            java.lang.Object r0 = r0.C
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.ResultKt.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x006b
        L_0x0031:
            r7 = move-exception
            goto L_0x0070
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.ResultKt.b(r7)
            float r7 = r5.d(r6)
            r5.f7870g = r6
            androidx.compose.animation.core.Animatable r2 = r5.f7868e     // Catch:{ all -> 0x0067 }
            java.lang.Object r2 = r2.k()     // Catch:{ all -> 0x0067 }
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2     // Catch:{ all -> 0x0067 }
            float r2 = r2.t()     // Catch:{ all -> 0x0067 }
            boolean r2 = androidx.compose.ui.unit.Dp.o(r2, r7)     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x006a
            androidx.compose.animation.core.Animatable r2 = r5.f7868e     // Catch:{ all -> 0x0067 }
            androidx.compose.foundation.interaction.Interaction r4 = r5.f7869f     // Catch:{ all -> 0x0067 }
            r0.C = r5     // Catch:{ all -> 0x0067 }
            r0.D = r6     // Catch:{ all -> 0x0067 }
            r0.G = r3     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = androidx.compose.material.ElevationKt.d(r2, r7, r4, r6, r0)     // Catch:{ all -> 0x0067 }
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x0067:
            r7 = move-exception
            r0 = r5
            goto L_0x0070
        L_0x006a:
            r0 = r5
        L_0x006b:
            r0.f7869f = r6
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0070:
            r0.f7869f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.b(androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final State c() {
        return this.f7868e.g();
    }

    public final float d(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.f7865b : interaction instanceof HoverInteraction.Enter ? this.f7866c : interaction instanceof FocusInteraction.Focus ? this.f7867d : this.f7864a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.C
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.ResultKt.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0064
        L_0x002d:
            r5 = move-exception
            goto L_0x006b
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.ResultKt.b(r5)
            androidx.compose.foundation.interaction.Interaction r5 = r4.f7870g
            float r5 = r4.d(r5)
            androidx.compose.animation.core.Animatable r2 = r4.f7868e
            java.lang.Object r2 = r2.k()
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2
            float r2 = r2.t()
            boolean r2 = androidx.compose.ui.unit.Dp.o(r2, r5)
            if (r2 != 0) goto L_0x0070
            androidx.compose.animation.core.Animatable r2 = r4.f7868e     // Catch:{ all -> 0x0069 }
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.j(r5)     // Catch:{ all -> 0x0069 }
            r0.C = r4     // Catch:{ all -> 0x0069 }
            r0.F = r3     // Catch:{ all -> 0x0069 }
            java.lang.Object r5 = r2.t(r5, r0)     // Catch:{ all -> 0x0069 }
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r4
        L_0x0064:
            androidx.compose.foundation.interaction.Interaction r5 = r0.f7870g
            r0.f7869f = r5
            goto L_0x0070
        L_0x0069:
            r5 = move-exception
            r0 = r4
        L_0x006b:
            androidx.compose.foundation.interaction.Interaction r1 = r0.f7870g
            r0.f7869f = r1
            throw r5
        L_0x0070:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(float f2, float f3, float f4, float f5, Continuation continuation) {
        this.f7864a = f2;
        this.f7865b = f3;
        this.f7866c = f4;
        this.f7867d = f5;
        Object e2 = e(continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public FloatingActionButtonElevationAnimatable(float f2, float f3, float f4, float f5) {
        this.f7864a = f2;
        this.f7865b = f3;
        this.f7866c = f4;
        this.f7867d = f5;
        this.f7868e = new Animatable(Dp.j(this.f7864a), VectorConvertersKt.e(Dp.f19144A), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
    }
}
