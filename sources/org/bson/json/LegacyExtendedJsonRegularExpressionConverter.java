package org.bson.json;

import org.bson.BsonRegularExpression;

class LegacyExtendedJsonRegularExpressionConverter implements Converter<BsonRegularExpression> {
    /* renamed from: b */
    public void a(BsonRegularExpression bsonRegularExpression, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.C("$regex", bsonRegularExpression.p0());
        strictJsonWriter.C("$options", bsonRegularExpression.l0());
        strictJsonWriter.a();
    }
}
