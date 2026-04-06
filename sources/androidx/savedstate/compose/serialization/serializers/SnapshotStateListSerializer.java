package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class SnapshotStateListSerializer<T> implements KSerializer<SnapshotStateList<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f22834a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f22835b;

    public SerialDescriptor a() {
        return this.f22835b;
    }

    /* renamed from: f */
    public SnapshotStateList c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(CollectionsKt.M0((List) decoder.C(this.f22834a)));
        return snapshotStateList;
    }

    /* renamed from: g */
    public void d(Encoder encoder, SnapshotStateList snapshotStateList) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(snapshotStateList, "value");
        encoder.e(this.f22834a, snapshotStateList);
    }
}
