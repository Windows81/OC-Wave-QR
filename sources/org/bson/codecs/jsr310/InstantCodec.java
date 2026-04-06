package org.bson.codecs.jsr310;

import java.time.Instant;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

public class InstantCodec extends DateTimeBasedCodec<Instant> {
    public Class d() {
        return Instant.class;
    }

    /* renamed from: e */
    public Instant b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Instant.ofEpochMilli(c(bsonReader));
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, Instant instant, EncoderContext encoderContext) {
        try {
            bsonWriter.c0(instant.toEpochMilli());
        } catch (ArithmeticException e2) {
            throw new CodecConfigurationException(String.format("Unsupported Instant value '%s' could not be converted to milliseconds: %s", new Object[]{instant, e2.getMessage()}), e2);
        }
    }
}
