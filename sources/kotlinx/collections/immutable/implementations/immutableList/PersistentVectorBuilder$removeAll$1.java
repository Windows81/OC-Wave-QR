package kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PersistentVectorBuilder$removeAll$1 extends Lambda implements Function1<E, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Collection f41252z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentVectorBuilder$removeAll$1(Collection collection) {
        super(1);
        this.f41252z = collection;
    }

    /* renamed from: b */
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(this.f41252z.contains(obj));
    }
}
