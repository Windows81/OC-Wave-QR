package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;

public final /* synthetic */ class b implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Json f42462A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42463z;

    public /* synthetic */ b(SerialDescriptor serialDescriptor, Json json) {
        this.f42463z = serialDescriptor;
        this.f42462A = json;
    }

    public final Object invoke() {
        return JsonNamesMapKt.g(this.f42463z, this.f42462A);
    }
}
