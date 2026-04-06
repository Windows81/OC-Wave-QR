package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;

@Metadata
final class Api34PerformHandwritingGestureImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api34PerformHandwritingGestureImpl f6125a = new Api34PerformHandwritingGestureImpl();

    public static final void c(IntConsumer intConsumer, int i2) {
        intConsumer.accept(i2);
    }

    public final void b(TextInputSession textInputSession, HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int f2 = textInputSession.f(handwritingGesture);
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new C0015d(intConsumer, f2));
            } else {
                intConsumer.accept(f2);
            }
        }
    }

    public final boolean d(TextInputSession textInputSession, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        return textInputSession.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
