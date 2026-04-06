package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;

@Metadata
public final class JsonElementMarker {

    /* renamed from: a  reason: collision with root package name */
    public final ElementMarker f42383a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42384b;

    public JsonElementMarker(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        this.f42383a = new ElementMarker(serialDescriptor, new JsonElementMarker$origin$1(this));
    }

    public final boolean b() {
        return this.f42384b;
    }

    public final void c(int i2) {
        this.f42383a.a(i2);
    }

    public final int d() {
        return this.f42383a.d();
    }

    public final boolean e(SerialDescriptor serialDescriptor, int i2) {
        boolean z2 = !serialDescriptor.k(i2) && serialDescriptor.j(i2).c();
        this.f42384b = z2;
        return z2;
    }
}
