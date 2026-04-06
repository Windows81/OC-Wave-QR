package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ObjectSerializer f42240z;

    public /* synthetic */ f(ObjectSerializer objectSerializer) {
        this.f42240z = objectSerializer;
    }

    public final Object invoke(Object obj) {
        return ObjectSerializer.i(this.f42240z, (ClassSerialDescriptorBuilder) obj);
    }
}
