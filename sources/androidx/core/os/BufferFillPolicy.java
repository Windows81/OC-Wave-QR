package androidx.core.os;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class BufferFillPolicy {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19939b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final BufferFillPolicy f19940c = new Discard();

    /* renamed from: d  reason: collision with root package name */
    public static final BufferFillPolicy f19941d = new RingBuffer();

    /* renamed from: a  reason: collision with root package name */
    public final int f19942a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ BufferFillPolicy(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public BufferFillPolicy(int i2) {
        this.f19942a = i2;
    }
}
