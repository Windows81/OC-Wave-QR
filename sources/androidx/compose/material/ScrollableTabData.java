package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class ScrollableTabData {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollState f8294a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineScope f8295b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f8296c;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        this.f8294a = scrollState;
        this.f8295b = coroutineScope;
    }

    public final int b(TabPosition tabPosition, Density density, int i2, List list) {
        int P1 = density.P1(((TabPosition) CollectionsKt.p0(list)).b()) + i2;
        int m2 = P1 - this.f8294a.m();
        return RangesKt.o(density.P1(tabPosition.a()) - ((m2 / 2) - (density.P1(tabPosition.c()) / 2)), 0, RangesKt.e(P1 - m2, 0));
    }

    public final void c(Density density, int i2, List list, int i3) {
        int b2;
        Integer num = this.f8296c;
        if (num == null || num.intValue() != i3) {
            this.f8296c = Integer.valueOf(i3);
            TabPosition tabPosition = (TabPosition) CollectionsKt.h0(list, i3);
            if (tabPosition != null && this.f8294a.n() != (b2 = b(tabPosition, density, i2, list))) {
                Job unused = BuildersKt__Builders_commonKt.d(this.f8295b, (CoroutineContext) null, (CoroutineStart) null, new ScrollableTabData$onLaidOut$1$1(this, b2, (Continuation) null), 3, (Object) null);
            }
        }
    }
}
