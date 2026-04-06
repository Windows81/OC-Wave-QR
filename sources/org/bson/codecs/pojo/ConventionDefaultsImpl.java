package org.bson.codecs.pojo;

final class ConventionDefaultsImpl implements Convention {
    public void a(ClassModelBuilder classModelBuilder) {
        if (classModelBuilder.k() == null) {
            classModelBuilder.g("_t");
        }
        if (classModelBuilder.j() == null && classModelBuilder.p() != null) {
            classModelBuilder.f(classModelBuilder.p().getName());
        }
        for (PropertyModelBuilder propertyModelBuilder : classModelBuilder.o()) {
            if (classModelBuilder.m() == null) {
                String c2 = propertyModelBuilder.c();
                if (c2.equals("_id") || c2.equals("id")) {
                    classModelBuilder.r(c2);
                }
            }
        }
    }
}
