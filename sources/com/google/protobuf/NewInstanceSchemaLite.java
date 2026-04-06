package com.google.protobuf;

@CheckReturnValue
final class NewInstanceSchemaLite implements NewInstanceSchema {
    public Object a(Object obj) {
        return ((GeneratedMessageLite) obj).X();
    }
}
