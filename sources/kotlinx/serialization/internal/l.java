package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.DeserializationStrategy;

public final /* synthetic */ class l implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DeserializationStrategy f42247A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f42248B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TaggedDecoder f42249z;

    public /* synthetic */ l(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj) {
        this.f42249z = taggedDecoder;
        this.f42247A = deserializationStrategy;
        this.f42248B = obj;
    }

    public final Object invoke() {
        return TaggedDecoder.L(this.f42249z, this.f42247A, this.f42248B);
    }
}
