package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
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
public final class CheckboxColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f9370a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9371b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9372c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9373d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9374e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9375f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9376g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9377h;

    /* renamed from: i  reason: collision with root package name */
    public final long f9378i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9379j;

    /* renamed from: k  reason: collision with root package name */
    public final long f9380k;

    /* renamed from: l  reason: collision with root package name */
    public final long f9381l;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9382a;

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
                f9382a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxColors.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    public final State a(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State state;
        if (ComposerKt.P()) {
            ComposerKt.Y(1009643462, i2, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:657)");
        }
        if (z2) {
            int i3 = WhenMappings.f9382a[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j2 = this.f9377h;
            } else if (i3 == 3) {
                j2 = this.f9378i;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.f9382a[toggleableState.ordinal()];
            if (i4 == 1) {
                j2 = this.f9379j;
            } else if (i4 == 2) {
                j2 = this.f9381l;
            } else if (i4 == 3) {
                j2 = this.f9380k;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        long j3 = j2;
        if (z2) {
            composer.X(633231558);
            state = SingleValueAnimationKt.a(j3, d(toggleableState, composer, (i2 >> 3) & 126), (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        } else {
            composer.X(633321768);
            state = SnapshotStateKt.p(Color.h(j3), composer, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return state;
    }

    public final State b(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State state;
        if (ComposerKt.P()) {
            ComposerKt.Y(360729865, i2, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:625)");
        }
        if (z2) {
            int i3 = WhenMappings.f9382a[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j2 = this.f9372c;
            } else if (i3 == 3) {
                j2 = this.f9373d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.f9382a[toggleableState.ordinal()];
            if (i4 == 1) {
                j2 = this.f9374e;
            } else if (i4 == 2) {
                j2 = this.f9376g;
            } else if (i4 == 3) {
                j2 = this.f9375f;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        long j3 = j2;
        if (z2) {
            composer.X(496051715);
            state = SingleValueAnimationKt.a(j3, d(toggleableState, composer, (i2 >> 3) & 126), (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        } else {
            composer.X(496141925);
            state = SnapshotStateKt.p(Color.h(j3), composer, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return state;
    }

    public final State c(ToggleableState toggleableState, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-507585681, i2, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:606)");
        }
        State a2 = SingleValueAnimationKt.a(toggleableState == ToggleableState.Off ? this.f9371b : this.f9370a, d(toggleableState, composer, i2 & 126), (String) null, (Function1) null, composer, 0, 12);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public final AnimationSpec d(ToggleableState toggleableState, Composer composer, int i2) {
        FiniteAnimationSpec finiteAnimationSpec;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1075456245, i2, -1, "androidx.compose.material3.CheckboxColors.colorAnimationSpecForState (Checkbox.kt:684)");
        }
        if (toggleableState == ToggleableState.Off) {
            composer.X(1539262271);
            finiteAnimationSpec = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer, 6);
            composer.M();
        } else {
            composer.X(1539355581);
            finiteAnimationSpec = MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return finiteAnimationSpec;
    }

    public final CheckboxColors e(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new CheckboxColors(j2 != 16 ? j2 : this.f9370a, j3 != 16 ? j3 : this.f9371b, j4 != 16 ? j4 : this.f9372c, j5 != 16 ? j5 : this.f9373d, j6 != 16 ? j6 : this.f9374e, j7 != 16 ? j7 : this.f9375f, j8 != 16 ? j8 : this.f9376g, j9 != 16 ? j9 : this.f9377h, j10 != 16 ? j10 : this.f9378i, j11 != 16 ? j11 : this.f9379j, j12 != 16 ? j12 : this.f9380k, j13 != 16 ? j13 : this.f9381l, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.n(this.f9370a, checkboxColors.f9370a) && Color.n(this.f9371b, checkboxColors.f9371b) && Color.n(this.f9372c, checkboxColors.f9372c) && Color.n(this.f9373d, checkboxColors.f9373d) && Color.n(this.f9374e, checkboxColors.f9374e) && Color.n(this.f9375f, checkboxColors.f9375f) && Color.n(this.f9376g, checkboxColors.f9376g) && Color.n(this.f9377h, checkboxColors.f9377h) && Color.n(this.f9378i, checkboxColors.f9378i) && Color.n(this.f9379j, checkboxColors.f9379j) && Color.n(this.f9380k, checkboxColors.f9380k) && Color.n(this.f9381l, checkboxColors.f9381l);
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.t(this.f9370a) * 31) + Color.t(this.f9371b)) * 31) + Color.t(this.f9372c)) * 31) + Color.t(this.f9373d)) * 31) + Color.t(this.f9374e)) * 31) + Color.t(this.f9375f)) * 31) + Color.t(this.f9376g)) * 31) + Color.t(this.f9377h)) * 31) + Color.t(this.f9378i)) * 31) + Color.t(this.f9379j)) * 31) + Color.t(this.f9380k)) * 31) + Color.t(this.f9381l);
    }

    public CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f9370a = j2;
        this.f9371b = j3;
        this.f9372c = j4;
        this.f9373d = j5;
        this.f9374e = j6;
        this.f9375f = j7;
        this.f9376g = j8;
        this.f9377h = j9;
        this.f9378i = j10;
        this.f9379j = j11;
        this.f9380k = j12;
        this.f9381l = j13;
    }
}
