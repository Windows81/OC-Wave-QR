package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata
public final class RouteDecoder extends AbstractDecoder {

    /* renamed from: a  reason: collision with root package name */
    public final ArgStore f22614a;

    /* renamed from: b  reason: collision with root package name */
    public int f22615b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f22616c = "";

    /* renamed from: d  reason: collision with root package name */
    public final SerializersModule f22617d = SerializersModuleKt.a();

    public RouteDecoder(Bundle bundle, Map map) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(map, "typeMap");
        this.f22614a = new BundleArgStore(bundle, map);
    }

    public Object C(DeserializationStrategy deserializationStrategy) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        return L();
    }

    public Object J() {
        return L();
    }

    public final Object K(DeserializationStrategy deserializationStrategy) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        return super.C(deserializationStrategy);
    }

    public final Object L() {
        Object b2 = this.f22614a.b(this.f22616c);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.f22616c).toString());
    }

    public SerializersModule a() {
        return this.f22617d;
    }

    public Void l() {
        return null;
    }

    public boolean u() {
        return this.f22614a.b(this.f22616c) != null;
    }

    public int x(SerialDescriptor serialDescriptor) {
        String g2;
        Intrinsics.i(serialDescriptor, "descriptor");
        int i2 = this.f22615b;
        do {
            i2++;
            if (i2 >= serialDescriptor.f()) {
                return -1;
            }
            g2 = serialDescriptor.g(i2);
        } while (!this.f22614a.a(g2));
        this.f22615b = i2;
        this.f22616c = g2;
        return i2;
    }

    public Decoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (RouteSerializerKt.l(serialDescriptor)) {
            this.f22616c = serialDescriptor.g(0);
            this.f22615b = 0;
        }
        return super.z(serialDescriptor);
    }

    public RouteDecoder(SavedStateHandle savedStateHandle, Map map) {
        Intrinsics.i(savedStateHandle, "handle");
        Intrinsics.i(map, "typeMap");
        this.f22614a = new SavedStateArgStore(savedStateHandle, map);
    }
}
