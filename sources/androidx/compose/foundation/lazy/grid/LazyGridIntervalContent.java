package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f4579e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f4580f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final Function2 f4581g = LazyGridIntervalContent$Companion$DefaultSpan$1.f4586z;

    /* renamed from: a  reason: collision with root package name */
    public final LazyGridSpanLayoutProvider f4582a = new LazyGridSpanLayoutProvider(this);

    /* renamed from: b  reason: collision with root package name */
    public final MutableIntervalList f4583b = new MutableIntervalList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f4584c;

    /* renamed from: d  reason: collision with root package name */
    public MutableIntList f4585d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LazyGridIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    public void c(int i2, Function1 function1, Function2 function2, Function1 function12, Function4 function4) {
        h().b(i2, new LazyGridInterval(function1, function2 == null ? f4581g : function2, function12, function4));
        if (function2 != null) {
            this.f4584c = true;
        }
    }

    public final boolean k() {
        return this.f4584c;
    }

    public final IntList l() {
        MutableIntList mutableIntList = this.f4585d;
        return mutableIntList != null ? mutableIntList : IntListKt.a();
    }

    /* renamed from: m */
    public MutableIntervalList h() {
        return this.f4583b;
    }

    public final LazyGridSpanLayoutProvider n() {
        return this.f4582a;
    }
}
