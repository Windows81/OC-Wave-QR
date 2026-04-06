package androidx.datastore.preferences.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {

    /* renamed from: z  reason: collision with root package name */
    public final List f21169z = null;

    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
