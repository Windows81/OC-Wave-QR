package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class MutableStateSerializer<T> implements KSerializer<MutableState<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f22832a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f22833b;

    public SerialDescriptor a() {
        return this.f22833b;
    }

    /* renamed from: f */
    public MutableState c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return SnapshotStateKt__SnapshotStateKt.e(decoder.C(this.f22832a), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, MutableState mutableState) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(mutableState, "value");
        encoder.e(this.f22832a, mutableState.getValue());
    }
}
