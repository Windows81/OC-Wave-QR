package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class i implements Function0 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f42068z;

    public /* synthetic */ i(List list) {
        this.f42068z = list;
    }

    public final Object invoke() {
        return SerializersCacheKt.j(this.f42068z);
    }
}
