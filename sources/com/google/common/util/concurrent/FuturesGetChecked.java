package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@ElementTypesAreNonnullByDefault
final class FuturesGetChecked {

    /* renamed from: a  reason: collision with root package name */
    public static final Ordering f29511a = Ordering.e().i(new Function<Constructor<?>, Boolean>() {
        /* renamed from: a */
        public Boolean apply(Constructor constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }).j();

    public interface GetCheckedTypeValidator {
    }

    public static class GetCheckedTypeValidatorHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final GetCheckedTypeValidator f29512a = a();

        public enum WeakSetValidator implements GetCheckedTypeValidator {
            INSTANCE;
            

            /* renamed from: A  reason: collision with root package name */
            public static final Set f29513A = null;

            static {
                f29513A = new CopyOnWriteArraySet();
            }
        }

        public static GetCheckedTypeValidator a() {
            return FuturesGetChecked.a();
        }
    }

    public static GetCheckedTypeValidator a() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }
}
