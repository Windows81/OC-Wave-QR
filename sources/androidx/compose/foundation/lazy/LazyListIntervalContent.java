package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

@Metadata
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntervalList f4360a = new MutableIntervalList();

    /* renamed from: b  reason: collision with root package name */
    public MutableIntList f4361b;

    public LazyListIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    public void a(Object obj, Object obj2, Function3 function3) {
        h().b(1, new LazyListInterval(obj != null ? new LazyListIntervalContent$item$1(obj) : null, new LazyListIntervalContent$item$2(obj2), ComposableLambdaKt.c(-1010194746, true, new LazyListIntervalContent$item$3(function3))));
    }

    public void d(int i2, Function1 function1, Function1 function12, Function4 function4) {
        h().b(i2, new LazyListInterval(function1, function12, function4));
    }

    public final IntList k() {
        MutableIntList mutableIntList = this.f4361b;
        return mutableIntList != null ? mutableIntList : IntListKt.a();
    }

    /* renamed from: l */
    public MutableIntervalList h() {
        return this.f4360a;
    }
}
