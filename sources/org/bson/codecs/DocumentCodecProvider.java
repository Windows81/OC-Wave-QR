package org.bson.codecs;

import org.bson.Document;
import org.bson.Transformer;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.types.CodeWithScope;

public class DocumentCodecProvider implements CodecProvider {

    /* renamed from: a  reason: collision with root package name */
    public final BsonTypeClassMap f43726a;

    /* renamed from: b  reason: collision with root package name */
    public final Transformer f43727b;

    public DocumentCodecProvider() {
        this(new BsonTypeClassMap());
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        Class<Document> cls2 = Document.class;
        if (cls == CodeWithScope.class) {
            return new CodeWithScopeCodec(codecRegistry.a(cls2));
        }
        if (cls == cls2) {
            return new DocumentCodec(codecRegistry, this.f43726a, this.f43727b);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentCodecProvider documentCodecProvider = (DocumentCodecProvider) obj;
        if (!this.f43726a.equals(documentCodecProvider.f43726a)) {
            return false;
        }
        Transformer transformer = this.f43727b;
        Transformer transformer2 = documentCodecProvider.f43727b;
        return transformer == null ? transformer2 == null : transformer.equals(transformer2);
    }

    public int hashCode() {
        int hashCode = this.f43726a.hashCode() * 31;
        Transformer transformer = this.f43727b;
        return hashCode + (transformer != null ? transformer.hashCode() : 0);
    }

    public DocumentCodecProvider(BsonTypeClassMap bsonTypeClassMap) {
        this(bsonTypeClassMap, (Transformer) null);
    }

    public DocumentCodecProvider(BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this.f43726a = (BsonTypeClassMap) Assertions.d("bsonTypeClassMap", bsonTypeClassMap);
        this.f43727b = transformer;
    }
}
