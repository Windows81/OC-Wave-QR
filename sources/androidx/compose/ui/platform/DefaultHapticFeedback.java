package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.Metadata;

@Metadata
public final class DefaultHapticFeedback implements HapticFeedback {

    /* renamed from: a  reason: collision with root package name */
    public final View f17730a;

    public DefaultHapticFeedback(View view) {
        this.f17730a = view;
    }

    public void a(int i2) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.f16726b;
        if (HapticFeedbackType.c(i2, companion.a())) {
            this.f17730a.performHapticFeedback(16);
        } else if (HapticFeedbackType.c(i2, companion.b())) {
            this.f17730a.performHapticFeedback(6);
        } else if (HapticFeedbackType.c(i2, companion.c())) {
            this.f17730a.performHapticFeedback(13);
        } else if (HapticFeedbackType.c(i2, companion.d())) {
            this.f17730a.performHapticFeedback(23);
        } else if (HapticFeedbackType.c(i2, companion.e())) {
            this.f17730a.performHapticFeedback(0);
        } else if (HapticFeedbackType.c(i2, companion.f())) {
            this.f17730a.performHapticFeedback(17);
        } else if (HapticFeedbackType.c(i2, companion.g())) {
            this.f17730a.performHapticFeedback(27);
        } else if (HapticFeedbackType.c(i2, companion.h())) {
            this.f17730a.performHapticFeedback(26);
        } else if (HapticFeedbackType.c(i2, companion.i())) {
            this.f17730a.performHapticFeedback(9);
        } else if (HapticFeedbackType.c(i2, companion.j())) {
            this.f17730a.performHapticFeedback(22);
        } else if (HapticFeedbackType.c(i2, companion.k())) {
            this.f17730a.performHapticFeedback(21);
        } else if (HapticFeedbackType.c(i2, companion.l())) {
            this.f17730a.performHapticFeedback(1);
        }
    }
}
