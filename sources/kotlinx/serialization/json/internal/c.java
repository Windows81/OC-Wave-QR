package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNamingStrategy;

public final /* synthetic */ class c implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ JsonNamingStrategy f42464A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42465z;

    public /* synthetic */ c(SerialDescriptor serialDescriptor, JsonNamingStrategy jsonNamingStrategy) {
        this.f42465z = serialDescriptor;
        this.f42464A = jsonNamingStrategy;
    }

    public final Object invoke() {
        return JsonNamesMapKt.p(this.f42465z, this.f42464A);
    }
}
