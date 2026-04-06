package androidx.compose.ui.text;

import androidx.compose.ui.text.style.LineHeightStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$LineHeightStyleSaver$2 extends Lambda implements Function1<Object, LineHeightStyle> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$LineHeightStyleSaver$2 f18389z = new SaversKt$LineHeightStyleSaver$2();

    public SaversKt$LineHeightStyleSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final LineHeightStyle invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        LineHeightStyle.Alignment alignment = obj2 != null ? (LineHeightStyle.Alignment) obj2 : null;
        Intrinsics.f(alignment);
        float i2 = alignment.i();
        Object obj3 = list.get(1);
        LineHeightStyle.Trim trim = obj3 != null ? (LineHeightStyle.Trim) obj3 : null;
        Intrinsics.f(trim);
        int k2 = trim.k();
        Object obj4 = list.get(2);
        LineHeightStyle.Mode mode = obj4 != null ? (LineHeightStyle.Mode) obj4 : null;
        Intrinsics.f(mode);
        return new LineHeightStyle(i2, k2, mode.i(), (DefaultConstructorMarker) null);
    }
}
