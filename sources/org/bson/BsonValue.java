package org.bson;

public abstract class BsonValue {
    public BsonDateTime B() {
        k0(BsonType.DATE_TIME);
        return (BsonDateTime) this;
    }

    public BsonDecimal128 M() {
        k0(BsonType.DECIMAL128);
        return (BsonDecimal128) this;
    }

    public BsonDocument R() {
        k0(BsonType.DOCUMENT);
        return (BsonDocument) this;
    }

    public BsonDouble U() {
        k0(BsonType.DOUBLE);
        return (BsonDouble) this;
    }

    public BsonInt32 V() {
        k0(BsonType.INT32);
        return (BsonInt32) this;
    }

    public BsonInt64 W() {
        k0(BsonType.INT64);
        return (BsonInt64) this;
    }

    public BsonJavaScript Y() {
        k0(BsonType.JAVASCRIPT);
        return (BsonJavaScript) this;
    }

    public BsonJavaScriptWithScope Z() {
        k0(BsonType.JAVASCRIPT_WITH_SCOPE);
        return (BsonJavaScriptWithScope) this;
    }

    public BsonObjectId a0() {
        k0(BsonType.OBJECT_ID);
        return (BsonObjectId) this;
    }

    public BsonRegularExpression b0() {
        k0(BsonType.REGULAR_EXPRESSION);
        return (BsonRegularExpression) this;
    }

    public BsonString d0() {
        k0(BsonType.STRING);
        return (BsonString) this;
    }

    public BsonSymbol h0() {
        k0(BsonType.SYMBOL);
        return (BsonSymbol) this;
    }

    public BsonTimestamp i0() {
        k0(BsonType.TIMESTAMP);
        return (BsonTimestamp) this;
    }

    public abstract BsonType j0();

    public final void k0(BsonType bsonType) {
        if (j0() != bsonType) {
            throw new BsonInvalidOperationException(String.format("Value expected to be of type %s is of unexpected type %s", new Object[]{bsonType, j0()}));
        }
    }

    public BsonArray n() {
        k0(BsonType.ARRAY);
        return (BsonArray) this;
    }

    public BsonBinary o() {
        k0(BsonType.BINARY);
        return (BsonBinary) this;
    }

    public BsonBoolean p() {
        k0(BsonType.BOOLEAN);
        return (BsonBoolean) this;
    }

    public BsonDbPointer z() {
        k0(BsonType.DB_POINTER);
        return (BsonDbPointer) this;
    }
}
