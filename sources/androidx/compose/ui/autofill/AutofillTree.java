package androidx.compose.ui.autofill;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
@Deprecated
public final class AutofillTree {

    /* renamed from: a  reason: collision with root package name */
    public final Map f15587a = new LinkedHashMap();

    public final Map a() {
        return this.f15587a;
    }

    public final Unit b(int i2, String str) {
        Function1 c2;
        AutofillNode autofillNode = (AutofillNode) this.f15587a.get(Integer.valueOf(i2));
        if (autofillNode == null || (c2 = autofillNode.c()) == null) {
            return null;
        }
        c2.invoke(str);
        return Unit.f40552a;
    }
}
