package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public interface ChangeSecurityQuestions {

    @Metadata
    public interface Action {

        @Metadata
        public interface Main extends Action {

            @Metadata
            public static final class AnswerChange implements Main {

                /* renamed from: a  reason: collision with root package name */
                public final String f35363a;

                public AnswerChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35363a = str;
                }

                public final String a() {
                    return this.f35363a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AnswerChange) && Intrinsics.d(this.f35363a, ((AnswerChange) obj).f35363a);
                }

                public int hashCode() {
                    return this.f35363a.hashCode();
                }

                public String toString() {
                    String str = this.f35363a;
                    return "AnswerChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class Confirm implements Main {

                /* renamed from: a  reason: collision with root package name */
                public static final Confirm f35364a = new Confirm();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof Confirm);
                }

                public int hashCode() {
                    return 2122315850;
                }

                public String toString() {
                    return "Confirm";
                }
            }

            @Metadata
            public static final class SecondAnswerChange implements Main {

                /* renamed from: a  reason: collision with root package name */
                public final String f35365a;

                public SecondAnswerChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f35365a = str;
                }

                public final String a() {
                    return this.f35365a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SecondAnswerChange) && Intrinsics.d(this.f35365a, ((SecondAnswerChange) obj).f35365a);
                }

                public int hashCode() {
                    return this.f35365a.hashCode();
                }

                public String toString() {
                    String str = this.f35365a;
                    return "SecondAnswerChange(value=" + str + ")";
                }
            }
        }

        @Metadata
        public interface Questions extends Action {

            @Metadata
            public static final class ChooseSecondSecurityQuestion implements Questions {

                /* renamed from: a  reason: collision with root package name */
                public final String f35366a;

                public ChooseSecondSecurityQuestion(String str) {
                    Intrinsics.i(str, "value");
                    this.f35366a = str;
                }

                public final String a() {
                    return this.f35366a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ChooseSecondSecurityQuestion) && Intrinsics.d(this.f35366a, ((ChooseSecondSecurityQuestion) obj).f35366a);
                }

                public int hashCode() {
                    return this.f35366a.hashCode();
                }

                public String toString() {
                    String str = this.f35366a;
                    return "ChooseSecondSecurityQuestion(value=" + str + ")";
                }
            }

            @Metadata
            public static final class ChooseSecurityQuestion implements Questions {

                /* renamed from: a  reason: collision with root package name */
                public final String f35367a;

                public ChooseSecurityQuestion(String str) {
                    Intrinsics.i(str, "value");
                    this.f35367a = str;
                }

                public final String a() {
                    return this.f35367a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ChooseSecurityQuestion) && Intrinsics.d(this.f35367a, ((ChooseSecurityQuestion) obj).f35367a);
                }

                public int hashCode() {
                    return this.f35367a.hashCode();
                }

                public String toString() {
                    String str = this.f35367a;
                    return "ChooseSecurityQuestion(value=" + str + ")";
                }
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public interface Main extends Effect {

            @Metadata
            public static final class Fail implements Main {

                /* renamed from: a  reason: collision with root package name */
                public final StringValue f35368a;

                public Fail(StringValue stringValue) {
                    Intrinsics.i(stringValue, "message");
                    this.f35368a = stringValue;
                }

                public final StringValue a() {
                    return this.f35368a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Fail) && Intrinsics.d(this.f35368a, ((Fail) obj).f35368a);
                }

                public int hashCode() {
                    return this.f35368a.hashCode();
                }

                public String toString() {
                    StringValue stringValue = this.f35368a;
                    return "Fail(message=" + stringValue + ")";
                }
            }

            @Metadata
            public static final class UpdateSuccess implements Main {

                /* renamed from: a  reason: collision with root package name */
                public static final UpdateSuccess f35369a = new UpdateSuccess();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof UpdateSuccess);
                }

                public int hashCode() {
                    return 649934281;
                }

                public String toString() {
                    return "UpdateSuccess";
                }
            }
        }

        @Metadata
        public interface Questions extends Effect {

            @Metadata
            public static final class GoBack implements Questions {

                /* renamed from: a  reason: collision with root package name */
                public static final GoBack f35370a = new GoBack();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof GoBack);
                }

                public int hashCode() {
                    return -469979852;
                }

                public String toString() {
                    return "GoBack";
                }
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final Questions f35371A;

        /* renamed from: z  reason: collision with root package name */
        public final Main f35372z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(Main.CREATOR.createFromParcel(parcel), Questions.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(Main main, Questions questions) {
            Intrinsics.i(main, "main");
            Intrinsics.i(questions, "chooseQuestionStep");
            this.f35372z = main;
            this.f35371A = questions;
        }

        public static /* synthetic */ State b(State state, Main main, Questions questions, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                main = state.f35372z;
            }
            if ((i2 & 2) != 0) {
                questions = state.f35371A;
            }
            return state.a(main, questions);
        }

        public final State a(Main main, Questions questions) {
            Intrinsics.i(main, "main");
            Intrinsics.i(questions, "chooseQuestionStep");
            return new State(main, questions);
        }

        public final Questions c() {
            return this.f35371A;
        }

        public final Main d() {
            return this.f35372z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f35372z, state.f35372z) && Intrinsics.d(this.f35371A, state.f35371A);
        }

        public int hashCode() {
            return (this.f35372z.hashCode() * 31) + this.f35371A.hashCode();
        }

        public String toString() {
            Main main = this.f35372z;
            Questions questions = this.f35371A;
            return "State(main=" + main + ", chooseQuestionStep=" + questions + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            this.f35372z.writeToParcel(parcel, i2);
            this.f35371A.writeToParcel(parcel, i2);
        }

        @Metadata
        public static final class Questions implements Parcelable {
            public static final Parcelable.Creator<Questions> CREATOR = new Creator();

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f35376z;

            @Metadata
            public static final class Creator implements Parcelable.Creator<Questions> {
                /* renamed from: a */
                public final Questions createFromParcel(Parcel parcel) {
                    Intrinsics.i(parcel, "parcel");
                    return new Questions(ExtensionsKt.e(parcel.createStringArrayList()));
                }

                /* renamed from: b */
                public final Questions[] newArray(int i2) {
                    return new Questions[i2];
                }
            }

            public Questions(ImmutableList immutableList) {
                Intrinsics.i(immutableList, "securityQuestions");
                this.f35376z = immutableList;
            }

            public final Questions a(ImmutableList immutableList) {
                Intrinsics.i(immutableList, "securityQuestions");
                return new Questions(immutableList);
            }

            public final ImmutableList b() {
                return this.f35376z;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Questions) && Intrinsics.d(this.f35376z, ((Questions) obj).f35376z);
            }

            public int hashCode() {
                return this.f35376z.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f35376z;
                return "Questions(securityQuestions=" + immutableList + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f35376z);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Questions(ImmutableList immutableList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? ExtensionsKt.a() : immutableList);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State.Main r16, com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State.Questions r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r15 = this;
                r0 = r18 & 1
                if (r0 == 0) goto L_0x0019
                com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main r0 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main
                r13 = 2047(0x7ff, float:2.868E-42)
                r14 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                goto L_0x001b
            L_0x0019:
                r0 = r16
            L_0x001b:
                r1 = r18 & 2
                if (r1 == 0) goto L_0x0028
                com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions r1 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions
                r2 = 0
                r3 = 1
                r1.<init>(r2, r3, r2)
                r2 = r15
                goto L_0x002b
            L_0x0028:
                r2 = r15
                r1 = r17
            L_0x002b:
                r15.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State.<init>(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main, com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Metadata
        public static final class Main implements Parcelable {
            public static final Parcelable.Creator<Main> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final String f35373A;

            /* renamed from: B  reason: collision with root package name */
            public final String f35374B;
            public final String C;
            public final String D;
            public final boolean E;
            public final boolean F;
            public final boolean G;
            public final boolean H;
            public final boolean I;
            public final boolean J;

            /* renamed from: z  reason: collision with root package name */
            public final boolean f35375z;

            @Metadata
            public static final class Creator implements Parcelable.Creator<Main> {
                /* renamed from: a */
                public final Main createFromParcel(Parcel parcel) {
                    Intrinsics.i(parcel, "parcel");
                    return new Main(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                /* renamed from: b */
                public final Main[] newArray(int i2) {
                    return new Main[i2];
                }
            }

            public Main(boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                Intrinsics.i(str, "firsSecurityQuestion");
                Intrinsics.i(str2, "firstAnswer");
                Intrinsics.i(str3, "secondSecurityQuestion");
                Intrinsics.i(str4, "secondAnswer");
                this.f35375z = z2;
                this.f35373A = str;
                this.f35374B = str2;
                this.C = str3;
                this.D = str4;
                this.E = z3;
                this.F = z4;
                this.G = z5;
                this.H = z6;
                this.I = z7;
                this.J = z8;
            }

            public static /* synthetic */ Main b(Main main, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2, Object obj) {
                Main main2 = main;
                int i3 = i2;
                return main.a((i3 & 1) != 0 ? main2.f35375z : z2, (i3 & 2) != 0 ? main2.f35373A : str, (i3 & 4) != 0 ? main2.f35374B : str2, (i3 & 8) != 0 ? main2.C : str3, (i3 & 16) != 0 ? main2.D : str4, (i3 & 32) != 0 ? main2.E : z3, (i3 & 64) != 0 ? main2.F : z4, (i3 & 128) != 0 ? main2.G : z5, (i3 & 256) != 0 ? main2.H : z6, (i3 & 512) != 0 ? main2.I : z7, (i3 & 1024) != 0 ? main2.J : z8);
            }

            public final Main a(boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                Intrinsics.i(str, "firsSecurityQuestion");
                String str5 = str2;
                Intrinsics.i(str5, "firstAnswer");
                String str6 = str3;
                Intrinsics.i(str6, "secondSecurityQuestion");
                String str7 = str4;
                Intrinsics.i(str7, "secondAnswer");
                return new Main(z2, str, str5, str6, str7, z3, z4, z5, z6, z7, z8);
            }

            public final String c() {
                return this.f35373A;
            }

            public final String d() {
                return this.f35374B;
            }

            public final int describeContents() {
                return 0;
            }

            public final boolean e() {
                return this.F;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Main)) {
                    return false;
                }
                Main main = (Main) obj;
                return this.f35375z == main.f35375z && Intrinsics.d(this.f35373A, main.f35373A) && Intrinsics.d(this.f35374B, main.f35374B) && Intrinsics.d(this.C, main.C) && Intrinsics.d(this.D, main.D) && this.E == main.E && this.F == main.F && this.G == main.G && this.H == main.H && this.I == main.I && this.J == main.J;
            }

            public final boolean f() {
                return this.E;
            }

            public final boolean g() {
                return !this.F || !this.E || !this.H || !this.G;
            }

            public final String h() {
                return this.D;
            }

            public int hashCode() {
                return (((((((((((((((((((Boolean.hashCode(this.f35375z) * 31) + this.f35373A.hashCode()) * 31) + this.f35374B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.G)) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.J);
            }

            public final boolean i() {
                return this.H;
            }

            public final String j() {
                return this.C;
            }

            public final boolean k() {
                return this.G;
            }

            public final boolean l() {
                return this.f35375z;
            }

            public final boolean n() {
                return this.I;
            }

            public final boolean o() {
                return this.J;
            }

            public String toString() {
                boolean z2 = this.f35375z;
                String str = this.f35373A;
                String str2 = this.f35374B;
                String str3 = this.C;
                String str4 = this.D;
                boolean z3 = this.E;
                boolean z4 = this.F;
                boolean z5 = this.G;
                boolean z6 = this.H;
                boolean z7 = this.I;
                boolean z8 = this.J;
                return "Main(showSecondSecurityQuestion=" + z2 + ", firsSecurityQuestion=" + str + ", firstAnswer=" + str2 + ", secondSecurityQuestion=" + str3 + ", secondAnswer=" + str4 + ", firstSecurityQuestionIsValid=" + z3 + ", firstAnswerIsValid=" + z4 + ", secondSecurityQuestionIsValid=" + z5 + ", secondAnswerIsValid=" + z6 + ", isLoadingContent=" + z7 + ", isSaving=" + z8 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeInt(this.f35375z ? 1 : 0);
                parcel.writeString(this.f35373A);
                parcel.writeString(this.f35374B);
                parcel.writeString(this.C);
                parcel.writeString(this.D);
                parcel.writeInt(this.E ? 1 : 0);
                parcel.writeInt(this.F ? 1 : 0);
                parcel.writeInt(this.G ? 1 : 0);
                parcel.writeInt(this.H ? 1 : 0);
                parcel.writeInt(this.I ? 1 : 0);
                parcel.writeInt(this.J ? 1 : 0);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ Main(boolean r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
                /*
                    r12 = this;
                    r0 = r24
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r1 = r2
                    goto L_0x000a
                L_0x0009:
                    r1 = r13
                L_0x000a:
                    r3 = r0 & 2
                    java.lang.String r4 = ""
                    if (r3 == 0) goto L_0x0012
                    r3 = r4
                    goto L_0x0013
                L_0x0012:
                    r3 = r14
                L_0x0013:
                    r5 = r0 & 4
                    if (r5 == 0) goto L_0x0019
                    r5 = r4
                    goto L_0x001a
                L_0x0019:
                    r5 = r15
                L_0x001a:
                    r6 = r0 & 8
                    if (r6 == 0) goto L_0x0020
                    r6 = r4
                    goto L_0x0022
                L_0x0020:
                    r6 = r16
                L_0x0022:
                    r7 = r0 & 16
                    if (r7 == 0) goto L_0x0027
                    goto L_0x0029
                L_0x0027:
                    r4 = r17
                L_0x0029:
                    r7 = r0 & 32
                    r8 = 1
                    if (r7 == 0) goto L_0x0030
                    r7 = r8
                    goto L_0x0032
                L_0x0030:
                    r7 = r18
                L_0x0032:
                    r9 = r0 & 64
                    if (r9 == 0) goto L_0x0038
                    r9 = r8
                    goto L_0x003a
                L_0x0038:
                    r9 = r19
                L_0x003a:
                    r10 = r0 & 128(0x80, float:1.794E-43)
                    if (r10 == 0) goto L_0x0040
                    r10 = r8
                    goto L_0x0042
                L_0x0040:
                    r10 = r20
                L_0x0042:
                    r11 = r0 & 256(0x100, float:3.59E-43)
                    if (r11 == 0) goto L_0x0047
                    goto L_0x0049
                L_0x0047:
                    r8 = r21
                L_0x0049:
                    r11 = r0 & 512(0x200, float:7.175E-43)
                    if (r11 == 0) goto L_0x004f
                    r11 = r2
                    goto L_0x0051
                L_0x004f:
                    r11 = r22
                L_0x0051:
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L_0x0056
                    goto L_0x0058
                L_0x0056:
                    r2 = r23
                L_0x0058:
                    r13 = r12
                    r14 = r1
                    r15 = r3
                    r16 = r5
                    r17 = r6
                    r18 = r4
                    r19 = r7
                    r20 = r9
                    r21 = r10
                    r22 = r8
                    r23 = r11
                    r24 = r2
                    r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State.Main.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }
    }
}
