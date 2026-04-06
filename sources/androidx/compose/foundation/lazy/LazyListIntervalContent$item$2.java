package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListIntervalContent$item$2 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f4363z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListIntervalContent$item$2(Object obj) {
        super(1);
        this.f4363z = obj;
    }

    public final Object b(int i2) {
        return this.f4363z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
