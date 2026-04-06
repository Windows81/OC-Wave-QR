package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextMotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Savers_androidKt$TextMotionSaver$2 extends Lambda implements Function1<Object, TextMotion> {

    /* renamed from: z  reason: collision with root package name */
    public static final Savers_androidKt$TextMotionSaver$2 f18430z = new Savers_androidKt$TextMotionSaver$2();

    public Savers_androidKt$TextMotionSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final TextMotion invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextMotion.Linearity linearity = obj2 != null ? (TextMotion.Linearity) obj2 : null;
        Intrinsics.f(linearity);
        int j2 = linearity.j();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        Intrinsics.f(bool);
        return new TextMotion(j2, bool.booleanValue(), (DefaultConstructorMarker) null);
    }
}
