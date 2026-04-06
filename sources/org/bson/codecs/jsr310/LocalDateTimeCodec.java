package org.bson.codecs.jsr310;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

public class LocalDateTimeCodec extends DateTimeBasedCodec<LocalDateTime> {
    public Class d() {
        return LocalDateTime.class;
    }

    /* renamed from: e */
    public LocalDateTime b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Instant.ofEpochMilli(c(bsonReader)).atZone(ZoneOffset.UTC).toLocalDateTime();
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, LocalDateTime localDateTime, EncoderContext encoderContext) {
        try {
            bsonWriter.c0(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        } catch (ArithmeticException e2) {
            throw new CodecConfigurationException(String.format("Unsupported LocalDateTime value '%s' could not be converted to milliseconds: %s", new Object[]{localDateTime, e2.getMessage()}), e2);
        }
    }
}
