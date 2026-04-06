package kotlinx.serialization;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PolymorphicSerializer f42016z;

    public /* synthetic */ c(PolymorphicSerializer polymorphicSerializer) {
        this.f42016z = polymorphicSerializer;
    }

    public final Object invoke(Object obj) {
        return PolymorphicSerializer.n(this.f42016z, (ClassSerialDescriptorBuilder) obj);
    }
}
