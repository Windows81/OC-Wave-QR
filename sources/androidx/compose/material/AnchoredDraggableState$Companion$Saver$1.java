package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnchoredDraggableState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, AnchoredDraggableState<Object>, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnchoredDraggableState$Companion$Saver$1 f7103z = new AnchoredDraggableState$Companion$Saver$1();

    public AnchoredDraggableState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, AnchoredDraggableState anchoredDraggableState) {
        return anchoredDraggableState.s();
    }
}
