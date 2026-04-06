package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldScrollerPosition$Companion$Saver$1 extends Lambda implements Function2<SaverScope, TextFieldScrollerPosition, List<? extends Object>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TextFieldScrollerPosition$Companion$Saver$1 f5967z = new TextFieldScrollerPosition$Companion$Saver$1();

    public TextFieldScrollerPosition$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final List m(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
        return CollectionsKt.p(Float.valueOf(textFieldScrollerPosition.d()), Boolean.valueOf(textFieldScrollerPosition.f() == Orientation.Vertical));
    }
}
