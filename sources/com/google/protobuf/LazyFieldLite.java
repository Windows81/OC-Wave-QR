package com.google.protobuf;

public class LazyFieldLite {

    /* renamed from: e  reason: collision with root package name */
    public static final ExtensionRegistryLite f32196e = ExtensionRegistryLite.b();

    /* renamed from: a  reason: collision with root package name */
    public ByteString f32197a;

    /* renamed from: b  reason: collision with root package name */
    public ExtensionRegistryLite f32198b;

    /* renamed from: c  reason: collision with root package name */
    public volatile MessageLite f32199c;

    /* renamed from: d  reason: collision with root package name */
    public volatile ByteString f32200d;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f32199c = r4;
        r3.f32200d = com.google.protobuf.ByteString.f31983A;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.protobuf.MessageLite r4) {
        /*
            r3 = this;
            com.google.protobuf.MessageLite r0 = r3.f32199c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.MessageLite r0 = r3.f32199c     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r4 = move-exception
            goto L_0x0036
        L_0x000e:
            com.google.protobuf.ByteString r0 = r3.f32197a     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            if (r0 == 0) goto L_0x0027
            com.google.protobuf.Parser r0 = r4.i()     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            com.google.protobuf.ByteString r1 = r3.f32197a     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            com.google.protobuf.ExtensionRegistryLite r2 = r3.f32198b     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            com.google.protobuf.MessageLite r0 = (com.google.protobuf.MessageLite) r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            r3.f32199c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            com.google.protobuf.ByteString r0 = r3.f32197a     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            r3.f32200d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            goto L_0x0034
        L_0x0027:
            r3.f32199c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.f31983A     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            r3.f32200d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r3.f32199c = r4     // Catch:{ all -> 0x000c }
            com.google.protobuf.ByteString r4 = com.google.protobuf.ByteString.f31983A     // Catch:{ all -> 0x000c }
            r3.f32200d = r4     // Catch:{ all -> 0x000c }
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x0036:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.a(com.google.protobuf.MessageLite):void");
    }

    public int b() {
        if (this.f32200d != null) {
            return this.f32200d.size();
        }
        ByteString byteString = this.f32197a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f32199c != null) {
            return this.f32199c.g();
        }
        return 0;
    }

    public MessageLite c(MessageLite messageLite) {
        a(messageLite);
        return this.f32199c;
    }

    public MessageLite d(MessageLite messageLite) {
        MessageLite messageLite2 = this.f32199c;
        this.f32197a = null;
        this.f32200d = null;
        this.f32199c = messageLite;
        return messageLite2;
    }

    public ByteString e() {
        if (this.f32200d != null) {
            return this.f32200d;
        }
        ByteString byteString = this.f32197a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f32200d != null) {
                    ByteString byteString2 = this.f32200d;
                    return byteString2;
                }
                if (this.f32199c == null) {
                    this.f32200d = ByteString.f31983A;
                } else {
                    this.f32200d = this.f32199c.f();
                }
                ByteString byteString3 = this.f32200d;
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
        MessageLite messageLite = this.f32199c;
        MessageLite messageLite2 = lazyFieldLite.f32199c;
        return (messageLite == null && messageLite2 == null) ? e().equals(lazyFieldLite.e()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.c(messageLite.c())) : c(messageLite2.c()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
