package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class UnitSerializer implements KSerializer<Unit> {

    /* renamed from: b  reason: collision with root package name */
    public static final UnitSerializer f42227b = new UnitSerializer();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ObjectSerializer f42228a = new ObjectSerializer("kotlin.Unit", Unit.f40552a);

    public SerialDescriptor a() {
        return this.f42228a.a();
    }

    public /* bridge */ /* synthetic */ Object c(Decoder decoder) {
        f(decoder);
        return Unit.f40552a;
    }

    public void f(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        this.f42228a.c(decoder);
    }

    /* renamed from: g */
    public void d(Encoder encoder, Unit unit) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(unit, "value");
        this.f42228a.d(encoder, unit);
    }
}
