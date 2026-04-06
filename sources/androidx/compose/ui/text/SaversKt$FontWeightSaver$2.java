package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$FontWeightSaver$2 extends Lambda implements Function1<Object, FontWeight> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$FontWeightSaver$2 f18387z = new SaversKt$FontWeightSaver$2();

    public SaversKt$FontWeightSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final FontWeight invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return new FontWeight(((Integer) obj).intValue());
    }
}
