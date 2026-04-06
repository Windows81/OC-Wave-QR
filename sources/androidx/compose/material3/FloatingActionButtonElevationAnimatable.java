package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
final class FloatingActionButtonElevationAnimatable {

    /* renamed from: a  reason: collision with root package name */
    public float f10025a;

    /* renamed from: b  reason: collision with root package name */
    public float f10026b;

    /* renamed from: c  reason: collision with root package name */
    public float f10027c;

    /* renamed from: d  reason: collision with root package name */
    public float f10028d;

    /* renamed from: e  reason: collision with root package name */
    public final Animatable f10029e;

    /* renamed from: f  reason: collision with root package name */
    public Interaction f10030f;

    /* renamed from: g  reason: collision with root package name */
    public Interaction f10031g;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(androidx.compose.foundation.interaction.Interaction r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.C
            androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
            kotlin.ResultKt.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x0061
        L_0x002d:
            r7 = move-exception
            goto L_0x0066
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.ResultKt.b(r7)
            float r7 = r5.c(r6)
            r5.f10031g = r6
            androidx.compose.animation.core.Animatable r2 = r5.f10029e     // Catch:{ all -> 0x002d }
            java.lang.Object r2 = r2.k()     // Catch:{ all -> 0x002d }
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2     // Catch:{ all -> 0x002d }
            float r2 = r2.t()     // Catch:{ all -> 0x002d }
            boolean r2 = androidx.compose.ui.unit.Dp.o(r2, r7)     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x0061
            androidx.compose.animation.core.Animatable r2 = r5.f10029e     // Catch:{ all -> 0x002d }
            androidx.compose.foundation.interaction.Interaction r4 = r5.f10030f     // Catch:{ all -> 0x002d }
            r0.C = r6     // Catch:{ all -> 0x002d }
            r0.F = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r7 = androidx.compose.material3.internal.ElevationKt.d(r2, r7, r4, r6, r0)     // Catch:{ all -> 0x002d }
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r5.f10030f = r6
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0066:
            r5.f10030f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.b(androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float c(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.f10026b : interaction instanceof HoverInteraction.Enter ? this.f10027c : interaction instanceof FocusInteraction.Focus ? this.f10028d : this.f10025a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.b(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x005d
        L_0x0029:
            r5 = move-exception
            goto L_0x0062
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.b(r5)
            androidx.compose.foundation.interaction.Interaction r5 = r4.f10031g
            float r5 = r4.c(r5)
            androidx.compose.animation.core.Animatable r2 = r4.f10029e
            java.lang.Object r2 = r2.k()
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2
            float r2 = r2.t()
            boolean r2 = androidx.compose.ui.unit.Dp.o(r2, r5)
            if (r2 != 0) goto L_0x0067
            androidx.compose.animation.core.Animatable r2 = r4.f10029e     // Catch:{ all -> 0x0029 }
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.j(r5)     // Catch:{ all -> 0x0029 }
            r0.E = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = r2.t(r5, r0)     // Catch:{ all -> 0x0029 }
            if (r5 != r1) goto L_0x005d
            return r1
        L_0x005d:
            androidx.compose.foundation.interaction.Interaction r5 = r4.f10031g
            r4.f10030f = r5
            goto L_0x0067
        L_0x0062:
            androidx.compose.foundation.interaction.Interaction r0 = r4.f10031g
            r4.f10030f = r0
            throw r5
        L_0x0067:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object e(float f2, float f3, float f4, float f5, Continuation continuation) {
        this.f10025a = f2;
        this.f10026b = f3;
        this.f10027c = f4;
        this.f10028d = f5;
        Object d2 = d(continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }
}
