package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 extends AbstractEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final SerializersModule f42350a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractJsonTreeEncoder f42351b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f42352c;

    public AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(AbstractJsonTreeEncoder abstractJsonTreeEncoder, String str) {
        this.f42351b = abstractJsonTreeEncoder;
        this.f42352c = str;
        this.f42350a = abstractJsonTreeEncoder.d().a();
    }

    public void D(long j2) {
        K(Long.toUnsignedString(ULong.f(j2)));
    }

    public final void K(String str) {
        Intrinsics.i(str, "s");
        this.f42351b.A0(this.f42352c, new JsonLiteral(str, false, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null));
    }

    public SerializersModule a() {
        return this.f42350a;
    }

    public void j(short s2) {
        K(UShort.k(UShort.f(s2)));
    }

    public void k(byte b2) {
        K(UByte.k(UByte.f(b2)));
    }

    public void y(int i2) {
        K(Integer.toUnsignedString(UInt.f(i2)));
    }
}
