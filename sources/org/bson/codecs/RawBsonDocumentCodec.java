package org.bson.codecs;

import org.bson.BsonBinaryReader;
import org.bson.BsonBinaryWriter;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.RawBsonDocument;
import org.bson.io.BasicOutputBuffer;
import org.bson.io.ByteBufferBsonInput;

public class RawBsonDocumentCodec implements Codec<RawBsonDocument> {
    /* renamed from: c */
    public RawBsonDocument b(BsonReader bsonReader, DecoderContext decoderContext) {
        BasicOutputBuffer basicOutputBuffer = new BasicOutputBuffer(0);
        BsonBinaryWriter bsonBinaryWriter = new BsonBinaryWriter(basicOutputBuffer);
        try {
            bsonBinaryWriter.e0(bsonReader);
            return new RawBsonDocument(basicOutputBuffer.m(), 0, basicOutputBuffer.getPosition());
        } finally {
            bsonBinaryWriter.close();
            basicOutputBuffer.close();
        }
    }

    public Class d() {
        return RawBsonDocument.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, RawBsonDocument rawBsonDocument, EncoderContext encoderContext) {
        BsonBinaryReader bsonBinaryReader = new BsonBinaryReader(new ByteBufferBsonInput(rawBsonDocument.y0()));
        try {
            bsonWriter.e0(bsonBinaryReader);
        } finally {
            bsonBinaryReader.close();
        }
    }
}
