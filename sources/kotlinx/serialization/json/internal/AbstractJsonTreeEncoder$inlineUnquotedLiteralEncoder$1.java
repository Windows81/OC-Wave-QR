package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 extends AbstractEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractJsonTreeEncoder f42347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f42348b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42349c;

    public AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1(AbstractJsonTreeEncoder abstractJsonTreeEncoder, String str, SerialDescriptor serialDescriptor) {
        this.f42347a = abstractJsonTreeEncoder;
        this.f42348b = str;
        this.f42349c = serialDescriptor;
    }

    public void G(String str) {
        Intrinsics.i(str, "value");
        this.f42347a.A0(this.f42348b, new JsonLiteral(str, false, this.f42349c));
    }

    public SerializersModule a() {
        return this.f42347a.d().a();
    }
}
