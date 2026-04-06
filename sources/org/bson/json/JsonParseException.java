package org.bson.json;

public class JsonParseException extends RuntimeException {
    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Object... objArr) {
        super(String.format(str, objArr));
    }

    public JsonParseException(Throwable th) {
        super(th);
    }
}
