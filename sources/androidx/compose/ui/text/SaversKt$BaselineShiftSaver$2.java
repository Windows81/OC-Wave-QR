package androidx.compose.ui.text;

import androidx.compose.ui.text.style.BaselineShift;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$BaselineShiftSaver$2 extends Lambda implements Function1<Object, BaselineShift> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$BaselineShiftSaver$2 f18381z = new SaversKt$BaselineShiftSaver$2();

    public SaversKt$BaselineShiftSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final BaselineShift invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Float");
        return BaselineShift.d(BaselineShift.e(((Float) obj).floatValue()));
    }
}
