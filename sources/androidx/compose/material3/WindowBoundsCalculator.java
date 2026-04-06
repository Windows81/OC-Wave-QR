package androidx.compose.material3;

import android.view.View;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

@Metadata
public final class WindowBoundsCalculator {

    /* renamed from: a  reason: collision with root package name */
    public final View f11783a;

    public WindowBoundsCalculator(View view) {
        this.f11783a = view;
    }

    public final IntRect a() {
        return ExposedDropdownMenu_androidKt.j(this.f11783a);
    }
}
