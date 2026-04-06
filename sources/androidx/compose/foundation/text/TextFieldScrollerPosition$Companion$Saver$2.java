package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldScrollerPosition$Companion$Saver$2 extends Lambda implements Function1<List<? extends Object>, TextFieldScrollerPosition> {

    /* renamed from: z  reason: collision with root package name */
    public static final TextFieldScrollerPosition$Companion$Saver$2 f5968z = new TextFieldScrollerPosition$Companion$Saver$2();

    public TextFieldScrollerPosition$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: b */
    public final TextFieldScrollerPosition invoke(List list) {
        Object obj = list.get(1);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
        Object obj2 = list.get(0);
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
    }
}
