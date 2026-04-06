package org.bson.codecs.jsr310;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

public class Jsr310CodecProvider implements CodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f43756a = new HashMap();

    static {
        try {
            Class.forName("java.time.Instant");
            a(new InstantCodec());
            a(new LocalDateCodec());
            a(new LocalDateTimeCodec());
            a(new LocalTimeCodec());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void a(Codec codec) {
        f43756a.put(codec.d(), codec);
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        return (Codec) f43756a.get(cls);
    }
}
