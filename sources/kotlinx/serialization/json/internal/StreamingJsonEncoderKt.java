package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementKt;

@Metadata
public final class StreamingJsonEncoderKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f42454a = SetsKt.f(BuiltinSerializersKt.w(UInt.f40536A).a(), BuiltinSerializersKt.x(ULong.f40541A).a(), BuiltinSerializersKt.v(UByte.f40531A).a(), BuiltinSerializersKt.y(UShort.f40547A).a());

    public static final boolean a(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "<this>");
        return serialDescriptor.h() && Intrinsics.d(serialDescriptor, JsonElementKt.k());
    }

    public static final boolean b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "<this>");
        return serialDescriptor.h() && f42454a.contains(serialDescriptor);
    }
}
