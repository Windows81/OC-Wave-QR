package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1[] f40705z;

    public /* synthetic */ a(Function1[] function1Arr) {
        this.f40705z = function1Arr;
    }

    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt__ComparisonsKt.c(this.f40705z, obj, obj2);
    }
}
