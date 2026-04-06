package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final /* synthetic */ class g implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KSerializer f42241A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KSerializer f42242z;

    public /* synthetic */ g(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f42242z = kSerializer;
        this.f42241A = kSerializer2;
    }

    public final Object invoke(Object obj) {
        return PairSerializer.l(this.f42242z, this.f42241A, (ClassSerialDescriptorBuilder) obj);
    }
}
