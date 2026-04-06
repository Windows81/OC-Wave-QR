package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {

    /* renamed from: a  reason: collision with root package name */
    public final Function4 f5294a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f5295b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5296c;

    /* renamed from: d  reason: collision with root package name */
    public final IntervalList f5297d;

    public PagerLayoutIntervalContent(Function4 function4, Function1 function1, int i2) {
        this.f5294a = function4;
        this.f5295b = function1;
        this.f5296c = i2;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.b(i2, new PagerIntervalContent(function1, function4));
        this.f5297d = mutableIntervalList;
    }

    public IntervalList h() {
        return this.f5297d;
    }
}
