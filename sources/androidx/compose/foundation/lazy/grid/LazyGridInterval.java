package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f4575a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f4576b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f4577c;

    /* renamed from: d  reason: collision with root package name */
    public final Function4 f4578d;

    public LazyGridInterval(Function1 function1, Function2 function2, Function1 function12, Function4 function4) {
        this.f4575a = function1;
        this.f4576b = function2;
        this.f4577c = function12;
        this.f4578d = function4;
    }

    public final Function4 a() {
        return this.f4578d;
    }

    public final Function2 b() {
        return this.f4576b;
    }

    public Function1 getKey() {
        return this.f4575a;
    }

    public Function1 getType() {
        return this.f4577c;
    }
}
