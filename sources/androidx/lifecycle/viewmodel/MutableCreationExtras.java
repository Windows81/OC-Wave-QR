package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        this((CreationExtras) null, 1, (DefaultConstructorMarker) null);
    }

    public Object a(CreationExtras.Key key) {
        Intrinsics.i(key, "key");
        return b().get(key);
    }

    public final void c(CreationExtras.Key key, Object obj) {
        Intrinsics.i(key, "key");
        b().put(key, obj);
    }

    public MutableCreationExtras(Map map) {
        Intrinsics.i(map, "initialExtras");
        b().putAll(map);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MutableCreationExtras(CreationExtras creationExtras) {
        this(creationExtras.b());
        Intrinsics.i(creationExtras, "initialExtras");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CreationExtras.Empty.f22064c : creationExtras);
    }
}
