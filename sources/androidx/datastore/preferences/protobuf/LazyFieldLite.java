package androidx.datastore.preferences.protobuf;

public class LazyFieldLite {

    /* renamed from: a  reason: collision with root package name */
    public ByteString f21039a;

    /* renamed from: b  reason: collision with root package name */
    public ExtensionRegistryLite f21040b;

    /* renamed from: c  reason: collision with root package name */
    public volatile MessageLite f21041c;

    /* renamed from: d  reason: collision with root package name */
    public volatile ByteString f21042d;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f21041c = r4;
        r3.f21042d = androidx.datastore.preferences.protobuf.ByteString.f20770A;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.datastore.preferences.protobuf.MessageLite r4) {
        /*
            r3 = this;
            androidx.datastore.preferences.protobuf.MessageLite r0 = r3.f21041c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.MessageLite r0 = r3.f21041c     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r4 = move-exception
            goto L_0x0036
        L_0x000e:
            androidx.datastore.preferences.protobuf.ByteString r0 = r3.f21039a     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            if (r0 == 0) goto L_0x0027
            androidx.datastore.preferences.protobuf.Parser r0 = r4.i()     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            androidx.datastore.preferences.protobuf.ByteString r1 = r3.f21039a     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r2 = r3.f21040b     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            androidx.datastore.preferences.protobuf.MessageLite r0 = (androidx.datastore.preferences.protobuf.MessageLite) r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            r3.f21041c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            androidx.datastore.preferences.protobuf.ByteString r0 = r3.f21039a     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            r3.f21042d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            goto L_0x0034
        L_0x0027:
            r3.f21041c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.f20770A     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            r3.f21042d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r3.f21041c = r4     // Catch:{ all -> 0x000c }
            androidx.datastore.preferences.protobuf.ByteString r4 = androidx.datastore.preferences.protobuf.ByteString.f20770A     // Catch:{ all -> 0x000c }
            r3.f21042d = r4     // Catch:{ all -> 0x000c }
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x0036:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.LazyFieldLite.a(androidx.datastore.preferences.protobuf.MessageLite):void");
    }

    public int b() {
        if (this.f21042d != null) {
            return this.f21042d.size();
        }
        ByteString byteString = this.f21039a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f21041c != null) {
            return this.f21041c.g();
        }
        return 0;
    }

    public MessageLite c(MessageLite messageLite) {
        a(messageLite);
        return this.f21041c;
    }

    public MessageLite d(MessageLite messageLite) {
        MessageLite messageLite2 = this.f21041c;
        this.f21039a = null;
        this.f21042d = null;
        this.f21041c = messageLite;
        return messageLite2;
    }

    public ByteString e() {
        if (this.f21042d != null) {
            return this.f21042d;
        }
        ByteString byteString = this.f21039a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f21042d != null) {
                    ByteString byteString2 = this.f21042d;
                    return byteString2;
                }
                if (this.f21041c == null) {
                    this.f21042d = ByteString.f20770A;
                } else {
                    this.f21042d = this.f21041c.f();
                }
                ByteString byteString3 = this.f21042d;
                return byteString3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f21041c;
        MessageLite messageLite2 = lazyFieldLite.f21041c;
        return (messageLite == null && messageLite2 == null) ? e().equals(lazyFieldLite.e()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.c(messageLite.c())) : c(messageLite2.c()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
