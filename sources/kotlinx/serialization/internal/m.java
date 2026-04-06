package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.DeserializationStrategy;

public final /* synthetic */ class m implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DeserializationStrategy f42250A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f42251B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TaggedDecoder f42252z;

    public /* synthetic */ m(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj) {
        this.f42252z = taggedDecoder;
        this.f42250A = deserializationStrategy;
        this.f42251B = obj;
    }

    public final Object invoke() {
        return TaggedDecoder.K(this.f42252z, this.f42250A, this.f42251B);
    }
}
