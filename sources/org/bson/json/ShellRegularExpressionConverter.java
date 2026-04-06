package org.bson.json;

import org.bson.BsonRegularExpression;

class ShellRegularExpressionConverter implements Converter<BsonRegularExpression> {
    /* renamed from: b */
    public void a(BsonRegularExpression bsonRegularExpression, StrictJsonWriter strictJsonWriter) {
        String replace = bsonRegularExpression.p0().equals("") ? "(?:)" : bsonRegularExpression.p0().replace("/", "\\/");
        strictJsonWriter.c("/" + replace + "/" + bsonRegularExpression.l0());
    }
}
