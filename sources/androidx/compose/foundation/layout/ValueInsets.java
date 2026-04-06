package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ValueInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final String f4203b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f4204c;

    public ValueInsets(InsetsValues insetsValues, String str) {
        this.f4203b = str;
        this.f4204c = SnapshotStateKt__SnapshotStateKt.e(insetsValues, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public int a(Density density) {
        return e().d();
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return e().c();
    }

    public int c(Density density) {
        return e().a();
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return e().b();
    }

    public final InsetsValues e() {
        return (InsetsValues) this.f4204c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueInsets)) {
            return false;
        }
        return Intrinsics.d(e(), ((ValueInsets) obj).e());
    }

    public final void f(InsetsValues insetsValues) {
        this.f4204c.setValue(insetsValues);
    }

    public int hashCode() {
        return this.f4203b.hashCode();
    }

    public String toString() {
        return this.f4203b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
