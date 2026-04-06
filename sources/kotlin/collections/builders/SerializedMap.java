package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SerializedMap implements Externalizable {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40674A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public Map f40675z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SerializedMap(Map map) {
        Intrinsics.i(map, "map");
        this.f40675z = map;
    }

    public void readExternal(ObjectInput objectInput) {
        Intrinsics.i(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map d2 = MapsKt.d(readInt);
                for (int i2 = 0; i2 < readInt; i2++) {
                    d2.put(objectInput.readObject(), objectInput.readObject());
                }
                this.f40675z = MapsKt.b(d2);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        Intrinsics.i(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f40675z.size());
        for (Map.Entry entry : this.f40675z.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(MapsKt.h());
    }
}
