package c;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Collection f18207z;

    public /* synthetic */ a(Collection collection) {
        this.f18207z = collection;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(AbstractPersistentList.m(this.f18207z, obj));
    }
}
