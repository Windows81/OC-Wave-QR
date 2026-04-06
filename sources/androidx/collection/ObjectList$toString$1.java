package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ObjectList$toString$1 extends Lambda implements Function1<E, CharSequence> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ObjectList f1939z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObjectList$toString$1(ObjectList objectList) {
        super(1);
        this.f1939z = objectList;
    }

    /* renamed from: b */
    public final CharSequence invoke(Object obj) {
        return obj == this.f1939z ? "(this)" : String.valueOf(obj);
    }
}
