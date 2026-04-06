package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ShadowSaver$2 extends Lambda implements Function1<Object, Shadow> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ShadowSaver$2 f18403z = new SaversKt$ShadowSaver$2();

    public SaversKt$ShadowSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final Shadow invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver k2 = SaversKt.k(Color.f15975b);
        Boolean bool = Boolean.FALSE;
        Float f2 = null;
        Color color = ((!Intrinsics.d(obj2, bool) || (k2 instanceof NonNullValueClassSaver)) && obj2 != null) ? (Color) k2.a(obj2) : null;
        Intrinsics.f(color);
        long v2 = color.v();
        Object obj3 = list.get(1);
        Saver j2 = SaversKt.j(Offset.f15855b);
        Offset offset = ((!Intrinsics.d(obj3, bool) || (j2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (Offset) j2.a(obj3) : null;
        Intrinsics.f(offset);
        long t2 = offset.t();
        Object obj4 = list.get(2);
        if (obj4 != null) {
            f2 = (Float) obj4;
        }
        Intrinsics.f(f2);
        return new Shadow(v2, t2, f2.floatValue(), (DefaultConstructorMarker) null);
    }
}
