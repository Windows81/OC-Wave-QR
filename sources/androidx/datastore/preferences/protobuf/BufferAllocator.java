package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

@CheckReturnValue
abstract class BufferAllocator {

    /* renamed from: a  reason: collision with root package name */
    public static final BufferAllocator f20766a = new BufferAllocator() {
        public AllocatedBuffer a(int i2) {
            return AllocatedBuffer.i(ByteBuffer.allocateDirect(i2));
        }

        public AllocatedBuffer b(int i2) {
            return AllocatedBuffer.j(new byte[i2]);
        }
    };

    public abstract AllocatedBuffer a(int i2);

    public abstract AllocatedBuffer b(int i2);
}
