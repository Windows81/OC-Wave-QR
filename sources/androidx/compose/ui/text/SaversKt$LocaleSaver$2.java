package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$LocaleSaver$2 extends Lambda implements Function1<Object, Locale> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$LocaleSaver$2 f18395z = new SaversKt$LocaleSaver$2();

    public SaversKt$LocaleSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final Locale invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
        return new Locale((String) obj);
    }
}
