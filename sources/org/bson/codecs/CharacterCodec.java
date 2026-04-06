package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.assertions.Assertions;

public class CharacterCodec implements Codec<Character> {
    /* renamed from: c */
    public Character b(BsonReader bsonReader, DecoderContext decoderContext) {
        String h2 = bsonReader.h();
        if (h2.length() == 1) {
            return Character.valueOf(h2.charAt(0));
        }
        throw new BsonInvalidOperationException(String.format("Attempting to decode the string '%s' to a character, but its length is not equal to one", new Object[]{h2}));
    }

    public Class d() {
        return Character.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Character ch, EncoderContext encoderContext) {
        Assertions.d("value", ch);
        bsonWriter.p(ch.toString());
    }
}
