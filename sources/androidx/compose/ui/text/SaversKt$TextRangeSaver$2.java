package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextRangeSaver$2 extends Lambda implements Function1<Object, TextRange> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextRangeSaver$2 f18415z = new SaversKt$TextRangeSaver$2();

    public SaversKt$TextRangeSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final TextRange invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = null;
        Integer num2 = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.f(num2);
        int intValue = num2.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num = (Integer) obj3;
        }
        Intrinsics.f(num);
        return TextRange.b(TextRangeKt.b(intValue, num.intValue()));
    }
}
