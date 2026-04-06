package androidx.datastore.preferences.protobuf;

@CheckReturnValue
interface MessageInfoFactory {
    MessageInfo a(Class cls);

    boolean b(Class cls);
}
