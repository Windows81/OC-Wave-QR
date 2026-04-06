package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ColorSaver$2 extends Lambda implements Function1<Object, Color> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ColorSaver$2 f18385z = new SaversKt$ColorSaver$2();

    public SaversKt$ColorSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final Color invoke(Object obj) {
        if (Intrinsics.d(obj, Boolean.FALSE)) {
            return Color.h(Color.f15975b.f());
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return Color.h(ColorKt.b(((Integer) obj).intValue()));
    }
}
