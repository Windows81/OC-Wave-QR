package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.Metadata;

@Metadata
public final class PlatformHapticFeedback implements HapticFeedback {

    /* renamed from: a  reason: collision with root package name */
    public final View f16728a;

    public PlatformHapticFeedback(View view) {
        this.f16728a = view;
    }

    public void a(int i2) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.f16726b;
        if (HapticFeedbackType.c(i2, companion.a())) {
            this.f16728a.performHapticFeedback(16);
        } else if (HapticFeedbackType.c(i2, companion.b())) {
            this.f16728a.performHapticFeedback(6);
        } else if (HapticFeedbackType.c(i2, companion.c())) {
            this.f16728a.performHapticFeedback(13);
        } else if (HapticFeedbackType.c(i2, companion.d())) {
            this.f16728a.performHapticFeedback(23);
        } else if (HapticFeedbackType.c(i2, companion.e())) {
            this.f16728a.performHapticFeedback(0);
        } else if (HapticFeedbackType.c(i2, companion.f())) {
            this.f16728a.performHapticFeedback(17);
        } else if (HapticFeedbackType.c(i2, companion.g())) {
            this.f16728a.performHapticFeedback(27);
        } else if (HapticFeedbackType.c(i2, companion.h())) {
            this.f16728a.performHapticFeedback(26);
        } else if (HapticFeedbackType.c(i2, companion.i())) {
            this.f16728a.performHapticFeedback(9);
        } else if (HapticFeedbackType.c(i2, companion.j())) {
            this.f16728a.performHapticFeedback(22);
        } else if (HapticFeedbackType.c(i2, companion.k())) {
            this.f16728a.performHapticFeedback(21);
        } else if (HapticFeedbackType.c(i2, companion.l())) {
            this.f16728a.performHapticFeedback(1);
        }
    }
}
