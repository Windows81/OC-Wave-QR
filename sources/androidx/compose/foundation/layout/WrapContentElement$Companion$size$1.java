package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WrapContentElement$Companion$size$1 extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Alignment f4294z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$size$1(Alignment alignment) {
        super(2);
        this.f4294z = alignment;
    }

    public final long b(long j2, LayoutDirection layoutDirection) {
        return this.f4294z.a(IntSize.f19170b.a(), j2, layoutDirection);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return IntOffset.c(b(((IntSize) obj).j(), (LayoutDirection) obj2));
    }
}
