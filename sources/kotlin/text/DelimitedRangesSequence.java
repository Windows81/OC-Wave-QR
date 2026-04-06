package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

@Metadata
final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f41126a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41127b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41128c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f41129d;

    public DelimitedRangesSequence(CharSequence charSequence, int i2, int i3, Function2 function2) {
        Intrinsics.i(charSequence, "input");
        Intrinsics.i(function2, "getNextMatch");
        this.f41126a = charSequence;
        this.f41127b = i2;
        this.f41128c = i3;
        this.f41129d = function2;
    }

    public Iterator iterator() {
        return new DelimitedRangesSequence$iterator$1(this);
    }
}
