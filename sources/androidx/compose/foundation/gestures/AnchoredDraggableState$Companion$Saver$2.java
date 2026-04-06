package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnchoredDraggableState$Companion$Saver$2 extends Lambda implements Function1<Object, AnchoredDraggableState<Object>> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnchoredDraggableState$Companion$Saver$2 f3373z = new AnchoredDraggableState$Companion$Saver$2();

    public AnchoredDraggableState$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: b */
    public final AnchoredDraggableState invoke(Object obj) {
        return new AnchoredDraggableState(obj);
    }
}
