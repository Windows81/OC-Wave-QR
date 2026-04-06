package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultButtonColors implements ButtonColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7566a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7567b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7568c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7569d;

    public /* synthetic */ DefaultButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    public State a(boolean z2, Composer composer, int i2) {
        composer.X(-655254499);
        if (ComposerKt.P()) {
            ComposerKt.Y(-655254499, i2, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:584)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7566a : this.f7568c), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State b(boolean z2, Composer composer, int i2) {
        composer.X(-2133647540);
        if (ComposerKt.P()) {
            ComposerKt.Y(-2133647540, i2, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:589)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7567b : this.f7569d), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        return Color.n(this.f7566a, defaultButtonColors.f7566a) && Color.n(this.f7567b, defaultButtonColors.f7567b) && Color.n(this.f7568c, defaultButtonColors.f7568c) && Color.n(this.f7569d, defaultButtonColors.f7569d);
    }

    public int hashCode() {
        return (((((Color.t(this.f7566a) * 31) + Color.t(this.f7567b)) * 31) + Color.t(this.f7568c)) * 31) + Color.t(this.f7569d);
    }

    public DefaultButtonColors(long j2, long j3, long j4, long j5) {
        this.f7566a = j2;
        this.f7567b = j3;
        this.f7568c = j4;
        this.f7569d = j5;
    }
}
