package dagger.hilt.android.flags;

import dagger.Module;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

public final class FragmentGetContextFix {

    @Qualifier
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    public @interface DisableFragmentGetContextFix {
    }

    public interface FragmentGetContextFixEntryPoint {
    }

    @Module
    public static abstract class FragmentGetContextFixModule {
    }
}
