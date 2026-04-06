package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class CombinedAlignment implements Alignment {

    /* renamed from: b  reason: collision with root package name */
    public final Alignment.Horizontal f15468b;

    /* renamed from: c  reason: collision with root package name */
    public final Alignment.Vertical f15469c;

    public long a(long j2, long j3, LayoutDirection layoutDirection) {
        return IntOffset.f((((long) this.f15468b.a((int) (j2 >> 32), (int) (j3 >> 32), layoutDirection)) << 32) | (((long) this.f15469c.a((int) (j2 & 4294967295L), (int) (j3 & 4294967295L))) & 4294967295L));
    }
}
