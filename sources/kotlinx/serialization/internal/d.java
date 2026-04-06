package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KSerializer f42236A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KSerializer f42237z;

    public /* synthetic */ d(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f42237z = kSerializer;
        this.f42236A = kSerializer2;
    }

    public final Object invoke(Object obj) {
        return MapEntrySerializer.l(this.f42237z, this.f42236A, (ClassSerialDescriptorBuilder) obj);
    }
}
