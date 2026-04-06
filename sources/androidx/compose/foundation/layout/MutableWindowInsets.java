package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class MutableWindowInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f4084b;

    public int a(Density density) {
        return e().a(density);
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return e().b(density, layoutDirection);
    }

    public int c(Density density) {
        return e().c(density);
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return e().d(density, layoutDirection);
    }

    public final WindowInsets e() {
        return (WindowInsets) this.f4084b.getValue();
    }
}
