package com.hansecom.abt.ui.components.listItem;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface MenuItemState extends Parcelable {

    @Metadata
    public static final class DefaultImpls {
        public static String a(MenuItemState menuItemState) {
            String O = menuItemState.O();
            return O == null ? "" : O;
        }
    }

    String E();

    String O();

    @Metadata
    public static final class Switch implements MenuItemState {
        public static final Parcelable.Creator<Switch> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f38498A;

        /* renamed from: B  reason: collision with root package name */
        public final String f38499B;
        public final boolean C;
        public final boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final StringValue f38500z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<Switch> {
            /* renamed from: a */
            public final Switch createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                StringValue stringValue = (StringValue) parcel.readParcelable(Switch.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new Switch(stringValue, readString, readString2, z3, z2);
            }

            /* renamed from: b */
            public final Switch[] newArray(int i2) {
                return new Switch[i2];
            }
        }

        public Switch(StringValue stringValue, String str, String str2, boolean z2, boolean z3) {
            Intrinsics.i(stringValue, "title");
            this.f38500z = stringValue;
            this.f38498A = str;
            this.f38499B = str2;
            this.C = z2;
            this.D = z3;
        }

        public static /* synthetic */ Switch b(Switch switchR, StringValue stringValue, String str, String str2, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stringValue = switchR.f38500z;
            }
            if ((i2 & 2) != 0) {
                str = switchR.f38498A;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                str2 = switchR.f38499B;
            }
            String str4 = str2;
            if ((i2 & 8) != 0) {
                z2 = switchR.C;
            }
            boolean z4 = z2;
            if ((i2 & 16) != 0) {
                z3 = switchR.D;
            }
            return switchR.a(stringValue, str3, str4, z4, z3);
        }

        public String E() {
            return DefaultImpls.a(this);
        }

        public String O() {
            return this.f38499B;
        }

        public final Switch a(StringValue stringValue, String str, String str2, boolean z2, boolean z3) {
            Intrinsics.i(stringValue, "title");
            return new Switch(stringValue, str, str2, z2, z3);
        }

        public final boolean c() {
            return this.C;
        }

        public boolean d() {
            return this.D;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f38498A;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Switch)) {
                return false;
            }
            Switch switchR = (Switch) obj;
            return Intrinsics.d(this.f38500z, switchR.f38500z) && Intrinsics.d(this.f38498A, switchR.f38498A) && Intrinsics.d(this.f38499B, switchR.f38499B) && this.C == switchR.C && this.D == switchR.D;
        }

        public StringValue f() {
            return this.f38500z;
        }

        public int hashCode() {
            int hashCode = this.f38500z.hashCode() * 31;
            String str = this.f38498A;
            int i2 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f38499B;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((((hashCode2 + i2) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D);
        }

        public String toString() {
            StringValue stringValue = this.f38500z;
            String str = this.f38498A;
            String str2 = this.f38499B;
            boolean z2 = this.C;
            boolean z3 = this.D;
            return "Switch(title=" + stringValue + ", leftIconKey=" + str + ", action=" + str2 + ", checkedState=" + z2 + ", enabled=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeParcelable(this.f38500z, i2);
            parcel.writeString(this.f38498A);
            parcel.writeString(this.f38499B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Switch(StringValue stringValue, String str, String str2, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringValue, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? true : z3);
        }
    }

    @Metadata
    public static final class Group implements MenuItemState {
        public static final Parcelable.Creator<Group> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f38495A;

        /* renamed from: B  reason: collision with root package name */
        public final String f38496B;
        public final String C;
        public final PersistentList D;
        public final boolean E;

        /* renamed from: z  reason: collision with root package name */
        public final StringValue f38497z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<Group> {
            /* renamed from: a */
            public final Group createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                Class<Group> cls = Group.class;
                StringValue stringValue = (StringValue) parcel.readParcelable(cls.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                }
                return new Group(stringValue, readString, readString2, readString3, ExtensionsKt.e(arrayList), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final Group[] newArray(int i2) {
                return new Group[i2];
            }
        }

        public Group(StringValue stringValue, String str, String str2, String str3, PersistentList persistentList, boolean z2) {
            Intrinsics.i(stringValue, "title");
            Intrinsics.i(persistentList, "items");
            this.f38497z = stringValue;
            this.f38495A = str;
            this.f38496B = str2;
            this.C = str3;
            this.D = persistentList;
            this.E = z2;
        }

        public String E() {
            return DefaultImpls.a(this);
        }

        public String O() {
            return this.C;
        }

        public final PersistentList a() {
            return this.D;
        }

        public final String b() {
            return this.f38495A;
        }

        public final String c() {
            return this.f38496B;
        }

        public StringValue d() {
            return this.f38497z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Group)) {
                return false;
            }
            Group group = (Group) obj;
            return Intrinsics.d(this.f38497z, group.f38497z) && Intrinsics.d(this.f38495A, group.f38495A) && Intrinsics.d(this.f38496B, group.f38496B) && Intrinsics.d(this.C, group.C) && Intrinsics.d(this.D, group.D) && this.E == group.E;
        }

        public int hashCode() {
            int hashCode = this.f38497z.hashCode() * 31;
            String str = this.f38495A;
            int i2 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f38496B;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.C;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return ((((hashCode3 + i2) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E);
        }

        public String toString() {
            StringValue stringValue = this.f38497z;
            String str = this.f38495A;
            String str2 = this.f38496B;
            String str3 = this.C;
            PersistentList persistentList = this.D;
            boolean z2 = this.E;
            return "Group(title=" + stringValue + ", leftIconKey=" + str + ", rightIconKey=" + str2 + ", action=" + str3 + ", items=" + persistentList + ", enabled=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeParcelable(this.f38497z, i2);
            parcel.writeString(this.f38495A);
            parcel.writeString(this.f38496B);
            parcel.writeString(this.C);
            PersistentList<Parcelable> persistentList = this.D;
            parcel.writeInt(persistentList.size());
            for (Parcelable writeParcelable : persistentList) {
                parcel.writeParcelable(writeParcelable, i2);
            }
            parcel.writeInt(this.E ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Group(StringValue stringValue, String str, String str2, String str3, PersistentList persistentList, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringValue, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, persistentList, (i2 & 32) != 0 ? true : z2);
        }
    }

    @Metadata
    public static final class Text implements MenuItemState {
        public static final Parcelable.Creator<Text> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f38501A;

        /* renamed from: B  reason: collision with root package name */
        public final String f38502B;
        public final String C;
        public final String D;
        public final String E;
        public final boolean F;

        /* renamed from: z  reason: collision with root package name */
        public final StringValue f38503z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<Text> {
            /* renamed from: a */
            public final Text createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                Class<Text> cls = Text.class;
                return new Text((StringValue) parcel.readParcelable(cls.getClassLoader()), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final Text[] newArray(int i2) {
                return new Text[i2];
            }
        }

        public Text(StringValue stringValue, StringValue stringValue2, String str, String str2, String str3, String str4, boolean z2) {
            Intrinsics.i(stringValue, "title");
            this.f38503z = stringValue;
            this.f38501A = stringValue2;
            this.f38502B = str;
            this.C = str2;
            this.D = str3;
            this.E = str4;
            this.F = z2;
        }

        public static /* synthetic */ Text b(Text text, StringValue stringValue, StringValue stringValue2, String str, String str2, String str3, String str4, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stringValue = text.f38503z;
            }
            if ((i2 & 2) != 0) {
                stringValue2 = text.f38501A;
            }
            StringValue stringValue3 = stringValue2;
            if ((i2 & 4) != 0) {
                str = text.f38502B;
            }
            String str5 = str;
            if ((i2 & 8) != 0) {
                str2 = text.C;
            }
            String str6 = str2;
            if ((i2 & 16) != 0) {
                str3 = text.D;
            }
            String str7 = str3;
            if ((i2 & 32) != 0) {
                str4 = text.E;
            }
            String str8 = str4;
            if ((i2 & 64) != 0) {
                z2 = text.F;
            }
            return text.a(stringValue, stringValue3, str5, str6, str7, str8, z2);
        }

        public String E() {
            return DefaultImpls.a(this);
        }

        public String O() {
            return this.D;
        }

        public final Text a(StringValue stringValue, StringValue stringValue2, String str, String str2, String str3, String str4, boolean z2) {
            Intrinsics.i(stringValue, "title");
            return new Text(stringValue, stringValue2, str, str2, str3, str4, z2);
        }

        public final StringValue c() {
            return this.f38501A;
        }

        public boolean d() {
            return this.F;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f38502B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.d(this.f38503z, text.f38503z) && Intrinsics.d(this.f38501A, text.f38501A) && Intrinsics.d(this.f38502B, text.f38502B) && Intrinsics.d(this.C, text.C) && Intrinsics.d(this.D, text.D) && Intrinsics.d(this.E, text.E) && this.F == text.F;
        }

        public final String f() {
            return this.C;
        }

        public StringValue g() {
            return this.f38503z;
        }

        public final String h() {
            return this.E;
        }

        public int hashCode() {
            int hashCode = this.f38503z.hashCode() * 31;
            StringValue stringValue = this.f38501A;
            int i2 = 0;
            int hashCode2 = (hashCode + (stringValue == null ? 0 : stringValue.hashCode())) * 31;
            String str = this.f38502B;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.C;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.D;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.E;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return ((hashCode5 + i2) * 31) + Boolean.hashCode(this.F);
        }

        public String toString() {
            StringValue stringValue = this.f38503z;
            StringValue stringValue2 = this.f38501A;
            String str = this.f38502B;
            String str2 = this.C;
            String str3 = this.D;
            String str4 = this.E;
            boolean z2 = this.F;
            return "Text(title=" + stringValue + ", description=" + stringValue2 + ", leftIconKey=" + str + ", rightIconKey=" + str2 + ", action=" + str3 + ", url=" + str4 + ", enabled=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeParcelable(this.f38503z, i2);
            parcel.writeParcelable(this.f38501A, i2);
            parcel.writeString(this.f38502B);
            parcel.writeString(this.C);
            parcel.writeString(this.D);
            parcel.writeString(this.E);
            parcel.writeInt(this.F ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Text(com.hansecom.abt.util.resourcesResolvers.StringValue r7, com.hansecom.abt.util.resourcesResolvers.StringValue r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r6 = this;
                r0 = r14 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r8
            L_0x0008:
                r2 = r14 & 4
                if (r2 == 0) goto L_0x000e
                r2 = r1
                goto L_0x000f
            L_0x000e:
                r2 = r9
            L_0x000f:
                r3 = r14 & 8
                if (r3 == 0) goto L_0x0015
                r3 = r1
                goto L_0x0016
            L_0x0015:
                r3 = r10
            L_0x0016:
                r4 = r14 & 16
                if (r4 == 0) goto L_0x001c
                r4 = r1
                goto L_0x001d
            L_0x001c:
                r4 = r11
            L_0x001d:
                r5 = r14 & 32
                if (r5 == 0) goto L_0x0022
                goto L_0x0023
            L_0x0022:
                r1 = r12
            L_0x0023:
                r5 = r14 & 64
                if (r5 == 0) goto L_0x0029
                r5 = 1
                goto L_0x002a
            L_0x0029:
                r5 = r13
            L_0x002a:
                r8 = r6
                r9 = r7
                r10 = r0
                r11 = r2
                r12 = r3
                r13 = r4
                r14 = r1
                r15 = r5
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.MenuItemState.Text.<init>(com.hansecom.abt.util.resourcesResolvers.StringValue, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
