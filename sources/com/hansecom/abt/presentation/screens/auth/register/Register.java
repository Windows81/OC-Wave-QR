package com.hansecom.abt.presentation.screens.auth.register;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public interface Register {

    @Metadata
    public interface Action {

        @Metadata
        public interface ChooseQuestionStep extends Action {

            @Metadata
            public static final class ChooseSecondSecurityQuestion implements ChooseQuestionStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34356a;

                public ChooseSecondSecurityQuestion(String str) {
                    Intrinsics.i(str, "value");
                    this.f34356a = str;
                }

                public final String a() {
                    return this.f34356a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ChooseSecondSecurityQuestion) && Intrinsics.d(this.f34356a, ((ChooseSecondSecurityQuestion) obj).f34356a);
                }

                public int hashCode() {
                    return this.f34356a.hashCode();
                }

                public String toString() {
                    String str = this.f34356a;
                    return "ChooseSecondSecurityQuestion(value=" + str + ")";
                }
            }

            @Metadata
            public static final class ChooseSecurityQuestion implements ChooseQuestionStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34357a;

                public ChooseSecurityQuestion(String str) {
                    Intrinsics.i(str, "value");
                    this.f34357a = str;
                }

                public final String a() {
                    return this.f34357a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ChooseSecurityQuestion) && Intrinsics.d(this.f34357a, ((ChooseSecurityQuestion) obj).f34357a);
                }

                public int hashCode() {
                    return this.f34357a.hashCode();
                }

                public String toString() {
                    String str = this.f34357a;
                    return "ChooseSecurityQuestion(value=" + str + ")";
                }
            }

            @Metadata
            public static final class UpdateQuestions implements ChooseQuestionStep {

                /* renamed from: a  reason: collision with root package name */
                public static final UpdateQuestions f34358a = new UpdateQuestions();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof UpdateQuestions);
                }

                public int hashCode() {
                    return 1504107754;
                }

                public String toString() {
                    return "UpdateQuestions";
                }
            }
        }

        @Metadata
        public interface QuestionsStep extends Action {

            @Metadata
            public static final class AnswerChange implements QuestionsStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34359a;

                public AnswerChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34359a = str;
                }

                public final String a() {
                    return this.f34359a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AnswerChange) && Intrinsics.d(this.f34359a, ((AnswerChange) obj).f34359a);
                }

                public int hashCode() {
                    return this.f34359a.hashCode();
                }

                public String toString() {
                    String str = this.f34359a;
                    return "AnswerChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class AppPinChange implements QuestionsStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34360a;

                public AppPinChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34360a = str;
                }

                public final String a() {
                    return this.f34360a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AppPinChange) && Intrinsics.d(this.f34360a, ((AppPinChange) obj).f34360a);
                }

                public int hashCode() {
                    return this.f34360a.hashCode();
                }

                public String toString() {
                    String str = this.f34360a;
                    return "AppPinChange(value=" + str + ")";
                }
            }

            @Metadata
            /* renamed from: com.hansecom.abt.presentation.screens.auth.register.Register$Action$QuestionsStep$Register  reason: collision with other inner class name */
            public static final class C0008Register implements QuestionsStep {

                /* renamed from: a  reason: collision with root package name */
                public static final C0008Register f34361a = new C0008Register();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0008Register);
                }

                public int hashCode() {
                    return 42805955;
                }

                public String toString() {
                    return "Register";
                }
            }

            @Metadata
            public static final class SecondAnswerChange implements QuestionsStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34362a;

                public SecondAnswerChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34362a = str;
                }

                public final String a() {
                    return this.f34362a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SecondAnswerChange) && Intrinsics.d(this.f34362a, ((SecondAnswerChange) obj).f34362a);
                }

                public int hashCode() {
                    return this.f34362a.hashCode();
                }

                public String toString() {
                    String str = this.f34362a;
                    return "SecondAnswerChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class ToggleTermsAcceptance implements QuestionsStep {

                /* renamed from: a  reason: collision with root package name */
                public final boolean f34363a;

                public ToggleTermsAcceptance(boolean z2) {
                    this.f34363a = z2;
                }

                public final boolean a() {
                    return this.f34363a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ToggleTermsAcceptance) && this.f34363a == ((ToggleTermsAcceptance) obj).f34363a;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.f34363a);
                }

                public String toString() {
                    boolean z2 = this.f34363a;
                    return "ToggleTermsAcceptance(value=" + z2 + ")";
                }
            }
        }

        @Metadata
        public interface UserInfoStep extends Action {

            @Metadata
            public static final class ContinueStep implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public static final ContinueStep f34364a = new ContinueStep();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof ContinueStep);
                }

                public int hashCode() {
                    return -164536655;
                }

                public String toString() {
                    return "ContinueStep";
                }
            }

            @Metadata
            public static final class EmailChange implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34365a;

                public EmailChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34365a = str;
                }

                public final String a() {
                    return this.f34365a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof EmailChange) && Intrinsics.d(this.f34365a, ((EmailChange) obj).f34365a);
                }

                public int hashCode() {
                    return this.f34365a.hashCode();
                }

                public String toString() {
                    String str = this.f34365a;
                    return "EmailChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class EmailConfirmChange implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34366a;

                public EmailConfirmChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34366a = str;
                }

                public final String a() {
                    return this.f34366a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof EmailConfirmChange) && Intrinsics.d(this.f34366a, ((EmailConfirmChange) obj).f34366a);
                }

                public int hashCode() {
                    return this.f34366a.hashCode();
                }

                public String toString() {
                    String str = this.f34366a;
                    return "EmailConfirmChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class FirstNameChange implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34367a;

                public FirstNameChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34367a = str;
                }

                public final String a() {
                    return this.f34367a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FirstNameChange) && Intrinsics.d(this.f34367a, ((FirstNameChange) obj).f34367a);
                }

                public int hashCode() {
                    return this.f34367a.hashCode();
                }

                public String toString() {
                    String str = this.f34367a;
                    return "FirstNameChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class LastNameChange implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34368a;

                public LastNameChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34368a = str;
                }

                public final String a() {
                    return this.f34368a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof LastNameChange) && Intrinsics.d(this.f34368a, ((LastNameChange) obj).f34368a);
                }

                public int hashCode() {
                    return this.f34368a.hashCode();
                }

                public String toString() {
                    String str = this.f34368a;
                    return "LastNameChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class PasswordChange implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34369a;

                public PasswordChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34369a = str;
                }

                public final String a() {
                    return this.f34369a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PasswordChange) && Intrinsics.d(this.f34369a, ((PasswordChange) obj).f34369a);
                }

                public int hashCode() {
                    return this.f34369a.hashCode();
                }

                public String toString() {
                    String str = this.f34369a;
                    return "PasswordChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class PasswordConfirmChange implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34370a;

                public PasswordConfirmChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34370a = str;
                }

                public final String a() {
                    return this.f34370a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PasswordConfirmChange) && Intrinsics.d(this.f34370a, ((PasswordConfirmChange) obj).f34370a);
                }

                public int hashCode() {
                    return this.f34370a.hashCode();
                }

                public String toString() {
                    String str = this.f34370a;
                    return "PasswordConfirmChange(value=" + str + ")";
                }
            }

            @Metadata
            public static final class PasswordConfirmVisibilityToggle implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public static final PasswordConfirmVisibilityToggle f34371a = new PasswordConfirmVisibilityToggle();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof PasswordConfirmVisibilityToggle);
                }

                public int hashCode() {
                    return 987540333;
                }

                public String toString() {
                    return "PasswordConfirmVisibilityToggle";
                }
            }

            @Metadata
            public static final class PasswordVisibilityToggle implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public static final PasswordVisibilityToggle f34372a = new PasswordVisibilityToggle();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof PasswordVisibilityToggle);
                }

                public int hashCode() {
                    return -1923103905;
                }

                public String toString() {
                    return "PasswordVisibilityToggle";
                }
            }

            @Metadata
            public static final class PhoneNumberChange implements UserInfoStep {

                /* renamed from: a  reason: collision with root package name */
                public final String f34373a;

                public PhoneNumberChange(String str) {
                    Intrinsics.i(str, "value");
                    this.f34373a = str;
                }

                public final String a() {
                    return this.f34373a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PhoneNumberChange) && Intrinsics.d(this.f34373a, ((PhoneNumberChange) obj).f34373a);
                }

                public int hashCode() {
                    return this.f34373a.hashCode();
                }

                public String toString() {
                    String str = this.f34373a;
                    return "PhoneNumberChange(value=" + str + ")";
                }
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Fail implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f34374a;

            public Fail(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f34374a = stringValue;
            }

            public final StringValue a() {
                return this.f34374a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fail) && Intrinsics.d(this.f34374a, ((Fail) obj).f34374a);
            }

            public int hashCode() {
                return this.f34374a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f34374a;
                return "Fail(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class GoBack implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoBack f34375a = new GoBack();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoBack);
            }

            public int hashCode() {
                return -517016673;
            }

            public String toString() {
                return "GoBack";
            }
        }

        @Metadata
        public static final class GoToExistingAccountNeedsActivation implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34376a;

            public GoToExistingAccountNeedsActivation(String str) {
                Intrinsics.i(str, "email");
                this.f34376a = str;
            }

            public final String a() {
                return this.f34376a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToExistingAccountNeedsActivation) && Intrinsics.d(this.f34376a, ((GoToExistingAccountNeedsActivation) obj).f34376a);
            }

            public int hashCode() {
                return this.f34376a.hashCode();
            }

            public String toString() {
                String str = this.f34376a;
                return "GoToExistingAccountNeedsActivation(email=" + str + ")";
            }
        }

        @Metadata
        public static final class GoToExitingAccount implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34377a;

            public GoToExitingAccount(String str) {
                Intrinsics.i(str, "email");
                this.f34377a = str;
            }

            public final String a() {
                return this.f34377a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToExitingAccount) && Intrinsics.d(this.f34377a, ((GoToExitingAccount) obj).f34377a);
            }

            public int hashCode() {
                return this.f34377a.hashCode();
            }

            public String toString() {
                String str = this.f34377a;
                return "GoToExitingAccount(email=" + str + ")";
            }
        }

        @Metadata
        public static final class GoToFirstStep implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoToFirstStep f34378a = new GoToFirstStep();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToFirstStep);
            }

            public int hashCode() {
                return -479710295;
            }

            public String toString() {
                return "GoToFirstStep";
            }
        }

        @Metadata
        public static final class GoToHome implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoToHome f34379a = new GoToHome();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToHome);
            }

            public int hashCode() {
                return 1890640562;
            }

            public String toString() {
                return "GoToHome";
            }
        }

        @Metadata
        public static final class GoToNeedsActivation implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34380a;

            public GoToNeedsActivation(String str) {
                Intrinsics.i(str, "email");
                this.f34380a = str;
            }

            public final String a() {
                return this.f34380a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToNeedsActivation) && Intrinsics.d(this.f34380a, ((GoToNeedsActivation) obj).f34380a);
            }

            public int hashCode() {
                return this.f34380a.hashCode();
            }

            public String toString() {
                String str = this.f34380a;
                return "GoToNeedsActivation(email=" + str + ")";
            }
        }

        @Metadata
        public static final class GoToQuestionsStep implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoToQuestionsStep f34381a = new GoToQuestionsStep();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToQuestionsStep);
            }

            public int hashCode() {
                return -935051962;
            }

            public String toString() {
                return "GoToQuestionsStep";
            }
        }

        @Metadata
        public static final class GoToSignIn implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoToSignIn f34382a = new GoToSignIn();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToSignIn);
            }

            public int hashCode() {
                return 443625685;
            }

            public String toString() {
                return "GoToSignIn";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final QuestionsStep f34383A;

        /* renamed from: B  reason: collision with root package name */
        public final ChooseQuestionStep f34384B;

        /* renamed from: z  reason: collision with root package name */
        public final UserInfoStep f34385z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(UserInfoStep.CREATOR.createFromParcel(parcel), QuestionsStep.CREATOR.createFromParcel(parcel), ChooseQuestionStep.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(UserInfoStep userInfoStep, QuestionsStep questionsStep, ChooseQuestionStep chooseQuestionStep) {
            Intrinsics.i(userInfoStep, "userInfoStep");
            Intrinsics.i(questionsStep, "questionsStep");
            Intrinsics.i(chooseQuestionStep, "chooseQuestionStep");
            this.f34385z = userInfoStep;
            this.f34383A = questionsStep;
            this.f34384B = chooseQuestionStep;
        }

        public static /* synthetic */ State b(State state, UserInfoStep userInfoStep, QuestionsStep questionsStep, ChooseQuestionStep chooseQuestionStep, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                userInfoStep = state.f34385z;
            }
            if ((i2 & 2) != 0) {
                questionsStep = state.f34383A;
            }
            if ((i2 & 4) != 0) {
                chooseQuestionStep = state.f34384B;
            }
            return state.a(userInfoStep, questionsStep, chooseQuestionStep);
        }

        public final State a(UserInfoStep userInfoStep, QuestionsStep questionsStep, ChooseQuestionStep chooseQuestionStep) {
            Intrinsics.i(userInfoStep, "userInfoStep");
            Intrinsics.i(questionsStep, "questionsStep");
            Intrinsics.i(chooseQuestionStep, "chooseQuestionStep");
            return new State(userInfoStep, questionsStep, chooseQuestionStep);
        }

        public final ChooseQuestionStep c() {
            return this.f34384B;
        }

        public final QuestionsStep d() {
            return this.f34383A;
        }

        public final int describeContents() {
            return 0;
        }

        public final UserInfoStep e() {
            return this.f34385z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f34385z, state.f34385z) && Intrinsics.d(this.f34383A, state.f34383A) && Intrinsics.d(this.f34384B, state.f34384B);
        }

        public int hashCode() {
            return (((this.f34385z.hashCode() * 31) + this.f34383A.hashCode()) * 31) + this.f34384B.hashCode();
        }

        public String toString() {
            UserInfoStep userInfoStep = this.f34385z;
            QuestionsStep questionsStep = this.f34383A;
            ChooseQuestionStep chooseQuestionStep = this.f34384B;
            return "State(userInfoStep=" + userInfoStep + ", questionsStep=" + questionsStep + ", chooseQuestionStep=" + chooseQuestionStep + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            this.f34385z.writeToParcel(parcel, i2);
            this.f34383A.writeToParcel(parcel, i2);
            this.f34384B.writeToParcel(parcel, i2);
        }

        @Metadata
        public static final class ChooseQuestionStep implements Parcelable {
            public static final Parcelable.Creator<ChooseQuestionStep> CREATOR = new Creator();

            /* renamed from: z  reason: collision with root package name */
            public final ImmutableList f34386z;

            @Metadata
            public static final class Creator implements Parcelable.Creator<ChooseQuestionStep> {
                /* renamed from: a */
                public final ChooseQuestionStep createFromParcel(Parcel parcel) {
                    Intrinsics.i(parcel, "parcel");
                    return new ChooseQuestionStep(ExtensionsKt.e(parcel.createStringArrayList()));
                }

                /* renamed from: b */
                public final ChooseQuestionStep[] newArray(int i2) {
                    return new ChooseQuestionStep[i2];
                }
            }

            public ChooseQuestionStep(ImmutableList immutableList) {
                Intrinsics.i(immutableList, "securityQuestions");
                this.f34386z = immutableList;
            }

            public final ChooseQuestionStep a(ImmutableList immutableList) {
                Intrinsics.i(immutableList, "securityQuestions");
                return new ChooseQuestionStep(immutableList);
            }

            public final ImmutableList b() {
                return this.f34386z;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChooseQuestionStep) && Intrinsics.d(this.f34386z, ((ChooseQuestionStep) obj).f34386z);
            }

            public int hashCode() {
                return this.f34386z.hashCode();
            }

            public String toString() {
                ImmutableList immutableList = this.f34386z;
                return "ChooseQuestionStep(securityQuestions=" + immutableList + ")";
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeStringList(this.f34386z);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ChooseQuestionStep(ImmutableList immutableList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? ExtensionsKt.a() : immutableList);
            }
        }

        public /* synthetic */ State(UserInfoStep userInfoStep, QuestionsStep questionsStep, ChooseQuestionStep chooseQuestionStep, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            State state;
            ChooseQuestionStep chooseQuestionStep2;
            UserInfoStep userInfoStep2 = (i2 & 1) != 0 ? new UserInfoStep(false, (String) null, (StringValue) null, false, (String) null, (StringValue) null, (String) null, (StringValue) null, false, (String) null, (StringValue) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, false, (String) null, (StringValue) null, false, false, 4194303, (DefaultConstructorMarker) null) : userInfoStep;
            QuestionsStep questionsStep2 = (i2 & 2) != 0 ? new QuestionsStep(false, false, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, (String) null, false, false, false, false, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : questionsStep;
            if ((i2 & 4) != 0) {
                chooseQuestionStep2 = new ChooseQuestionStep((ImmutableList) null, 1, (DefaultConstructorMarker) null);
                state = this;
            } else {
                state = this;
                chooseQuestionStep2 = chooseQuestionStep;
            }
            new State(userInfoStep2, questionsStep2, chooseQuestionStep2);
        }

        @Metadata
        public static final class QuestionsStep implements Parcelable {
            public static final Parcelable.Creator<QuestionsStep> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final boolean f34387A;

            /* renamed from: B  reason: collision with root package name */
            public final String f34388B;
            public final String C;
            public final String D;
            public final String E;
            public final boolean F;
            public final boolean G;
            public final boolean H;
            public final boolean I;
            public final boolean J;
            public final String K;
            public final boolean L;
            public final boolean M;
            public final boolean N;
            public final boolean O;
            public final String P;
            public final String Q;

            /* renamed from: z  reason: collision with root package name */
            public final boolean f34389z;

            @Metadata
            public static final class Creator implements Parcelable.Creator<QuestionsStep> {
                /* renamed from: a */
                public final QuestionsStep createFromParcel(Parcel parcel) {
                    Intrinsics.i(parcel, "parcel");
                    return new QuestionsStep(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final QuestionsStep[] newArray(int i2) {
                    return new QuestionsStep[i2];
                }
            }

            public QuestionsStep(boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str5, boolean z9, boolean z10, boolean z11, boolean z12, String str6, String str7) {
                String str8 = str5;
                String str9 = str6;
                String str10 = str7;
                Intrinsics.i(str, "firsSecurityQuestion");
                Intrinsics.i(str2, "firstAnswer");
                Intrinsics.i(str3, "secondSecurityQuestion");
                Intrinsics.i(str4, "secondAnswer");
                Intrinsics.i(str8, "accountPin");
                Intrinsics.i(str9, "termsUrl");
                Intrinsics.i(str10, "policyUrl");
                this.f34389z = z2;
                this.f34387A = z3;
                this.f34388B = str;
                this.C = str2;
                this.D = str3;
                this.E = str4;
                this.F = z4;
                this.G = z5;
                this.H = z6;
                this.I = z7;
                this.J = z8;
                this.K = str8;
                this.L = z9;
                this.M = z10;
                this.N = z11;
                this.O = z12;
                this.P = str9;
                this.Q = str10;
            }

            public static /* synthetic */ QuestionsStep b(QuestionsStep questionsStep, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str5, boolean z9, boolean z10, boolean z11, boolean z12, String str6, String str7, int i2, Object obj) {
                QuestionsStep questionsStep2 = questionsStep;
                int i3 = i2;
                return questionsStep.a((i3 & 1) != 0 ? questionsStep2.f34389z : z2, (i3 & 2) != 0 ? questionsStep2.f34387A : z3, (i3 & 4) != 0 ? questionsStep2.f34388B : str, (i3 & 8) != 0 ? questionsStep2.C : str2, (i3 & 16) != 0 ? questionsStep2.D : str3, (i3 & 32) != 0 ? questionsStep2.E : str4, (i3 & 64) != 0 ? questionsStep2.F : z4, (i3 & 128) != 0 ? questionsStep2.G : z5, (i3 & 256) != 0 ? questionsStep2.H : z6, (i3 & 512) != 0 ? questionsStep2.I : z7, (i3 & 1024) != 0 ? questionsStep2.J : z8, (i3 & 2048) != 0 ? questionsStep2.K : str5, (i3 & 4096) != 0 ? questionsStep2.L : z9, (i3 & 8192) != 0 ? questionsStep2.M : z10, (i3 & 16384) != 0 ? questionsStep2.N : z11, (i3 & 32768) != 0 ? questionsStep2.O : z12, (i3 & 65536) != 0 ? questionsStep2.P : str6, (i3 & 131072) != 0 ? questionsStep2.Q : str7);
            }

            public final QuestionsStep a(boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str5, boolean z9, boolean z10, boolean z11, boolean z12, String str6, String str7) {
                boolean z13 = z2;
                Intrinsics.i(str, "firsSecurityQuestion");
                Intrinsics.i(str2, "firstAnswer");
                Intrinsics.i(str3, "secondSecurityQuestion");
                Intrinsics.i(str4, "secondAnswer");
                Intrinsics.i(str5, "accountPin");
                Intrinsics.i(str6, "termsUrl");
                Intrinsics.i(str7, "policyUrl");
                return new QuestionsStep(z2, z3, str, str2, str3, str4, z4, z5, z6, z7, z8, str5, z9, z10, z11, z12, str6, str7);
            }

            public final String c() {
                return this.K;
            }

            public final boolean d() {
                return this.J;
            }

            public final int describeContents() {
                return 0;
            }

            public final boolean e() {
                return this.L;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof QuestionsStep)) {
                    return false;
                }
                QuestionsStep questionsStep = (QuestionsStep) obj;
                return this.f34389z == questionsStep.f34389z && this.f34387A == questionsStep.f34387A && Intrinsics.d(this.f34388B, questionsStep.f34388B) && Intrinsics.d(this.C, questionsStep.C) && Intrinsics.d(this.D, questionsStep.D) && Intrinsics.d(this.E, questionsStep.E) && this.F == questionsStep.F && this.G == questionsStep.G && this.H == questionsStep.H && this.I == questionsStep.I && this.J == questionsStep.J && Intrinsics.d(this.K, questionsStep.K) && this.L == questionsStep.L && this.M == questionsStep.M && this.N == questionsStep.N && this.O == questionsStep.O && Intrinsics.d(this.P, questionsStep.P) && Intrinsics.d(this.Q, questionsStep.Q);
            }

            public final boolean f() {
                return this.N;
            }

            public final String g() {
                return this.f34388B;
            }

            public final String h() {
                return this.C;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((((((((((Boolean.hashCode(this.f34389z) * 31) + Boolean.hashCode(this.f34387A)) * 31) + this.f34388B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.G)) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.J)) * 31) + this.K.hashCode()) * 31) + Boolean.hashCode(this.L)) * 31) + Boolean.hashCode(this.M)) * 31) + Boolean.hashCode(this.N)) * 31) + Boolean.hashCode(this.O)) * 31) + this.P.hashCode()) * 31) + this.Q.hashCode();
            }

            public final boolean i() {
                return this.G;
            }

            public final boolean j() {
                return this.F;
            }

            public final boolean k() {
                return !this.G || !this.F || !this.M || !this.I || !this.H || !this.L;
            }

            public final String l() {
                return this.Q;
            }

            public final String n() {
                return this.E;
            }

            public final boolean o() {
                return this.I;
            }

            public final String p() {
                return this.D;
            }

            public final boolean q() {
                return this.H;
            }

            public final boolean r() {
                return this.f34387A;
            }

            public final boolean s() {
                return this.M;
            }

            public final String t() {
                return this.P;
            }

            public String toString() {
                boolean z2 = this.f34389z;
                boolean z3 = this.f34387A;
                String str = this.f34388B;
                String str2 = this.C;
                String str3 = this.D;
                String str4 = this.E;
                boolean z4 = this.F;
                boolean z5 = this.G;
                boolean z6 = this.H;
                boolean z7 = this.I;
                boolean z8 = this.J;
                String str5 = this.K;
                boolean z9 = this.L;
                boolean z10 = this.M;
                boolean z11 = this.N;
                boolean z12 = this.O;
                String str6 = this.P;
                String str7 = this.Q;
                return "QuestionsStep(showFirstSecurityQuestion=" + z2 + ", showSecondSecurityQuestion=" + z3 + ", firsSecurityQuestion=" + str + ", firstAnswer=" + str2 + ", secondSecurityQuestion=" + str3 + ", secondAnswer=" + str4 + ", firstSecurityQuestionIsValid=" + z4 + ", firstAnswerIsValid=" + z5 + ", secondSecurityQuestionIsValid=" + z6 + ", secondAnswerIsValid=" + z7 + ", accountPinIsEnabled=" + z8 + ", accountPin=" + str5 + ", accountPinIsValid=" + z9 + ", termsAndConditionsIsValid=" + z10 + ", areTermsAccepted=" + z11 + ", isRegistering=" + z12 + ", termsUrl=" + str6 + ", policyUrl=" + str7 + ")";
            }

            public final boolean u() {
                return this.O;
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeInt(this.f34389z ? 1 : 0);
                parcel.writeInt(this.f34387A ? 1 : 0);
                parcel.writeString(this.f34388B);
                parcel.writeString(this.C);
                parcel.writeString(this.D);
                parcel.writeString(this.E);
                parcel.writeInt(this.F ? 1 : 0);
                parcel.writeInt(this.G ? 1 : 0);
                parcel.writeInt(this.H ? 1 : 0);
                parcel.writeInt(this.I ? 1 : 0);
                parcel.writeInt(this.J ? 1 : 0);
                parcel.writeString(this.K);
                parcel.writeInt(this.L ? 1 : 0);
                parcel.writeInt(this.M ? 1 : 0);
                parcel.writeInt(this.N ? 1 : 0);
                parcel.writeInt(this.O ? 1 : 0);
                parcel.writeString(this.P);
                parcel.writeString(this.Q);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ QuestionsStep(boolean r20, boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, java.lang.String r31, boolean r32, boolean r33, boolean r34, boolean r35, java.lang.String r36, java.lang.String r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
                /*
                    r19 = this;
                    r0 = r38
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0008
                    r1 = 0
                    goto L_0x000a
                L_0x0008:
                    r1 = r20
                L_0x000a:
                    r3 = r0 & 2
                    if (r3 == 0) goto L_0x0010
                    r3 = 0
                    goto L_0x0012
                L_0x0010:
                    r3 = r21
                L_0x0012:
                    r4 = r0 & 4
                    java.lang.String r5 = ""
                    if (r4 == 0) goto L_0x001a
                    r4 = r5
                    goto L_0x001c
                L_0x001a:
                    r4 = r22
                L_0x001c:
                    r6 = r0 & 8
                    if (r6 == 0) goto L_0x0022
                    r6 = r5
                    goto L_0x0024
                L_0x0022:
                    r6 = r23
                L_0x0024:
                    r7 = r0 & 16
                    if (r7 == 0) goto L_0x002a
                    r7 = r5
                    goto L_0x002c
                L_0x002a:
                    r7 = r24
                L_0x002c:
                    r8 = r0 & 32
                    if (r8 == 0) goto L_0x0032
                    r8 = r5
                    goto L_0x0034
                L_0x0032:
                    r8 = r25
                L_0x0034:
                    r9 = r0 & 64
                    if (r9 == 0) goto L_0x003a
                    r9 = 1
                    goto L_0x003c
                L_0x003a:
                    r9 = r26
                L_0x003c:
                    r11 = r0 & 128(0x80, float:1.794E-43)
                    if (r11 == 0) goto L_0x0042
                    r11 = 1
                    goto L_0x0044
                L_0x0042:
                    r11 = r27
                L_0x0044:
                    r12 = r0 & 256(0x100, float:3.59E-43)
                    if (r12 == 0) goto L_0x004a
                    r12 = 1
                    goto L_0x004c
                L_0x004a:
                    r12 = r28
                L_0x004c:
                    r13 = r0 & 512(0x200, float:7.175E-43)
                    if (r13 == 0) goto L_0x0052
                    r13 = 1
                    goto L_0x0054
                L_0x0052:
                    r13 = r29
                L_0x0054:
                    r14 = r0 & 1024(0x400, float:1.435E-42)
                    if (r14 == 0) goto L_0x005a
                    r14 = 0
                    goto L_0x005c
                L_0x005a:
                    r14 = r30
                L_0x005c:
                    r15 = r0 & 2048(0x800, float:2.87E-42)
                    if (r15 == 0) goto L_0x0062
                    r15 = r5
                    goto L_0x0064
                L_0x0062:
                    r15 = r31
                L_0x0064:
                    r2 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r2 == 0) goto L_0x006a
                    r2 = 1
                    goto L_0x006c
                L_0x006a:
                    r2 = r32
                L_0x006c:
                    r10 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r10 == 0) goto L_0x0072
                    r10 = 1
                    goto L_0x0074
                L_0x0072:
                    r10 = r33
                L_0x0074:
                    r20 = r5
                    r5 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r5 == 0) goto L_0x007c
                    r5 = 0
                    goto L_0x007e
                L_0x007c:
                    r5 = r34
                L_0x007e:
                    r16 = 32768(0x8000, float:4.5918E-41)
                    r16 = r0 & r16
                    if (r16 == 0) goto L_0x0088
                    r16 = 0
                    goto L_0x008a
                L_0x0088:
                    r16 = r35
                L_0x008a:
                    r17 = 65536(0x10000, float:9.18355E-41)
                    r17 = r0 & r17
                    if (r17 == 0) goto L_0x0093
                    r17 = r20
                    goto L_0x0095
                L_0x0093:
                    r17 = r36
                L_0x0095:
                    r18 = 131072(0x20000, float:1.83671E-40)
                    r0 = r0 & r18
                    if (r0 == 0) goto L_0x009e
                    r0 = r20
                    goto L_0x00a0
                L_0x009e:
                    r0 = r37
                L_0x00a0:
                    r20 = r19
                    r21 = r1
                    r22 = r3
                    r23 = r4
                    r24 = r6
                    r25 = r7
                    r26 = r8
                    r27 = r9
                    r28 = r11
                    r29 = r12
                    r30 = r13
                    r31 = r14
                    r32 = r15
                    r33 = r2
                    r34 = r10
                    r35 = r5
                    r36 = r16
                    r37 = r17
                    r38 = r0
                    r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.Register.State.QuestionsStep.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @Metadata
        public static final class UserInfoStep implements Parcelable {
            public static final Parcelable.Creator<UserInfoStep> CREATOR = new Creator();

            /* renamed from: A  reason: collision with root package name */
            public final String f34390A;

            /* renamed from: B  reason: collision with root package name */
            public final StringValue f34391B;
            public final boolean C;
            public final String D;
            public final StringValue E;
            public final String F;
            public final StringValue G;
            public final boolean H;
            public final String I;
            public final StringValue J;
            public final boolean K;
            public final boolean L;
            public final String M;
            public final StringValue N;
            public final String O;
            public final StringValue P;
            public final boolean Q;
            public final String R;
            public final StringValue S;
            public final boolean T;
            public final boolean U;

            /* renamed from: z  reason: collision with root package name */
            public final boolean f34392z;

            @Metadata
            public static final class Creator implements Parcelable.Creator<UserInfoStep> {
                /* renamed from: a */
                public final UserInfoStep createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.i(parcel2, "parcel");
                    Class<UserInfoStep> cls = UserInfoStep.class;
                    return new UserInfoStep(parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (StringValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                /* renamed from: b */
                public final UserInfoStep[] newArray(int i2) {
                    return new UserInfoStep[i2];
                }
            }

            public UserInfoStep(boolean z2, String str, StringValue stringValue, boolean z3, String str2, StringValue stringValue2, String str3, StringValue stringValue3, boolean z4, String str4, StringValue stringValue4, boolean z5, boolean z6, String str5, StringValue stringValue5, String str6, StringValue stringValue6, boolean z7, String str7, StringValue stringValue7, boolean z8, boolean z9) {
                String str8 = str;
                StringValue stringValue8 = stringValue;
                String str9 = str2;
                StringValue stringValue9 = stringValue2;
                String str10 = str3;
                StringValue stringValue10 = stringValue3;
                String str11 = str4;
                StringValue stringValue11 = stringValue4;
                String str12 = str5;
                StringValue stringValue12 = stringValue5;
                String str13 = str6;
                StringValue stringValue13 = stringValue6;
                String str14 = str7;
                StringValue stringValue14 = stringValue7;
                Intrinsics.i(str8, "firstName");
                Intrinsics.i(stringValue8, "firstNameError");
                Intrinsics.i(str9, "lastName");
                Intrinsics.i(stringValue9, "lastNameError");
                Intrinsics.i(str10, "email");
                Intrinsics.i(stringValue10, "emailError");
                Intrinsics.i(str11, "emailConfirmation");
                Intrinsics.i(stringValue11, "emailConfirmError");
                Intrinsics.i(str12, "phoneNumber");
                Intrinsics.i(stringValue12, "phoneNumberError");
                Intrinsics.i(str13, "password");
                Intrinsics.i(stringValue13, "passwordError");
                Intrinsics.i(str14, "passwordConfirmation");
                Intrinsics.i(stringValue14, "passwordConfirmError");
                this.f34392z = z2;
                this.f34390A = str8;
                this.f34391B = stringValue8;
                this.C = z3;
                this.D = str9;
                this.E = stringValue9;
                this.F = str10;
                this.G = stringValue10;
                this.H = z4;
                this.I = str11;
                this.J = stringValue11;
                this.K = z5;
                this.L = z6;
                this.M = str12;
                this.N = stringValue12;
                this.O = str13;
                this.P = stringValue13;
                this.Q = z7;
                this.R = str14;
                this.S = stringValue14;
                this.T = z8;
                this.U = z9;
            }

            public static /* synthetic */ UserInfoStep b(UserInfoStep userInfoStep, boolean z2, String str, StringValue stringValue, boolean z3, String str2, StringValue stringValue2, String str3, StringValue stringValue3, boolean z4, String str4, StringValue stringValue4, boolean z5, boolean z6, String str5, StringValue stringValue5, String str6, StringValue stringValue6, boolean z7, String str7, StringValue stringValue7, boolean z8, boolean z9, int i2, Object obj) {
                UserInfoStep userInfoStep2 = userInfoStep;
                int i3 = i2;
                return userInfoStep.a((i3 & 1) != 0 ? userInfoStep2.f34392z : z2, (i3 & 2) != 0 ? userInfoStep2.f34390A : str, (i3 & 4) != 0 ? userInfoStep2.f34391B : stringValue, (i3 & 8) != 0 ? userInfoStep2.C : z3, (i3 & 16) != 0 ? userInfoStep2.D : str2, (i3 & 32) != 0 ? userInfoStep2.E : stringValue2, (i3 & 64) != 0 ? userInfoStep2.F : str3, (i3 & 128) != 0 ? userInfoStep2.G : stringValue3, (i3 & 256) != 0 ? userInfoStep2.H : z4, (i3 & 512) != 0 ? userInfoStep2.I : str4, (i3 & 1024) != 0 ? userInfoStep2.J : stringValue4, (i3 & 2048) != 0 ? userInfoStep2.K : z5, (i3 & 4096) != 0 ? userInfoStep2.L : z6, (i3 & 8192) != 0 ? userInfoStep2.M : str5, (i3 & 16384) != 0 ? userInfoStep2.N : stringValue5, (i3 & 32768) != 0 ? userInfoStep2.O : str6, (i3 & 65536) != 0 ? userInfoStep2.P : stringValue6, (i3 & 131072) != 0 ? userInfoStep2.Q : z7, (i3 & 262144) != 0 ? userInfoStep2.R : str7, (i3 & 524288) != 0 ? userInfoStep2.S : stringValue7, (i3 & 1048576) != 0 ? userInfoStep2.T : z8, (i3 & 2097152) != 0 ? userInfoStep2.U : z9);
            }

            public final UserInfoStep a(boolean z2, String str, StringValue stringValue, boolean z3, String str2, StringValue stringValue2, String str3, StringValue stringValue3, boolean z4, String str4, StringValue stringValue4, boolean z5, boolean z6, String str5, StringValue stringValue5, String str6, StringValue stringValue6, boolean z7, String str7, StringValue stringValue7, boolean z8, boolean z9) {
                boolean z10 = z2;
                Intrinsics.i(str, "firstName");
                Intrinsics.i(stringValue, "firstNameError");
                Intrinsics.i(str2, "lastName");
                Intrinsics.i(stringValue2, "lastNameError");
                Intrinsics.i(str3, "email");
                Intrinsics.i(stringValue3, "emailError");
                Intrinsics.i(str4, "emailConfirmation");
                Intrinsics.i(stringValue4, "emailConfirmError");
                Intrinsics.i(str5, "phoneNumber");
                Intrinsics.i(stringValue5, "phoneNumberError");
                Intrinsics.i(str6, "password");
                Intrinsics.i(stringValue6, "passwordError");
                Intrinsics.i(str7, "passwordConfirmation");
                Intrinsics.i(stringValue7, "passwordConfirmError");
                return new UserInfoStep(z2, str, stringValue, z3, str2, stringValue2, str3, stringValue3, z4, str4, stringValue4, z5, z6, str5, stringValue5, str6, stringValue6, z7, str7, stringValue7, z8, z9);
            }

            public final String c() {
                return this.F;
            }

            public final boolean d() {
                return this.H;
            }

            public final int describeContents() {
                return 0;
            }

            public final StringValue e() {
                return this.J;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserInfoStep)) {
                    return false;
                }
                UserInfoStep userInfoStep = (UserInfoStep) obj;
                return this.f34392z == userInfoStep.f34392z && Intrinsics.d(this.f34390A, userInfoStep.f34390A) && Intrinsics.d(this.f34391B, userInfoStep.f34391B) && this.C == userInfoStep.C && Intrinsics.d(this.D, userInfoStep.D) && Intrinsics.d(this.E, userInfoStep.E) && Intrinsics.d(this.F, userInfoStep.F) && Intrinsics.d(this.G, userInfoStep.G) && this.H == userInfoStep.H && Intrinsics.d(this.I, userInfoStep.I) && Intrinsics.d(this.J, userInfoStep.J) && this.K == userInfoStep.K && this.L == userInfoStep.L && Intrinsics.d(this.M, userInfoStep.M) && Intrinsics.d(this.N, userInfoStep.N) && Intrinsics.d(this.O, userInfoStep.O) && Intrinsics.d(this.P, userInfoStep.P) && this.Q == userInfoStep.Q && Intrinsics.d(this.R, userInfoStep.R) && Intrinsics.d(this.S, userInfoStep.S) && this.T == userInfoStep.T && this.U == userInfoStep.U;
            }

            public final String f() {
                return this.I;
            }

            public final StringValue g() {
                return this.G;
            }

            public final String h() {
                return this.f34390A;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.f34392z) * 31) + this.f34390A.hashCode()) * 31) + this.f34391B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + Boolean.hashCode(this.H)) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31) + Boolean.hashCode(this.K)) * 31) + Boolean.hashCode(this.L)) * 31) + this.M.hashCode()) * 31) + this.N.hashCode()) * 31) + this.O.hashCode()) * 31) + this.P.hashCode()) * 31) + Boolean.hashCode(this.Q)) * 31) + this.R.hashCode()) * 31) + this.S.hashCode()) * 31) + Boolean.hashCode(this.T)) * 31) + Boolean.hashCode(this.U);
            }

            public final boolean i() {
                return this.f34392z;
            }

            public final StringValue j() {
                return this.f34391B;
            }

            public final boolean k() {
                StringValue stringValue = this.E;
                StringValue.Companion companion = StringValue.Companion;
                return !Intrinsics.d(stringValue, companion.a()) || !Intrinsics.d(this.f34391B, companion.a()) || !Intrinsics.d(this.G, companion.a()) || !Intrinsics.d(this.J, companion.a()) || !Intrinsics.d(this.N, companion.a()) || !Intrinsics.d(this.P, companion.a()) || !Intrinsics.d(this.S, companion.a());
            }

            public final String l() {
                return this.D;
            }

            public final boolean n() {
                return this.C;
            }

            public final StringValue o() {
                return this.E;
            }

            public final String p() {
                return this.O;
            }

            public final boolean q() {
                return this.Q;
            }

            public final StringValue r() {
                return this.S;
            }

            public final boolean s() {
                return this.U;
            }

            public final String t() {
                return this.R;
            }

            public String toString() {
                boolean z2 = this.f34392z;
                String str = this.f34390A;
                StringValue stringValue = this.f34391B;
                boolean z3 = this.C;
                String str2 = this.D;
                StringValue stringValue2 = this.E;
                String str3 = this.F;
                StringValue stringValue3 = this.G;
                boolean z4 = this.H;
                String str4 = this.I;
                StringValue stringValue4 = this.J;
                boolean z5 = this.K;
                boolean z6 = this.L;
                String str5 = this.M;
                StringValue stringValue5 = this.N;
                String str6 = this.O;
                StringValue stringValue6 = this.P;
                boolean z7 = this.Q;
                String str7 = this.R;
                StringValue stringValue7 = this.S;
                boolean z8 = this.T;
                boolean z9 = this.U;
                return "UserInfoStep(firstNameEnabled=" + z2 + ", firstName=" + str + ", firstNameError=" + stringValue + ", lastNameEnabled=" + z3 + ", lastName=" + str2 + ", lastNameError=" + stringValue2 + ", email=" + str3 + ", emailError=" + stringValue3 + ", emailConfirmEnabled=" + z4 + ", emailConfirmation=" + str4 + ", emailConfirmError=" + stringValue4 + ", phoneNumberEnabled=" + z5 + ", phoneNumberIsMandatory=" + z6 + ", phoneNumber=" + str5 + ", phoneNumberError=" + stringValue5 + ", password=" + str6 + ", passwordError=" + stringValue6 + ", passwordConfirmEnabled=" + z7 + ", passwordConfirmation=" + str7 + ", passwordConfirmError=" + stringValue7 + ", passwordIsVisible=" + z8 + ", passwordConfirmIsVisible=" + z9 + ")";
            }

            public final StringValue u() {
                return this.P;
            }

            public final boolean v() {
                return this.T;
            }

            public final String w() {
                return this.M;
            }

            public final void writeToParcel(Parcel parcel, int i2) {
                Intrinsics.i(parcel, "dest");
                parcel.writeInt(this.f34392z ? 1 : 0);
                parcel.writeString(this.f34390A);
                parcel.writeParcelable(this.f34391B, i2);
                parcel.writeInt(this.C ? 1 : 0);
                parcel.writeString(this.D);
                parcel.writeParcelable(this.E, i2);
                parcel.writeString(this.F);
                parcel.writeParcelable(this.G, i2);
                parcel.writeInt(this.H ? 1 : 0);
                parcel.writeString(this.I);
                parcel.writeParcelable(this.J, i2);
                parcel.writeInt(this.K ? 1 : 0);
                parcel.writeInt(this.L ? 1 : 0);
                parcel.writeString(this.M);
                parcel.writeParcelable(this.N, i2);
                parcel.writeString(this.O);
                parcel.writeParcelable(this.P, i2);
                parcel.writeInt(this.Q ? 1 : 0);
                parcel.writeString(this.R);
                parcel.writeParcelable(this.S, i2);
                parcel.writeInt(this.T ? 1 : 0);
                parcel.writeInt(this.U ? 1 : 0);
            }

            public final boolean x() {
                return this.K;
            }

            public final StringValue y() {
                return this.N;
            }

            public final boolean z() {
                return this.L;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ UserInfoStep(boolean r24, java.lang.String r25, com.hansecom.abt.util.resourcesResolvers.StringValue r26, boolean r27, java.lang.String r28, com.hansecom.abt.util.resourcesResolvers.StringValue r29, java.lang.String r30, com.hansecom.abt.util.resourcesResolvers.StringValue r31, boolean r32, java.lang.String r33, com.hansecom.abt.util.resourcesResolvers.StringValue r34, boolean r35, boolean r36, java.lang.String r37, com.hansecom.abt.util.resourcesResolvers.StringValue r38, java.lang.String r39, com.hansecom.abt.util.resourcesResolvers.StringValue r40, boolean r41, java.lang.String r42, com.hansecom.abt.util.resourcesResolvers.StringValue r43, boolean r44, boolean r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
                /*
                    r23 = this;
                    r0 = r46
                    r1 = r0 & 1
                    r2 = 1
                    if (r1 == 0) goto L_0x0009
                    r1 = r2
                    goto L_0x000b
                L_0x0009:
                    r1 = r24
                L_0x000b:
                    r3 = r0 & 2
                    java.lang.String r4 = ""
                    if (r3 == 0) goto L_0x0013
                    r3 = r4
                    goto L_0x0015
                L_0x0013:
                    r3 = r25
                L_0x0015:
                    r5 = r0 & 4
                    if (r5 == 0) goto L_0x0020
                    com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r5 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                    com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r5.a()
                    goto L_0x0022
                L_0x0020:
                    r5 = r26
                L_0x0022:
                    r6 = r0 & 8
                    if (r6 == 0) goto L_0x0028
                    r6 = r2
                    goto L_0x002a
                L_0x0028:
                    r6 = r27
                L_0x002a:
                    r7 = r0 & 16
                    if (r7 == 0) goto L_0x0030
                    r7 = r4
                    goto L_0x0032
                L_0x0030:
                    r7 = r28
                L_0x0032:
                    r8 = r0 & 32
                    if (r8 == 0) goto L_0x003d
                    com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r8 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                    com.hansecom.abt.util.resourcesResolvers.StringValue r8 = r8.a()
                    goto L_0x003f
                L_0x003d:
                    r8 = r29
                L_0x003f:
                    r9 = r0 & 64
                    if (r9 == 0) goto L_0x0045
                    r9 = r4
                    goto L_0x0047
                L_0x0045:
                    r9 = r30
                L_0x0047:
                    r10 = r0 & 128(0x80, float:1.794E-43)
                    if (r10 == 0) goto L_0x0052
                    com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r10 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                    com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r10.a()
                    goto L_0x0054
                L_0x0052:
                    r10 = r31
                L_0x0054:
                    r11 = r0 & 256(0x100, float:3.59E-43)
                    if (r11 == 0) goto L_0x005a
                    r11 = 0
                    goto L_0x005c
                L_0x005a:
                    r11 = r32
                L_0x005c:
                    r13 = r0 & 512(0x200, float:7.175E-43)
                    if (r13 == 0) goto L_0x0062
                    r13 = r4
                    goto L_0x0064
                L_0x0062:
                    r13 = r33
                L_0x0064:
                    r14 = r0 & 1024(0x400, float:1.435E-42)
                    if (r14 == 0) goto L_0x006f
                    com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r14 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                    com.hansecom.abt.util.resourcesResolvers.StringValue r14 = r14.a()
                    goto L_0x0071
                L_0x006f:
                    r14 = r34
                L_0x0071:
                    r15 = r0 & 2048(0x800, float:2.87E-42)
                    if (r15 == 0) goto L_0x0076
                    goto L_0x0078
                L_0x0076:
                    r2 = r35
                L_0x0078:
                    r15 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r15 == 0) goto L_0x007e
                    r15 = 0
                    goto L_0x0080
                L_0x007e:
                    r15 = r36
                L_0x0080:
                    r12 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r12 == 0) goto L_0x0086
                    r12 = r4
                    goto L_0x0088
                L_0x0086:
                    r12 = r37
                L_0x0088:
                    r47 = r4
                    r4 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r4 == 0) goto L_0x0095
                    com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r4 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                    com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r4.a()
                    goto L_0x0097
                L_0x0095:
                    r4 = r38
                L_0x0097:
                    r16 = 32768(0x8000, float:4.5918E-41)
                    r16 = r0 & r16
                    if (r16 == 0) goto L_0x00a1
                    r16 = r47
                    goto L_0x00a3
                L_0x00a1:
                    r16 = r39
                L_0x00a3:
                    r17 = 65536(0x10000, float:9.18355E-41)
                    r17 = r0 & r17
                    if (r17 == 0) goto L_0x00b0
                    com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r17 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                    com.hansecom.abt.util.resourcesResolvers.StringValue r17 = r17.a()
                    goto L_0x00b2
                L_0x00b0:
                    r17 = r40
                L_0x00b2:
                    r18 = 131072(0x20000, float:1.83671E-40)
                    r18 = r0 & r18
                    if (r18 == 0) goto L_0x00bb
                    r18 = 0
                    goto L_0x00bd
                L_0x00bb:
                    r18 = r41
                L_0x00bd:
                    r19 = 262144(0x40000, float:3.67342E-40)
                    r19 = r0 & r19
                    if (r19 == 0) goto L_0x00c6
                    r19 = r47
                    goto L_0x00c8
                L_0x00c6:
                    r19 = r42
                L_0x00c8:
                    r20 = 524288(0x80000, float:7.34684E-40)
                    r20 = r0 & r20
                    if (r20 == 0) goto L_0x00d5
                    com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r20 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                    com.hansecom.abt.util.resourcesResolvers.StringValue r20 = r20.a()
                    goto L_0x00d7
                L_0x00d5:
                    r20 = r43
                L_0x00d7:
                    r21 = 1048576(0x100000, float:1.469368E-39)
                    r21 = r0 & r21
                    if (r21 == 0) goto L_0x00e0
                    r21 = 0
                    goto L_0x00e2
                L_0x00e0:
                    r21 = r44
                L_0x00e2:
                    r22 = 2097152(0x200000, float:2.938736E-39)
                    r0 = r0 & r22
                    if (r0 == 0) goto L_0x00ea
                    r0 = 0
                    goto L_0x00ec
                L_0x00ea:
                    r0 = r45
                L_0x00ec:
                    r24 = r23
                    r25 = r1
                    r26 = r3
                    r27 = r5
                    r28 = r6
                    r29 = r7
                    r30 = r8
                    r31 = r9
                    r32 = r10
                    r33 = r11
                    r34 = r13
                    r35 = r14
                    r36 = r2
                    r37 = r15
                    r38 = r12
                    r39 = r4
                    r40 = r16
                    r41 = r17
                    r42 = r18
                    r43 = r19
                    r44 = r20
                    r45 = r21
                    r46 = r0
                    r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.Register.State.UserInfoStep.<init>(boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }
    }
}
