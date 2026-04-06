package androidx.compose.foundation.text.selection;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7040z;

    public /* synthetic */ f(Function2 function2) {
        this.f7040z = function2;
    }

    public final int compare(Object obj, Object obj2) {
        return SelectionRegistrarImpl.x(this.f7040z, obj, obj2);
    }
}
