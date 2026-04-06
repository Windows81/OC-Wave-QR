package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SerializedCollection implements Externalizable {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f40671B = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final int f40672A;

    /* renamed from: z  reason: collision with root package name */
    public Collection f40673z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SerializedCollection(Collection collection, int i2) {
        Intrinsics.i(collection, "collection");
        this.f40673z = collection;
        this.f40672A = i2;
    }

    public void readExternal(ObjectInput objectInput) {
        Collection collection;
        Intrinsics.i(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b2 = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (b2 == 0) {
                    List d2 = CollectionsKt.d(readInt);
                    while (i2 < readInt) {
                        d2.add(objectInput.readObject());
                        i2++;
                    }
                    collection = CollectionsKt.a(d2);
                } else if (b2 == 1) {
                    Set b3 = SetsKt.b(readInt);
                    while (i2 < readInt) {
                        b3.add(objectInput.readObject());
                        i2++;
                    }
                    collection = SetsKt.a(b3);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b2 + '.');
                }
                this.f40673z = collection;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(ObjectOutput objectOutput) {
        Intrinsics.i(objectOutput, "output");
        objectOutput.writeByte(this.f40672A);
        objectOutput.writeInt(this.f40673z.size());
        for (Object writeObject : this.f40673z) {
            objectOutput.writeObject(writeObject);
        }
    }

    public SerializedCollection() {
        this(CollectionsKt.m(), 0);
    }
}
