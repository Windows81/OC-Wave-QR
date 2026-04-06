package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class SnapshotStateMapSerializer<K, V> implements KSerializer<SnapshotStateMap<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f22836a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f22837b;

    public SerialDescriptor a() {
        return this.f22837b;
    }

    /* renamed from: f */
    public SnapshotStateMap c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        SnapshotStateMap snapshotStateMap = new SnapshotStateMap();
        snapshotStateMap.putAll((Map) decoder.C(this.f22836a));
        return snapshotStateMap;
    }

    /* renamed from: g */
    public void d(Encoder encoder, SnapshotStateMap snapshotStateMap) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(snapshotStateMap, "value");
        encoder.e(this.f22836a, snapshotStateMap);
    }
}
