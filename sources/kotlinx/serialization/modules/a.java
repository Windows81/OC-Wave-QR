package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModuleCollector;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KSerializer f42484z;

    public /* synthetic */ a(KSerializer kSerializer) {
        this.f42484z = kSerializer;
    }

    public final Object invoke(Object obj) {
        return SerializersModuleCollector.DefaultImpls.c(this.f42484z, (List) obj);
    }
}
