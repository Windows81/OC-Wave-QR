package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SwipeToDismissBoxState {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11225b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11226c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final AnchoredDraggableState f11227a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final SwipeToDismissBoxValue a() {
        return (b() != 0.0f && !Float.isNaN(b())) ? b() > 0.0f ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart : SwipeToDismissBoxValue.Settled;
    }

    public final float b() {
        return this.f11227a.r();
    }

    public final SwipeToDismissBoxValue c() {
        return (SwipeToDismissBoxValue) this.f11227a.t();
    }
}
