package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WrapContentElement$Companion$height$1 extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f4293z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$height$1(Alignment.Vertical vertical) {
        super(2);
        this.f4293z = vertical;
    }

    public final long b(long j2, LayoutDirection layoutDirection) {
        return IntOffset.f((((long) 0) << 32) | (4294967295L & ((long) this.f4293z.a(0, (int) (j2 & 4294967295L)))));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return IntOffset.c(b(((IntSize) obj).j(), (LayoutDirection) obj2));
    }
}
