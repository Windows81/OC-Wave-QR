package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

public class ValueCodecProvider implements CodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Map f43753a = new HashMap();

    public ValueCodecProvider() {
        c();
    }

    private void a(Codec codec) {
        this.f43753a.put(codec.d(), codec);
    }

    private void c() {
        a(new BinaryCodec());
        a(new BooleanCodec());
        a(new DateCodec());
        a(new DoubleCodec());
        a(new IntegerCodec());
        a(new LongCodec());
        a(new MinKeyCodec());
        a(new MaxKeyCodec());
        a(new CodeCodec());
        a(new Decimal128Codec());
        a(new BigDecimalCodec());
        a(new ObjectIdCodec());
        a(new CharacterCodec());
        a(new StringCodec());
        a(new SymbolCodec());
        a(new OverridableUuidRepresentationUuidCodec());
        a(new ByteCodec());
        a(new PatternCodec());
        a(new ShortCodec());
        a(new ByteArrayCodec());
        a(new FloatCodec());
        a(new AtomicBooleanCodec());
        a(new AtomicIntegerCodec());
        a(new AtomicLongCodec());
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        return (Codec) this.f43753a.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode() {
        return 0;
    }
}
