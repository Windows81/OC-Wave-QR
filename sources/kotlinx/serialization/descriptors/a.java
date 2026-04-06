package kotlinx.serialization.descriptors;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptorImpl f42064z;

    public /* synthetic */ a(SerialDescriptorImpl serialDescriptorImpl) {
        this.f42064z = serialDescriptorImpl;
    }

    public final Object invoke(Object obj) {
        return SerialDescriptorImpl.p(this.f42064z, ((Integer) obj).intValue());
    }
}
