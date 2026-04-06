package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$LocaleSaver$1 extends Lambda implements Function2<SaverScope, Locale, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$LocaleSaver$1 f18394z = new SaversKt$LocaleSaver$1();

    public SaversKt$LocaleSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, Locale locale) {
        return locale.b();
    }
}
