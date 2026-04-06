package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;

@Metadata
public final class FlowKt__CollectKt$collectIndexed$2 implements FlowCollector<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f41590A;

    /* renamed from: z  reason: collision with root package name */
    public int f41591z;

    public Object c(Object obj, Continuation continuation) {
        Function3 function3 = this.f41590A;
        int i2 = this.f41591z;
        this.f41591z = i2 + 1;
        if (i2 >= 0) {
            Object d2 = function3.d(Boxing.c(i2), obj, continuation);
            return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
}
