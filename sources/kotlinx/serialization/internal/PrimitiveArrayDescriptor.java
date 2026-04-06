package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {

    /* renamed from: c  reason: collision with root package name */
    public final String f42182c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimitiveArrayDescriptor(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, (DefaultConstructorMarker) null);
        Intrinsics.i(serialDescriptor, "primitive");
        this.f42182c = serialDescriptor.a() + "Array";
    }

    public String a() {
        return this.f42182c;
    }
}
