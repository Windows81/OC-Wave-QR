package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextDecorationSaver$2 extends Lambda implements Function1<Object, TextDecoration> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextDecorationSaver$2 f18407z = new SaversKt$TextDecorationSaver$2();

    public SaversKt$TextDecorationSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final TextDecoration invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return new TextDecoration(((Integer) obj).intValue());
    }
}
