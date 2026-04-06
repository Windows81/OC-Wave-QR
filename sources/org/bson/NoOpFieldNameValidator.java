package org.bson;

class NoOpFieldNameValidator implements FieldNameValidator {
    public FieldNameValidator a(String str) {
        return this;
    }

    public boolean b(String str) {
        return true;
    }
}
