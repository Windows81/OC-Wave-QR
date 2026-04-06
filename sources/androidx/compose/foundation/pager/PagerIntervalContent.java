package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f5269a;

    /* renamed from: b  reason: collision with root package name */
    public final Function4 f5270b;

    public PagerIntervalContent(Function1 function1, Function4 function4) {
        this.f5269a = function1;
        this.f5270b = function4;
    }

    public final Function4 a() {
        return this.f5270b;
    }

    public Function1 getKey() {
        return this.f5269a;
    }
}
