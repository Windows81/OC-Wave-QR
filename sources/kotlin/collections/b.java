package kotlin.collections;

import java.util.Map;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f40646z;

    public /* synthetic */ b(AbstractMap abstractMap) {
        this.f40646z = abstractMap;
    }

    public final Object invoke(Object obj) {
        return AbstractMap.m(this.f40646z, (Map.Entry) obj);
    }
}
