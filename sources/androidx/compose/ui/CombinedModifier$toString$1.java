package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CombinedModifier$toString$1 extends Lambda implements Function2<String, Modifier.Element, String> {

    /* renamed from: z  reason: collision with root package name */
    public static final CombinedModifier$toString$1 f15472z = new CombinedModifier$toString$1();

    public CombinedModifier$toString$1() {
        super(2);
    }

    /* renamed from: b */
    public final String m(String str, Modifier.Element element) {
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
