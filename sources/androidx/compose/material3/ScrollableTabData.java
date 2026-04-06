package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
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
    public final ScrollState f10779a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineScope f10780b;

    /* renamed from: c  reason: collision with root package name */
    public final FiniteAnimationSpec f10781c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f10782d;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope, FiniteAnimationSpec finiteAnimationSpec) {
        this.f10779a = scrollState;
        this.f10780b = coroutineScope;
        this.f10781c = finiteAnimationSpec;
    }

    public final int c(TabPosition tabPosition, Density density, int i2, List list) {
        int P1 = density.P1(((TabPosition) CollectionsKt.p0(list)).c()) + i2;
        int m2 = P1 - this.f10779a.m();
        return RangesKt.o(density.P1(tabPosition.b()) - ((m2 / 2) - (density.P1(tabPosition.d()) / 2)), 0, RangesKt.e(P1 - m2, 0));
    }

    public final void d(Density density, int i2, List list, int i3) {
        int c2;
        Integer num = this.f10782d;
        if (num == null || num.intValue() != i3) {
            this.f10782d = Integer.valueOf(i3);
            TabPosition tabPosition = (TabPosition) CollectionsKt.h0(list, i3);
            if (tabPosition != null && this.f10779a.n() != (c2 = c(tabPosition, density, i2, list))) {
                Job unused = BuildersKt__Builders_commonKt.d(this.f10780b, (CoroutineContext) null, (CoroutineStart) null, new ScrollableTabData$onLaidOut$1$1(this, c2, (Continuation) null), 3, (Object) null);
            }
        }
    }
}
