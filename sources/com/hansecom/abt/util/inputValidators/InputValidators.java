package com.hansecom.abt.util.inputValidators;

import com.hansecom.abt.data.useCases.configurations.GetRegularExpressionUseCase;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata
public final class InputValidators {

    /* renamed from: a  reason: collision with root package name */
    public final GetRegularExpressionUseCase f39053a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f39054b = LazyKt.b(new a());

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f39055c = LazyKt.b(new d(this));

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f39056d = LazyKt.b(new e(this));

    /* renamed from: e  reason: collision with root package name */
    public final Lazy f39057e = LazyKt.b(new f(this));

    /* renamed from: f  reason: collision with root package name */
    public final Lazy f39058f = LazyKt.b(new g(this));

    /* renamed from: g  reason: collision with root package name */
    public final Lazy f39059g = LazyKt.b(new h(this));

    /* renamed from: h  reason: collision with root package name */
    public final Lazy f39060h = LazyKt.b(new i(this));

    /* renamed from: i  reason: collision with root package name */
    public final Lazy f39061i = LazyKt.b(new j(this));

    /* renamed from: j  reason: collision with root package name */
    public final Lazy f39062j = LazyKt.b(new k(this));

    /* renamed from: k  reason: collision with root package name */
    public final Lazy f39063k = LazyKt.b(new b(this));

    /* renamed from: l  reason: collision with root package name */
    public final Lazy f39064l = LazyKt.b(new c(this));

    @Metadata
    public static final class EqualInputValidator implements InputValidator {

        /* renamed from: a  reason: collision with root package name */
        public final Function0 f39065a;

        public EqualInputValidator(Function0 function0) {
            Intrinsics.i(function0, "block");
            this.f39065a = function0;
        }

        public boolean a(String str) {
            Intrinsics.i(str, "input");
            return Intrinsics.d(str, this.f39065a.invoke());
        }
    }

    @Metadata
    public interface InputValidator {
        boolean a(String str);
    }

    @Metadata
    public static final class NonEmptyValidator implements InputValidator {
        public boolean a(String str) {
            Intrinsics.i(str, "input");
            return str.length() > 0;
        }
    }

    @Metadata
    public static final class RegexInputValidator implements InputValidator {

        /* renamed from: a  reason: collision with root package name */
        public final Regex f39066a;

        public RegexInputValidator(Regex regex) {
            Intrinsics.i(regex, "regex");
            this.f39066a = regex;
        }

        public boolean a(String str) {
            Intrinsics.i(str, "input");
            return this.f39066a.d(str);
        }
    }

    public InputValidators(GetRegularExpressionUseCase getRegularExpressionUseCase) {
        Intrinsics.i(getRegularExpressionUseCase, "getRegularExpressionUseCase");
        this.f39053a = getRegularExpressionUseCase;
    }

    public static final NonEmptyValidator A(InputValidators inputValidators) {
        return inputValidators.v();
    }

    public static final NonEmptyValidator B(InputValidators inputValidators) {
        return inputValidators.v();
    }

    public static final RegexInputValidator C(InputValidators inputValidators) {
        return new RegexInputValidator(inputValidators.f39053a.d().d());
    }

    public static final NonEmptyValidator D() {
        return new NonEmptyValidator();
    }

    public static final RegexInputValidator E(InputValidators inputValidators) {
        return new RegexInputValidator(inputValidators.f39053a.d().e());
    }

    public static final RegexInputValidator F(InputValidators inputValidators) {
        return new RegexInputValidator(inputValidators.f39053a.d().f());
    }

    public static final RegexInputValidator G(InputValidators inputValidators) {
        return new RegexInputValidator(inputValidators.f39053a.d().g());
    }

    public static final RegexInputValidator H(InputValidators inputValidators) {
        return inputValidators.q();
    }

    public static final RegexInputValidator l(InputValidators inputValidators) {
        return new RegexInputValidator(inputValidators.f39053a.d().a());
    }

    public static final RegexInputValidator m(InputValidators inputValidators) {
        return new RegexInputValidator(inputValidators.f39053a.d().b());
    }

    public static final RegexInputValidator o(InputValidators inputValidators) {
        return new RegexInputValidator(inputValidators.f39053a.d().c());
    }

    public final InputValidator n(Function0 function0) {
        Intrinsics.i(function0, "block");
        return new EqualInputValidator(function0);
    }

    public final InputValidator p() {
        return (InputValidator) this.f39059g.getValue();
    }

    public final RegexInputValidator q() {
        return (RegexInputValidator) this.f39055c.getValue();
    }

    public final InputValidator r() {
        return (InputValidator) this.f39057e.getValue();
    }

    public final InputValidator s() {
        return (InputValidator) this.f39062j.getValue();
    }

    public final InputValidator t() {
        return (InputValidator) this.f39061i.getValue();
    }

    public final InputValidator u() {
        return (InputValidator) this.f39058f.getValue();
    }

    public final NonEmptyValidator v() {
        return (NonEmptyValidator) this.f39054b.getValue();
    }

    public final RegexInputValidator w() {
        return (RegexInputValidator) this.f39064l.getValue();
    }

    public final InputValidator x() {
        return (InputValidator) this.f39056d.getValue();
    }

    public final InputValidator y() {
        return (InputValidator) this.f39060h.getValue();
    }

    public final RegexInputValidator z() {
        return (RegexInputValidator) this.f39063k.getValue();
    }
}
