package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;

@Metadata
public final class AndroidWindowInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final int f3735b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3736c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f3737d = SnapshotStateKt__SnapshotStateKt.e(Insets.f19773e, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f3738e = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);

    public AndroidWindowInsets(int i2, String str) {
        this.f3735b = i2;
        this.f3736c = str;
    }

    public int a(Density density) {
        return e().f19775b;
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return e().f19776c;
    }

    public int c(Density density) {
        return e().f19777d;
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return e().f19774a;
    }

    public final Insets e() {
        return (Insets) this.f3737d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidWindowInsets)) {
            return false;
        }
        return this.f3735b == ((AndroidWindowInsets) obj).f3735b;
    }

    public final int f() {
        return this.f3735b;
    }

    public final boolean g() {
        return ((Boolean) this.f3738e.getValue()).booleanValue();
    }

    public final void h(Insets insets) {
        this.f3737d.setValue(insets);
    }

    public int hashCode() {
        return this.f3735b;
    }

    public final void i(boolean z2) {
        this.f3738e.setValue(Boolean.valueOf(z2));
    }

    public final void j(WindowInsetsCompat windowInsetsCompat, int i2) {
        if (i2 == 0 || (i2 & this.f3735b) != 0) {
            h(windowInsetsCompat.f(this.f3735b));
            i(windowInsetsCompat.q(this.f3735b));
        }
    }

    public String toString() {
        return this.f3736c + '(' + e().f19774a + ", " + e().f19775b + ", " + e().f19776c + ", " + e().f19777d + ')';
    }
}
