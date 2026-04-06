package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$OffsetSaver$2 extends Lambda implements Function1<Object, Offset> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$OffsetSaver$2 f18399z = new SaversKt$OffsetSaver$2();

    public SaversKt$OffsetSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final Offset invoke(Object obj) {
        if (Intrinsics.d(obj, Boolean.FALSE)) {
            return Offset.d(Offset.f15855b.b());
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = null;
        Float f3 = obj2 != null ? (Float) obj2 : null;
        Intrinsics.f(f3);
        float floatValue = f3.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f2 = (Float) obj3;
        }
        Intrinsics.f(f2);
        return Offset.d(Offset.e((((long) Float.floatToRawIntBits(floatValue)) << 32) | (((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L)));
    }
}
