package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Arrangement$spacedBy$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final Arrangement$spacedBy$1 f3768z = new Arrangement$spacedBy$1();

    public Arrangement$spacedBy$1() {
        super(2);
    }

    public final Integer b(int i2, LayoutDirection layoutDirection) {
        return Integer.valueOf(Alignment.f15444a.k().a(0, i2, layoutDirection));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((Number) obj).intValue(), (LayoutDirection) obj2);
    }
}
