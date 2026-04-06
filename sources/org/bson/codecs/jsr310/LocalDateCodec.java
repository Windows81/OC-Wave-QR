package org.bson.codecs.jsr310;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

public class LocalDateCodec extends DateTimeBasedCodec<LocalDate> {
    public Class d() {
        return LocalDate.class;
    }

    /* renamed from: e */
    public LocalDate b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Instant.ofEpochMilli(c(bsonReader)).atZone(ZoneOffset.UTC).toLocalDate();
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, LocalDate localDate, EncoderContext encoderContext) {
        try {
            bsonWriter.c0(localDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());
        } catch (ArithmeticException e2) {
            throw new CodecConfigurationException(String.format("Unsupported LocalDate '%s' could not be converted to milliseconds: %s", new Object[]{localDate, e2.getMessage()}), e2);
        }
    }
}
