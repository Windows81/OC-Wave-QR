package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractJsonTreeEncoder f42461z;

    public /* synthetic */ a(AbstractJsonTreeEncoder abstractJsonTreeEncoder) {
        this.f42461z = abstractJsonTreeEncoder;
    }

    public final Object invoke(Object obj) {
        return AbstractJsonTreeEncoder.i0(this.f42461z, (JsonElement) obj);
    }
}
