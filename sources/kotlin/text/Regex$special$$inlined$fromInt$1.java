package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class Regex$special$$inlined$fromInt$1 implements Function1<RegexOption, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f41175z;

    /* renamed from: b */
    public final Boolean invoke(Enum enumR) {
        FlagEnum flagEnum = (FlagEnum) enumR;
        return Boolean.valueOf((this.f41175z & flagEnum.d()) == flagEnum.getValue());
    }
}
