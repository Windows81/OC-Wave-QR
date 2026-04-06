package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldScrollerPosition {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f5959g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final Saver f5960h = ListSaverKt.b(TextFieldScrollerPosition$Companion$Saver$1.f5967z, TextFieldScrollerPosition$Companion$Saver$2.f5968z);

    /* renamed from: a  reason: collision with root package name */
    public final MutableFloatState f5961a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableFloatState f5962b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableIntState f5963c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f5964d;

    /* renamed from: e  reason: collision with root package name */
    public long f5965e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f5966f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return TextFieldScrollerPosition.f5960h;
        }

        public Companion() {
        }
    }

    public TextFieldScrollerPosition(Orientation orientation, float f2) {
        this.f5961a = PrimitiveSnapshotStateKt.a(f2);
        this.f5962b = PrimitiveSnapshotStateKt.a(0.0f);
        this.f5963c = SnapshotIntStateKt.a(0);
        this.f5964d = Rect.f15860e.a();
        this.f5965e = TextRange.f18496b.a();
        this.f5966f = SnapshotStateKt.i(orientation, SnapshotStateKt.r());
    }

    public final void b(float f2, float f3, int i2) {
        int i3;
        float d2 = d();
        float f4 = (float) i2;
        float f5 = d2 + f4;
        h(d() + ((f3 <= f5 && (f2 >= d2 || f3 - f2 <= f4)) ? (i3 >= 0 || f3 - f2 > f4) ? 0.0f : f2 - d2 : f3 - f5));
    }

    public final float c() {
        return this.f5962b.c();
    }

    public final float d() {
        return this.f5961a.c();
    }

    public final int e(long j2) {
        return TextRange.n(j2) != TextRange.n(this.f5965e) ? TextRange.n(j2) : TextRange.i(j2) != TextRange.i(this.f5965e) ? TextRange.i(j2) : TextRange.l(j2);
    }

    public final Orientation f() {
        return (Orientation) this.f5966f.getValue();
    }

    public final void g(float f2) {
        this.f5962b.j(f2);
    }

    public final void h(float f2) {
        this.f5961a.j(f2);
    }

    public final void i(long j2) {
        this.f5965e = j2;
    }

    public final void j(int i2) {
        this.f5963c.k(i2);
    }

    public final void k(Orientation orientation, Rect rect, int i2, int i3) {
        float f2 = (float) (i3 - i2);
        g(f2);
        if (!(rect.o() == this.f5964d.o() && rect.r() == this.f5964d.r())) {
            boolean z2 = orientation == Orientation.Vertical;
            b(z2 ? rect.r() : rect.o(), z2 ? rect.i() : rect.p(), i2);
            this.f5964d = rect;
        }
        h(RangesKt.n(d(), 0.0f, f2));
        j(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i2 & 2) != 0 ? 0.0f : f2);
    }
}
