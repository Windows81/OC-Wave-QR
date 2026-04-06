package com.hansecom.abt.util.resourcesResolvers;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable(with = StringValueSerializer.class)
public abstract class StringValue implements Parcelable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public static final StringValue f39087z = StringValueKt.d("");

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StringValue a() {
            return StringValue.f39087z;
        }

        public final KSerializer<StringValue> serializer() {
            return StringValueSerializer.f39098a;
        }

        public Companion() {
        }
    }

    @Metadata
    @Serializable
    public static final class ResourceId extends StringValue {
        public static final Parcelable.Creator<ResourceId> CREATOR = new Creator();
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: A  reason: collision with root package name */
        public final int f39096A;

        @Metadata
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<ResourceId> serializer() {
                return StringValue$ResourceId$$serializer.f39090a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<ResourceId> {
            /* renamed from: a */
            public final ResourceId createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new ResourceId(parcel.readInt());
            }

            /* renamed from: b */
            public final ResourceId[] newArray(int i2) {
                return new ResourceId[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceId(int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            super((DefaultConstructorMarker) null);
            if (1 != (i2 & 1)) {
                PluginExceptionsKt.a(i2, 1, StringValue$ResourceId$$serializer.f39090a.a());
            }
            this.f39096A = i3;
        }

        public final int b() {
            return this.f39096A;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResourceId) && this.f39096A == ((ResourceId) obj).f39096A;
        }

        public int hashCode() {
            return Integer.hashCode(this.f39096A);
        }

        public String toString() {
            int i2 = this.f39096A;
            return "resourceId: " + i2;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f39096A);
        }

        public ResourceId(int i2) {
            super((DefaultConstructorMarker) null);
            this.f39096A = i2;
        }
    }

    @Metadata
    @Serializable
    public static final class Value extends StringValue {
        public static final Parcelable.Creator<Value> CREATOR = new Creator();
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: A  reason: collision with root package name */
        public final String f39097A;

        @Metadata
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<Value> serializer() {
                return StringValue$Value$$serializer.f39092a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<Value> {
            /* renamed from: a */
            public final Value createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new Value(parcel.readString());
            }

            /* renamed from: b */
            public final Value[] newArray(int i2) {
                return new Value[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Value(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super((DefaultConstructorMarker) null);
            if (1 != (i2 & 1)) {
                PluginExceptionsKt.a(i2, 1, StringValue$Value$$serializer.f39092a.a());
            }
            this.f39097A = str;
        }

        public final String b() {
            return this.f39097A;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && Intrinsics.d(this.f39097A, ((Value) obj).f39097A);
        }

        public int hashCode() {
            return this.f39097A.hashCode();
        }

        public String toString() {
            return this.f39097A;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f39097A);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Value(String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(str, "value");
            this.f39097A = str;
        }
    }

    public /* synthetic */ StringValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public StringValue() {
    }

    @Metadata
    @Serializable
    public static final class Key extends StringValue {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final int D = 8;
        public static final KSerializer[] E = {null, null, new ArrayListSerializer(StringSerializer.f42197a)};

        /* renamed from: A  reason: collision with root package name */
        public final String f39094A;

        /* renamed from: B  reason: collision with root package name */
        public final Integer f39095B;
        public final List C;

        @Metadata
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<Key> serializer() {
                return StringValue$Key$$serializer.f39088a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<Key> {
            /* renamed from: a */
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new Key(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final Key[] newArray(int i2) {
                return new Key[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Key(int i2, String str, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
            super((DefaultConstructorMarker) null);
            if (1 != (i2 & 1)) {
                PluginExceptionsKt.a(i2, 1, StringValue$Key$$serializer.f39088a.a());
            }
            this.f39094A = str;
            if ((i2 & 2) == 0) {
                this.f39095B = null;
            } else {
                this.f39095B = num;
            }
            if ((i2 & 4) == 0) {
                this.C = CollectionsKt.m();
            } else {
                this.C = list;
            }
        }

        public static final /* synthetic */ void f(Key key, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer[] kSerializerArr = E;
            compositeEncoder.t(serialDescriptor, 0, key.f39094A);
            if (compositeEncoder.w(serialDescriptor, 1) || key.f39095B != null) {
                compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, key.f39095B);
            }
            if (compositeEncoder.w(serialDescriptor, 2) || !Intrinsics.d(key.C, CollectionsKt.m())) {
                compositeEncoder.A(serialDescriptor, 2, kSerializerArr[2], key.C);
            }
        }

        public final List c() {
            return this.C;
        }

        public final Integer d() {
            return this.f39095B;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f39094A;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.d(this.f39094A, key.f39094A) && Intrinsics.d(this.f39095B, key.f39095B) && Intrinsics.d(this.C, key.C);
        }

        public int hashCode() {
            int hashCode = this.f39094A.hashCode() * 31;
            Integer num = this.f39095B;
            return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.C.hashCode();
        }

        public String toString() {
            String str = this.f39094A;
            List list = this.C;
            return "key: " + str + ", arguments: " + list;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int intValue;
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f39094A);
            Integer num = this.f39095B;
            if (num == null) {
                intValue = 0;
            } else {
                parcel.writeInt(1);
                intValue = num.intValue();
            }
            parcel.writeInt(intValue);
            parcel.writeStringList(this.C);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Key(String str, Integer num, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? CollectionsKt.m() : list);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Key(String str, Integer num, List list) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(str, "key");
            Intrinsics.i(list, "arguments");
            this.f39094A = str;
            this.f39095B = num;
            this.C = list;
        }
    }
}
