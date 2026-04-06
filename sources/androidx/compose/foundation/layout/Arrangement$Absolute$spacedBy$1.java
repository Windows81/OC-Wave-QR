package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class Arrangement$Absolute$spacedBy$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f3756z;

    public final Integer b(int i2, LayoutDirection layoutDirection) {
        return Integer.valueOf(this.f3756z.a(0, i2, layoutDirection));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((Number) obj).intValue(), (LayoutDirection) obj2);
    }
}
