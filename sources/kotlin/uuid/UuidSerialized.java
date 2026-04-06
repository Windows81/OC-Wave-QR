package kotlin.uuid;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class UuidSerialized implements Externalizable {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f41228B = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public long f41229A;

    /* renamed from: z  reason: collision with root package name */
    public long f41230z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public UuidSerialized(long j2, long j3) {
        this.f41230z = j2;
        this.f41229A = j3;
    }

    public void readExternal(ObjectInput objectInput) {
        Intrinsics.i(objectInput, "input");
        this.f41230z = objectInput.readLong();
        this.f41229A = objectInput.readLong();
    }

    public void writeExternal(ObjectOutput objectOutput) {
        Intrinsics.i(objectOutput, "output");
        objectOutput.writeLong(this.f41230z);
        objectOutput.writeLong(this.f41229A);
    }

    public UuidSerialized() {
        this(0, 0);
    }
}
