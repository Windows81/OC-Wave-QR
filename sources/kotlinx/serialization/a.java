package kotlinx.serialization;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextualSerializer f42012z;

    public /* synthetic */ a(ContextualSerializer contextualSerializer) {
        this.f42012z = contextualSerializer;
    }

    public final Object invoke(Object obj) {
        return ContextualSerializer.g(this.f42012z, (ClassSerialDescriptorBuilder) obj);
    }
}
