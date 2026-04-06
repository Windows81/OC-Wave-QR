package org.bson.json;

import org.bson.BsonRegularExpression;

class ExtendedJsonRegularExpressionConverter implements Converter<BsonRegularExpression> {
    /* renamed from: b */
    public void a(BsonRegularExpression bsonRegularExpression, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.f();
        strictJsonWriter.b("$regularExpression");
        strictJsonWriter.C("pattern", bsonRegularExpression.p0());
        strictJsonWriter.C("options", bsonRegularExpression.l0());
        strictJsonWriter.a();
        strictJsonWriter.a();
    }
}
