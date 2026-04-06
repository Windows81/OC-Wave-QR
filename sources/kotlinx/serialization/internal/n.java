package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final /* synthetic */ class n implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TripleSerializer f42253z;

    public /* synthetic */ n(TripleSerializer tripleSerializer) {
        this.f42253z = tripleSerializer;
    }

    public final Object invoke(Object obj) {
        return TripleSerializer.i(this.f42253z, (ClassSerialDescriptorBuilder) obj);
    }
}
