package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata
public final class LazyListInterval implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f4357a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f4358b;

    /* renamed from: c  reason: collision with root package name */
    public final Function4 f4359c;

    public LazyListInterval(Function1 function1, Function1 function12, Function4 function4) {
        this.f4357a = function1;
        this.f4358b = function12;
        this.f4359c = function4;
    }

    public final Function4 a() {
        return this.f4359c;
    }

    public Function1 getKey() {
        return this.f4357a;
    }

    public Function1 getType() {
        return this.f4358b;
    }
}
