package org.bson.codecs.pojo;

import org.bson.BsonObjectId;
import org.bson.types.ObjectId;

public final class IdGenerators {

    /* renamed from: a  reason: collision with root package name */
    public static final IdGenerator f43803a = new IdGenerator<ObjectId>() {
        /* renamed from: b */
        public ObjectId a() {
            return new ObjectId();
        }

        public Class getType() {
            return ObjectId.class;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final IdGenerator f43804b = new IdGenerator<BsonObjectId>() {
        /* renamed from: b */
        public BsonObjectId a() {
            return new BsonObjectId();
        }

        public Class getType() {
            return BsonObjectId.class;
        }
    };
}
