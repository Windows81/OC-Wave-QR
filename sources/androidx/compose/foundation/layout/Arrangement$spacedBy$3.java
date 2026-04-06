package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Arrangement$spacedBy$3 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f3770z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Arrangement$spacedBy$3(Alignment.Vertical vertical) {
        super(2);
        this.f3770z = vertical;
    }

    public final Integer b(int i2, LayoutDirection layoutDirection) {
        return Integer.valueOf(this.f3770z.a(0, i2));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((Number) obj).intValue(), (LayoutDirection) obj2);
    }
}
