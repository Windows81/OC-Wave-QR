package org.bson.codecs;

import java.util.UUID;
import org.bson.BSONException;
import org.bson.BsonBinary;
import org.bson.BsonBinarySubType;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.internal.UuidHelper;

public class UuidCodec implements Codec<UUID> {

    /* renamed from: a  reason: collision with root package name */
    public final UuidRepresentation f43751a;

    public UuidCodec(UuidRepresentation uuidRepresentation) {
        Assertions.d("uuidRepresentation", uuidRepresentation);
        this.f43751a = uuidRepresentation;
    }

    public Class d() {
        return UUID.class;
    }

    /* renamed from: e */
    public UUID b(BsonReader bsonReader, DecoderContext decoderContext) {
        byte Y0 = bsonReader.Y0();
        if (Y0 == BsonBinarySubType.UUID_LEGACY.d() || Y0 == BsonBinarySubType.UUID_STANDARD.d()) {
            return UuidHelper.a(bsonReader.J().p0(), Y0, this.f43751a);
        }
        throw new BSONException("Unexpected BsonBinarySubType");
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, UUID uuid, EncoderContext encoderContext) {
        UuidRepresentation uuidRepresentation = this.f43751a;
        if (uuidRepresentation != UuidRepresentation.UNSPECIFIED) {
            byte[] b2 = UuidHelper.b(uuid, uuidRepresentation);
            if (this.f43751a == UuidRepresentation.STANDARD) {
                bsonWriter.F(new BsonBinary(BsonBinarySubType.UUID_STANDARD, b2));
            } else {
                bsonWriter.F(new BsonBinary(BsonBinarySubType.UUID_LEGACY, b2));
            }
        } else {
            throw new CodecConfigurationException("The uuidRepresentation has not been specified, so the UUID cannot be encoded.");
        }
    }

    public String toString() {
        return "UuidCodec{uuidRepresentation=" + this.f43751a + '}';
    }

    public UuidCodec() {
        this.f43751a = UuidRepresentation.JAVA_LEGACY;
    }
}
