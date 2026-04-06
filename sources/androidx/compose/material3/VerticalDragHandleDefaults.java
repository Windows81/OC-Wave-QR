package androidx.compose.material3;

import androidx.compose.material3.tokens.DragHandleTokens;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VerticalDragHandleDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final VerticalDragHandleDefaults f11718a = new VerticalDragHandleDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final DragHandleSizes f11719b;

    static {
        DragHandleTokens dragHandleTokens = DragHandleTokens.f13062a;
        f11719b = new DragHandleSizes(DpKt.b(dragHandleTokens.f(), dragHandleTokens.c()), DpKt.b(dragHandleTokens.e(), dragHandleTokens.d()), DpKt.b(dragHandleTokens.b(), dragHandleTokens.a()), (DefaultConstructorMarker) null);
    }
}
