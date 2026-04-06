package c;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Collection f18208z;

    public /* synthetic */ b(Collection collection) {
        this.f18208z = collection;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(PersistentVectorBuilder.U(this.f18208z, obj));
    }
}
