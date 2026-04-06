package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class RegexKt$fromInt$1$1 implements Function1<Enum<Object>, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f41178z;

    /* renamed from: b */
    public final Boolean invoke(Enum enumR) {
        FlagEnum flagEnum = (FlagEnum) enumR;
        return Boolean.valueOf((this.f41178z & flagEnum.d()) == flagEnum.getValue());
    }
}
