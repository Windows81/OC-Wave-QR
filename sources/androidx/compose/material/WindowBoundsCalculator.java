package androidx.compose.material;

import android.view.View;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

@Metadata
public final class WindowBoundsCalculator {

    /* renamed from: a  reason: collision with root package name */
    public final View f8943a;

    public WindowBoundsCalculator(View view) {
        this.f8943a = view;
    }

    public final IntRect a() {
        return ExposedDropdownMenu_android.c(this.f8943a);
    }
}
