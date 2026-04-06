package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextUndoOperation$Companion$Saver$1 implements Saver<TextUndoOperation, Object> {
    /* renamed from: c */
    public TextUndoOperation a(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = list.get(2);
        Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.String");
        Object obj5 = list.get(3);
        Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        Intrinsics.g(obj6, "null cannot be cast to non-null type kotlin.Int");
        long b2 = TextRangeKt.b(intValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        Intrinsics.g(obj7, "null cannot be cast to non-null type kotlin.Int");
        int intValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        Intrinsics.g(obj8, "null cannot be cast to non-null type kotlin.Int");
        long b3 = TextRangeKt.b(intValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        Intrinsics.g(obj9, "null cannot be cast to non-null type kotlin.Long");
        return new TextUndoOperation(intValue, (String) obj3, (String) obj4, b2, b3, ((Long) obj9).longValue(), false, 64, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public Object b(SaverScope saverScope, TextUndoOperation textUndoOperation) {
        return CollectionsKt.p(Integer.valueOf(textUndoOperation.d()), textUndoOperation.h(), textUndoOperation.f(), Integer.valueOf(TextRange.n(textUndoOperation.g())), Integer.valueOf(TextRange.i(textUndoOperation.g())), Integer.valueOf(TextRange.n(textUndoOperation.e())), Integer.valueOf(TextRange.i(textUndoOperation.e())), Long.valueOf(textUndoOperation.j()));
    }
}
