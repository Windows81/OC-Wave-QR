package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SuspendingPointerInputFilterKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PointerEvent f16948a = new PointerEvent(CollectionsKt.m());

    public static final SuspendingPointerInputModifierNode a(PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    public static final Modifier c(Modifier modifier, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.o0(new SuspendPointerInputElement(obj, (Object) null, (Object[]) null, pointerInputEventHandler, 6, (DefaultConstructorMarker) null));
    }

    public static final Modifier d(Modifier modifier, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.o0(new SuspendPointerInputElement(obj, obj2, (Object[]) null, pointerInputEventHandler, 4, (DefaultConstructorMarker) null));
    }
}
