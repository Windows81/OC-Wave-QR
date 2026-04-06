package org.bson.codecs.jsr310;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

public class LocalTimeCodec extends DateTimeBasedCodec<LocalTime> {
    public Class d() {
        return LocalTime.class;
    }

    /* renamed from: e */
    public LocalTime b(BsonReader bsonReader, DecoderContext decoderContext) {
        return Instant.ofEpochMilli(c(bsonReader)).atOffset(ZoneOffset.UTC).toLocalTime();
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, LocalTime localTime, EncoderContext encoderContext) {
        bsonWriter.c0(localTime.atDate(LocalDate.ofEpochDay(0)).toInstant(ZoneOffset.UTC).toEpochMilli());
    }
}
