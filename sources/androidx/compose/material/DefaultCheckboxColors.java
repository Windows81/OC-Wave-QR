package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultCheckboxColors implements CheckboxColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7576a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7577b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7578c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7579d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7580e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7581f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7582g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7583h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7584i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7585j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7586k;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7587a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f7587a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultCheckboxColors.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }

    public State a(ToggleableState toggleableState, Composer composer, int i2) {
        composer.X(544656267);
        if (ComposerKt.P()) {
            ComposerKt.Y(544656267, i2, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:407)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        State a2 = SingleValueAnimationKt.a(toggleableState == toggleableState2 ? this.f7577b : this.f7576a, AnimationSpecKt.n(toggleableState == toggleableState2 ? 100 : 50, 0, (Easing) null, 6, (Object) null), (String) null, (Function1) null, composer, 0, 12);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }

    public State b(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State state;
        composer.X(840901029);
        if (ComposerKt.P()) {
            ComposerKt.Y(840901029, i2, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:420)");
        }
        if (z2) {
            int i3 = WhenMappings.f7587a[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j2 = this.f7578c;
            } else if (i3 == 3) {
                j2 = this.f7579d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.f7587a[toggleableState.ordinal()];
            if (i4 == 1) {
                j2 = this.f7580e;
            } else if (i4 == 2) {
                j2 = this.f7582g;
            } else if (i4 == 3) {
                j2 = this.f7581f;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        long j3 = j2;
        if (z2) {
            composer.X(507535414);
            state = SingleValueAnimationKt.a(j3, AnimationSpecKt.n(toggleableState == ToggleableState.Off ? 100 : 50, 0, (Easing) null, 6, (Object) null), (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        } else {
            composer.X(507715958);
            state = SnapshotStateKt.p(Color.h(j3), composer, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return state;
    }

    public State c(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State state;
        composer.X(-1568341342);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1568341342, i2, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:447)");
        }
        if (z2) {
            int i3 = WhenMappings.f7587a[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j2 = this.f7583h;
            } else if (i3 == 3) {
                j2 = this.f7584i;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.f7587a[toggleableState.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    j2 = this.f7586k;
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j2 = this.f7585j;
        }
        long j3 = j2;
        if (z2) {
            composer.X(-840498473);
            state = SingleValueAnimationKt.a(j3, AnimationSpecKt.n(toggleableState == ToggleableState.Off ? 100 : 50, 0, (Easing) null, 6, (Object) null), (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        } else {
            composer.X(-840317929);
            state = SnapshotStateKt.p(Color.h(j3), composer, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return state;
    }

    public DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f7576a = j2;
        this.f7577b = j3;
        this.f7578c = j4;
        this.f7579d = j5;
        this.f7580e = j6;
        this.f7581f = j7;
        this.f7582g = j8;
        this.f7583h = j9;
        this.f7584i = j10;
        this.f7585j = j11;
        this.f7586k = j12;
    }
}
