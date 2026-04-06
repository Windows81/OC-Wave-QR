package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WrapContentElement$Companion$width$1 extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f4295z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$width$1(Alignment.Horizontal horizontal) {
        super(2);
        this.f4295z = horizontal;
    }

    public final long b(long j2, LayoutDirection layoutDirection) {
        return IntOffset.f((((long) 0) & 4294967295L) | (((long) this.f4295z.a(0, (int) (j2 >> 32), layoutDirection)) << 32));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return IntOffset.c(b(((IntSize) obj).j(), (LayoutDirection) obj2));
    }
}
