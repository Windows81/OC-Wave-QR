package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class Api34LegacyPerformHandwritingGestureImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api34LegacyPerformHandwritingGestureImpl f6124a = new Api34LegacyPerformHandwritingGestureImpl();

    public static final void c(IntConsumer intConsumer, int i2) {
        intConsumer.accept(i2);
    }

    public final void b(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, HandwritingGesture handwritingGesture, ViewConfiguration viewConfiguration, Executor executor, IntConsumer intConsumer, Function1 function1) {
        int l2 = legacyTextFieldState != null ? HandwritingGestureApi34.f6190a.l(legacyTextFieldState, handwritingGesture, textFieldSelectionManager, viewConfiguration, function1) : 3;
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new C0014c(intConsumer, l2));
            } else {
                intConsumer.accept(l2);
            }
        }
    }

    public final boolean d(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return HandwritingGestureApi34.f6190a.D(legacyTextFieldState, previewableHandwritingGesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}
