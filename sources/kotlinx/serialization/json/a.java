package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final /* synthetic */ class a implements Function1 {
    public final Object invoke(Object obj) {
        return JsonElementSerializer.l((ClassSerialDescriptorBuilder) obj);
    }
}
