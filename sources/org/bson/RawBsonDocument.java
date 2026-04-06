package org.bson;

import java.io.Serializable;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.bson.assertions.Assertions;
import org.bson.codecs.BsonDocumentCodec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.RawBsonDocumentCodec;
import org.bson.io.ByteBufferBsonInput;
import org.bson.json.JsonWriter;
import org.bson.json.JsonWriterSettings;

public final class RawBsonDocument extends BsonDocument {

    /* renamed from: A  reason: collision with root package name */
    public final byte[] f43693A;

    /* renamed from: B  reason: collision with root package name */
    public final int f43694B;
    public final int C;

    public static class SerializationProxy implements Serializable {
    }

    public RawBsonDocument(byte[] bArr, int i2, int i3) {
        Assertions.d("bytes", bArr);
        boolean z2 = false;
        Assertions.c("offset >= 0", i2 >= 0);
        Assertions.c("offset < bytes.length", i2 < bArr.length);
        Assertions.c("length <= bytes.length - offset", i3 <= bArr.length - i2);
        Assertions.c("length >= 5", i3 >= 5 ? true : z2);
        this.f43693A = bArr;
        this.f43694B = i2;
        this.C = i3;
    }

    public void clear() {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    public boolean containsKey(Object obj) {
        if (obj != null) {
            BsonBinaryReader x0 = x0();
            try {
                x0.Z0();
                while (x0.t1() != BsonType.END_OF_DOCUMENT) {
                    if (x0.h1().equals(obj)) {
                        x0.close();
                        return true;
                    }
                    x0.Y();
                }
                x0.T0();
                x0.close();
                return false;
            } catch (Throwable th) {
                x0.close();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("key can not be null");
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean containsValue(Object obj) {
        BsonBinaryReader x0 = x0();
        try {
            x0.Z0();
            while (x0.t1() != BsonType.END_OF_DOCUMENT) {
                x0.L0();
                if (RawBsonValueHelper.a(this.f43693A, x0).equals(obj)) {
                    x0.close();
                    return true;
                }
            }
            x0.T0();
            x0.close();
            return false;
        } catch (Throwable th) {
            x0.close();
            throw th;
        }
    }

    public Set entrySet() {
        return z0().entrySet();
    }

    public boolean equals(Object obj) {
        return z0().equals(obj);
    }

    public int hashCode() {
        return z0().hashCode();
    }

    /* JADX INFO: finally extract failed */
    public boolean isEmpty() {
        BsonBinaryReader x0 = x0();
        try {
            x0.Z0();
            if (x0.t1() != BsonType.END_OF_DOCUMENT) {
                x0.close();
                return false;
            }
            x0.T0();
            x0.close();
            return true;
        } catch (Throwable th) {
            x0.close();
            throw th;
        }
    }

    public Set keySet() {
        return z0().keySet();
    }

    /* renamed from: l0 */
    public BsonDocument clone() {
        return new RawBsonDocument((byte[]) this.f43693A.clone(), this.f43694B, this.C);
    }

    /* renamed from: p0 */
    public BsonValue get(Object obj) {
        Assertions.d("key", obj);
        BsonBinaryReader x0 = x0();
        try {
            x0.Z0();
            while (x0.t1() != BsonType.END_OF_DOCUMENT) {
                if (x0.h1().equals(obj)) {
                    return RawBsonValueHelper.a(this.f43693A, x0);
                }
                x0.Y();
            }
            x0.T0();
            x0.close();
            return null;
        } finally {
            x0.close();
        }
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    /* renamed from: q0 */
    public BsonValue put(String str, BsonValue bsonValue) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    /* renamed from: r0 */
    public BsonValue remove(Object obj) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    public int size() {
        BsonBinaryReader x0 = x0();
        try {
            x0.Z0();
            int i2 = 0;
            while (x0.t1() != BsonType.END_OF_DOCUMENT) {
                i2++;
                x0.h1();
                x0.Y();
            }
            x0.T0();
            x0.close();
            return i2;
        } catch (Throwable th) {
            x0.close();
            throw th;
        }
    }

    public String u0() {
        return v0(new JsonWriterSettings());
    }

    public String v0(JsonWriterSettings jsonWriterSettings) {
        StringWriter stringWriter = new StringWriter();
        new RawBsonDocumentCodec().a(new JsonWriter(stringWriter, jsonWriterSettings), this, EncoderContext.a().b());
        return stringWriter.toString();
    }

    public Collection values() {
        return z0().values();
    }

    public final BsonBinaryReader x0() {
        return new BsonBinaryReader(new ByteBufferBsonInput(y0()));
    }

    public ByteBuf y0() {
        ByteBuffer wrap = ByteBuffer.wrap(this.f43693A, this.f43694B, this.C);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new ByteBufNIO(wrap);
    }

    public final BsonDocument z0() {
        BsonBinaryReader x0 = x0();
        try {
            return new BsonDocumentCodec().b(x0, DecoderContext.a().a());
        } finally {
            x0.close();
        }
    }
}
