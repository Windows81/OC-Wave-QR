package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Enum[] f42114a;

    /* renamed from: b  reason: collision with root package name */
    public SerialDescriptor f42115b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f42116c;

    public EnumSerializer(String str, Enum[] enumArr) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(enumArr, "values");
        this.f42114a = enumArr;
        this.f42116c = LazyKt.b(new c(this, str));
    }

    public static final SerialDescriptor h(EnumSerializer enumSerializer, String str) {
        SerialDescriptor serialDescriptor = enumSerializer.f42115b;
        return serialDescriptor == null ? enumSerializer.g(str) : serialDescriptor;
    }

    public SerialDescriptor a() {
        return (SerialDescriptor) this.f42116c.getValue();
    }

    public final SerialDescriptor g(String str) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, this.f42114a.length);
        for (Enum name : this.f42114a) {
            PluginGeneratedSerialDescriptor.r(enumDescriptor, name.name(), false, 2, (Object) null);
        }
        return enumDescriptor;
    }

    /* renamed from: i */
    public Enum c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        int g2 = decoder.g(a());
        if (g2 >= 0) {
            Enum[] enumArr = this.f42114a;
            if (g2 < enumArr.length) {
                return enumArr[g2];
            }
        }
        throw new SerializationException(g2 + " is not among valid " + a().a() + " enum values, values size is " + this.f42114a.length);
    }

    /* renamed from: j */
    public void d(Encoder encoder, Enum enumR) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(enumR, "value");
        int t0 = ArraysKt.t0(this.f42114a, enumR);
        if (t0 != -1) {
            encoder.v(a(), t0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(enumR);
        sb.append(" is not a valid enum ");
        sb.append(a().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f42114a);
        Intrinsics.h(arrays, "toString(...)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().a() + '>';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String str, Enum[] enumArr, SerialDescriptor serialDescriptor) {
        this(str, enumArr);
        Intrinsics.i(str, "serialName");
        Intrinsics.i(enumArr, "values");
        Intrinsics.i(serialDescriptor, "descriptor");
        this.f42115b = serialDescriptor;
    }
}
