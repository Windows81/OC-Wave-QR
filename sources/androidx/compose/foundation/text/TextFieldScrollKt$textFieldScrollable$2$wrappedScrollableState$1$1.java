package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 implements ScrollableState {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScrollableState f5954a;

    /* renamed from: b  reason: collision with root package name */
    public final State f5955b;

    /* renamed from: c  reason: collision with root package name */
    public final State f5956c;

    public TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1(ScrollableState scrollableState, TextFieldScrollerPosition textFieldScrollerPosition) {
        this.f5954a = scrollableState;
        this.f5955b = SnapshotStateKt.e(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2(textFieldScrollerPosition));
        this.f5956c = SnapshotStateKt.e(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2(textFieldScrollerPosition));
    }

    public boolean a() {
        return this.f5954a.a();
    }

    public float b(float f2) {
        return this.f5954a.b(f2);
    }

    public boolean d() {
        return ((Boolean) this.f5956c.getValue()).booleanValue();
    }

    public Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        return this.f5954a.e(mutatePriority, function2, continuation);
    }

    public boolean f() {
        return ((Boolean) this.f5955b.getValue()).booleanValue();
    }
}
