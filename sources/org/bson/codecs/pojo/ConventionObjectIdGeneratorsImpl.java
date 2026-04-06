package org.bson.codecs.pojo;

import org.bson.BsonObjectId;
import org.bson.types.ObjectId;

final class ConventionObjectIdGeneratorsImpl implements Convention {
    public void a(ClassModelBuilder classModelBuilder) {
        PropertyModelBuilder n2;
        if (classModelBuilder.l() == null && classModelBuilder.m() != null && (n2 = classModelBuilder.n(classModelBuilder.m())) != null) {
            Class type = n2.g().getType();
            if (classModelBuilder.l() == null && type.equals(ObjectId.class)) {
                classModelBuilder.q(IdGenerators.f43803a);
            } else if (classModelBuilder.l() == null && type.equals(BsonObjectId.class)) {
                classModelBuilder.q(IdGenerators.f43804b);
            }
        }
    }
}
