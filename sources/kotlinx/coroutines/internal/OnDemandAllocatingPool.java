package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class OnDemandAllocatingPool<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41861b = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f41862a;
    private volatile /* synthetic */ int controlState$volatile;

    public final /* synthetic */ AtomicReferenceArray b() {
        return this.f41862a;
    }

    public final String c() {
        int i2 = f41861b.get(this);
        IntRange v2 = RangesKt.v(0, Integer.MAX_VALUE & i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(v2, 10));
        Iterator it = v2.iterator();
        while (it.hasNext()) {
            arrayList.add(b().get(((IntIterator) it).b()));
        }
        String obj = arrayList.toString();
        String str = (i2 & Integer.MIN_VALUE) != 0 ? "[closed]" : "";
        return obj + str;
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + c() + ')';
    }
}
