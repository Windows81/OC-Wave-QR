package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class LongPressResult {

    @Metadata
    public static final class Canceled extends LongPressResult {

        /* renamed from: a  reason: collision with root package name */
        public static final Canceled f3523a = new Canceled();

        public Canceled() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class Released extends LongPressResult {

        /* renamed from: a  reason: collision with root package name */
        public final PointerInputChange f3524a;

        public Released(PointerInputChange pointerInputChange) {
            super((DefaultConstructorMarker) null);
            this.f3524a = pointerInputChange;
        }

        public final PointerInputChange a() {
            return this.f3524a;
        }
    }

    @Metadata
    public static final class Success extends LongPressResult {

        /* renamed from: a  reason: collision with root package name */
        public static final Success f3525a = new Success();

        public Success() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ LongPressResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public LongPressResult() {
    }
}
