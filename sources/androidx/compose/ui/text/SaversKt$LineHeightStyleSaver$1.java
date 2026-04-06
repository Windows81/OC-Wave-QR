package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$LineHeightStyleSaver$1 extends Lambda implements Function2<SaverScope, LineHeightStyle, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$LineHeightStyleSaver$1 f18388z = new SaversKt$LineHeightStyleSaver$1();

    public SaversKt$LineHeightStyleSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, LineHeightStyle lineHeightStyle) {
        return CollectionsKt.g(SaversKt.y(LineHeightStyle.Alignment.c(lineHeightStyle.b())), SaversKt.y(LineHeightStyle.Trim.c(lineHeightStyle.d())), SaversKt.y(LineHeightStyle.Mode.c(lineHeightStyle.c())));
    }
}
