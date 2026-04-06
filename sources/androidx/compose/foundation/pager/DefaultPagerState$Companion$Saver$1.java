package androidx.compose.foundation.pager;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class DefaultPagerState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DefaultPagerState, List<? extends Object>> {

    /* renamed from: z  reason: collision with root package name */
    public static final DefaultPagerState$Companion$Saver$1 f5227z = new DefaultPagerState$Companion$Saver$1();

    public DefaultPagerState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final List m(SaverScope saverScope, DefaultPagerState defaultPagerState) {
        return CollectionsKt.p(Integer.valueOf(defaultPagerState.v()), Float.valueOf(RangesKt.n(defaultPagerState.w(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.H()));
    }
}
