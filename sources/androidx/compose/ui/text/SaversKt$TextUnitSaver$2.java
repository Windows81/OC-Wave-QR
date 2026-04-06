package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$TextUnitSaver$2 extends Lambda implements Function1<Object, TextUnit> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$TextUnitSaver$2 f18417z = new SaversKt$TextUnitSaver$2();

    public SaversKt$TextUnitSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final TextUnit invoke(Object obj) {
        if (Intrinsics.d(obj, Boolean.FALSE)) {
            return TextUnit.b(TextUnit.f19177b.a());
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType textUnitType = null;
        Float f2 = obj2 != null ? (Float) obj2 : null;
        Intrinsics.f(f2);
        float floatValue = f2.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            textUnitType = (TextUnitType) obj3;
        }
        Intrinsics.f(textUnitType);
        return TextUnit.b(TextUnitKt.a(floatValue, textUnitType.j()));
    }
}
