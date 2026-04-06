package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class JsonDecoderForUnsignedTypes extends AbstractDecoder {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractJsonLexer f42381a;

    /* renamed from: b  reason: collision with root package name */
    public final SerializersModule f42382b;

    public JsonDecoderForUnsignedTypes(AbstractJsonLexer abstractJsonLexer, Json json) {
        Intrinsics.i(abstractJsonLexer, "lexer");
        Intrinsics.i(json, "json");
        this.f42381a = abstractJsonLexer;
        this.f42382b = json.a();
    }

    public byte D() {
        AbstractJsonLexer abstractJsonLexer = this.f42381a;
        String q2 = abstractJsonLexer.q();
        try {
            return UStringsKt.a(q2);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse type '" + "UByte" + "' for input '" + q2 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public short E() {
        AbstractJsonLexer abstractJsonLexer = this.f42381a;
        String q2 = abstractJsonLexer.q();
        try {
            return UStringsKt.j(q2);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse type '" + "UShort" + "' for input '" + q2 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public SerializersModule a() {
        return this.f42382b;
    }

    public int j() {
        AbstractJsonLexer abstractJsonLexer = this.f42381a;
        String q2 = abstractJsonLexer.q();
        try {
            return UStringsKt.d(q2);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse type '" + "UInt" + "' for input '" + q2 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public long r() {
        AbstractJsonLexer abstractJsonLexer = this.f42381a;
        String q2 = abstractJsonLexer.q();
        try {
            return UStringsKt.g(q2);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.x(abstractJsonLexer, "Failed to parse type '" + "ULong" + "' for input '" + q2 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
