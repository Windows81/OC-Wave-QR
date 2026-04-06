package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
public final class SlidingWindowKt$windowedSequence$$inlined$Sequence$1 implements Sequence<List<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Sequence f40638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f40639b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f40640c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f40641d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f40642e;

    public Iterator iterator() {
        return SlidingWindowKt.b(this.f40638a.iterator(), this.f40639b, this.f40640c, this.f40641d, this.f40642e);
    }
}
