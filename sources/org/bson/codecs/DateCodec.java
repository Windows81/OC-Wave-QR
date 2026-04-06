package org.bson.codecs;

import java.util.Date;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class DateCodec implements Codec<Date> {
    /* renamed from: c */
    public Date b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new Date(bsonReader.r0());
    }

    public Class d() {
        return Date.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Date date, EncoderContext encoderContext) {
        bsonWriter.c0(date.getTime());
    }
}
