package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionSerializer(KSerializer kSerializer) {
        super(kSerializer, (DefaultConstructorMarker) null);
        Intrinsics.i(kSerializer, "element");
    }

    /* renamed from: t */
    public Iterator i(Collection collection) {
        Intrinsics.i(collection, "<this>");
        return collection.iterator();
    }

    /* renamed from: u */
    public int j(Collection collection) {
        Intrinsics.i(collection, "<this>");
        return collection.size();
    }
}
