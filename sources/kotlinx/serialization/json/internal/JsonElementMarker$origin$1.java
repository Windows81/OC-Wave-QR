package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements Function2<SerialDescriptor, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return v((SerialDescriptor) obj, ((Number) obj2).intValue());
    }

    public final Boolean v(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.f40885A).e(serialDescriptor, i2));
    }
}
