package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextDecorationSaver$1 extends Lambda implements Function2<SaverScope, TextDecoration, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextDecorationSaver$1 f18406z = new SaversKt$TextDecorationSaver$1();

    public SaversKt$TextDecorationSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, TextDecoration textDecoration) {
        return Integer.valueOf(textDecoration.e());
    }
}
