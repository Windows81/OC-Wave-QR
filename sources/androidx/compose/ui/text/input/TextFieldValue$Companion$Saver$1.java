package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldValue$Companion$Saver$1 extends Lambda implements Function2<SaverScope, TextFieldValue, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final TextFieldValue$Companion$Saver$1 f18897z = new TextFieldValue$Companion$Saver$1();

    public TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, TextFieldValue textFieldValue) {
        return CollectionsKt.g(SaversKt.z(textFieldValue.f(), SaversKt.h(), saverScope), SaversKt.z(TextRange.b(textFieldValue.h()), SaversKt.m(TextRange.f18496b), saverScope));
    }
}
