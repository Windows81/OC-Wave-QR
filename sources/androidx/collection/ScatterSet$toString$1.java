package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScatterSet$toString$1 extends Lambda implements Function1<E, CharSequence> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScatterSet f1970z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScatterSet$toString$1(ScatterSet scatterSet) {
        super(1);
        this.f1970z = scatterSet;
    }

    /* renamed from: b */
    public final CharSequence invoke(Object obj) {
        return obj == this.f1970z ? "(this)" : String.valueOf(obj);
    }
}
