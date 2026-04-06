package androidx.savedstate.serialization.serializers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class MutableStateFlowSerializer<T> implements KSerializer<MutableStateFlow<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f22908a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f22909b;

    public SerialDescriptor a() {
        return this.f22909b;
    }

    /* renamed from: f */
    public MutableStateFlow c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return StateFlowKt.a(decoder.C(this.f22908a));
    }

    /* renamed from: g */
    public void d(Encoder encoder, MutableStateFlow mutableStateFlow) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(mutableStateFlow, "value");
        encoder.e(this.f22908a, mutableStateFlow.getValue());
    }
}
